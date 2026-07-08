public class maxHeap {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> maxHeap = new java.util.PriorityQueue<>((a, b) -> b - a);
        maxHeap.add(62);
        maxHeap.add(5);
        maxHeap.add(82);
        maxHeap.add(74);
        maxHeap.add(45);
        maxHeap.add(1);
        maxHeap.add(9);
        System.out.println("Max Heap: " + maxHeap);
        System.out.println("Peek: " + maxHeap.peek());
        while (!maxHeap.isEmpty()) {
            System.out.println("Poll: " + maxHeap.poll());
        }
        System.out.println("Max Heap after poll: " + maxHeap);
    }
}