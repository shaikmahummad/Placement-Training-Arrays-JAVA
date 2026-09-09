public class PQ {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        pq.add(62);
        pq.add(5);
        pq.add(82);
        pq.add(74);
        pq.add(45);
        pq.add(1);
        pq.add(9);
        System.out.println("Priority Queue: " + pq);
        System.out.println("Peek: " + pq.peek());
        while (!pq.isEmpty()) {
            System.out.println("Poll: " + pq.poll());
        }
        System.out.println("Priority Queue after poll: " + pq);
    }
}