class P6 {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        int rotations = k % length;
        if (rotations == 0) return head;

        int tailPosition = length - rotations;

        ListNode newTail = head;

        while (tailPosition > 1) {
            newTail = newTail.next;
            tailPosition--;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;
        head = newHead;

        return head;
    }
}
