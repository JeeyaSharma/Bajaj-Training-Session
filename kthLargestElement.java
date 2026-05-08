import java.util.PriorityQueue;

public class kthLargestElement {
    public int findKthLargest(int[] a, int v) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int x : a) {
            p.add(x);
            if (p.size() > v) {
                p.poll();
            }
        }
        return p.peek();
    }
}
