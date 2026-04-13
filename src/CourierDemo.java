import java.util.*;

class Parcel implements Comparable<Parcel> {
    String id;
    int priority;

    public Parcel(String id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public int compareTo(Parcel p) {
        return p.priority - this.priority;
    }

    public String toString() {
        return "Parcel " + id + " (Priority: " + priority + ")";
    }
}

public class CourierDemo {
    public static void main(String[] args) {
        PriorityQueue<Parcel> priorityQueue = new PriorityQueue<>();
        Queue<Parcel> normalQueue = new LinkedList<>();
        Set<String> assignedIds = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();

        addParcel(priorityQueue, normalQueue, assignedIds, new Parcel("P1", 3));
        addParcel(priorityQueue, normalQueue, assignedIds, new Parcel("P2", 1));
        addParcel(priorityQueue, normalQueue, assignedIds, new Parcel("P3", 5));
        addParcel(priorityQueue, normalQueue, assignedIds, new Parcel("P2", 4));

        while (!priorityQueue.isEmpty() || !normalQueue.isEmpty()) {
            Parcel current;

            if (!priorityQueue.isEmpty()) {
                current = priorityQueue.poll();
            } else {
                current = normalQueue.poll();
            }

            System.out.println("Delivering: " + current);
            completed.add(current);
        }

        System.out.println("\nCompleted Deliveries:");
        for (Parcel p : completed) {
            System.out.println(p);
        }
    }

    public static void addParcel(PriorityQueue<Parcel> pq, Queue<Parcel> nq, Set<String> ids, Parcel p) {
        if (ids.contains(p.id)) {
            System.out.println("Duplicate ID skipped: " + p.id);
            return;
        }

        ids.add(p.id);

        if (p.priority > 2) {
            pq.add(p);
        } else {
            nq.add(p);
        }
    }
}
