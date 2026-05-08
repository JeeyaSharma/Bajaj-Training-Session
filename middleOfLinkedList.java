public class middleOfLinkedList {
    public ListNode middleNode(ListNode t) {
        ListNode s = t, f = t;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
}
