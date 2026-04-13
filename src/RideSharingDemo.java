import java.util.*;

class RideRequest implements Comparable<RideRequest> {
    String customer;
    int priority;

    public RideRequest(String customer, int priority) {
        this.customer = customer;
        this.priority = priority;
    }

    public int compareTo(RideRequest r) {
        return r.priority - this.priority;
    }

    public String toString() {
        return customer + " (Priority: " + priority + ")";
    }
}

class Driver {
    String id;
    String name;

    public Driver(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver d = (Driver) o;
        return id.equals(d.id);
    }

    public int hashCode() {
        return id.hashCode();
    }
}

class Ride {
    RideRequest request;
    Driver driver;

    public Ride(RideRequest request, Driver driver) {
        this.request = request;
        this.driver = driver;
    }

    public String toString() {
        return request.customer + " served by " + driver.name;
    }
}

public class RideSharingDemo {
    public static void main(String[] args) {
        Queue<RideRequest> normalQueue = new LinkedList<>();
        PriorityQueue<RideRequest> priorityQueue = new PriorityQueue<>();
        Set<Driver> drivers = new HashSet<>();
        List<Ride> completedRides = new ArrayList<>();

        drivers.add(new Driver("D1", "Aman"));
        drivers.add(new Driver("D2", "Riya"));

        addRequest(normalQueue, priorityQueue, new RideRequest("User1", 1));
        addRequest(normalQueue, priorityQueue, new RideRequest("User2", 5));
        addRequest(normalQueue, priorityQueue, new RideRequest("User3", 2));

        while ((!priorityQueue.isEmpty() || !normalQueue.isEmpty()) && !drivers.isEmpty()) {
            RideRequest req;

            if (!priorityQueue.isEmpty()) {
                req = priorityQueue.poll();
            } else {
                req = normalQueue.poll();
            }

            Driver driver = drivers.iterator().next();
            drivers.remove(driver);

            System.out.println("Assigning " + req + " to " + driver);

            Ride ride = new Ride(req, driver);
            completedRides.add(ride);

            drivers.add(driver);
        }

        System.out.println("\nCompleted Rides:");
        for (Ride r : completedRides) {
            System.out.println(r);
        }
    }

    public static void addRequest(Queue<RideRequest> nq, PriorityQueue<RideRequest> pq, RideRequest r) {
        if (r.priority > 2) {
            pq.add(r);
        } else {
            nq.add(r);
        }
    }
}
