import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class ServerMonitoringSystem {

    static StringBuffer logBuffer = new StringBuffer();
    static AtomicInteger webCount = new AtomicInteger(0);
    static AtomicInteger dbCount = new AtomicInteger(0);
    static AtomicInteger cacheCount = new AtomicInteger(0);
    static AtomicInteger apiCount = new AtomicInteger(0);

    static class ServiceThread extends Thread {
        String serviceName;
        int sleepTime;
        AtomicInteger counter;

        ServiceThread(String serviceName, int sleepTime, AtomicInteger counter) {
            this.serviceName = serviceName;
            this.sleepTime = sleepTime;
            this.counter = counter;
        }

        public void run() {
            String[] levels = {"INFO", "WARNING", "ERROR"};
            for (int i = 1; i <= 10; i++) {
                String timestamp = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
                String level = levels[(int) (Math.random() * levels.length)];
                String message = "[" + timestamp + "] [" + serviceName + "] [" + level + "] Message " + i;
                synchronized (logBuffer) {
                    logBuffer.append(message).append("\n");
                }
                counter.incrementAndGet();
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread web = new ServiceThread("Web Server", 100, webCount);
        Thread db = new ServiceThread("Database", 150, dbCount);
        Thread cache = new ServiceThread("Cache", 80, cacheCount);
        Thread api = new ServiceThread("API Gateway", 120, apiCount);

        web.start();
        db.start();
        cache.start();
        api.start();

        web.join();
        db.join();
        cache.join();
        api.join();

        System.out.println("Consolidated Logs:\n");
        System.out.println(logBuffer.toString());

        System.out.println("Log Entry Count Per Service:");
        System.out.println("Web Server: " + webCount.get());
        System.out.println("Database  : " + dbCount.get());
        System.out.println("Cache     : " + cacheCount.get());
        System.out.println("API Gateway: " + apiCount.get());
    }
}
