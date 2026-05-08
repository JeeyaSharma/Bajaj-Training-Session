public class linkedListCycle {
    public boolean hasCycle(ListNode h) {
        if (h == null || h.next == null) {
            return false;
        }
        ListNode p = h;
        ListNode q = h.next;
        while (p != q) {
            if (q == null || q.next == null) {
                return false;
            }
            p = p.next;
            q = q.next.next;
        }
        return true;
    }
}
