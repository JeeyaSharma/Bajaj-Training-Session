public class linkedListCycle2 {
    public ListNode detectCycle(ListNode h) {
        ListNode p = h, q = h;
        boolean b = false;
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                b = true;
                break;
            }
        }
        if (!b) return null;
        p = h;
        while (p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
