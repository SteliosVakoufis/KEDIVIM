class Solution {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode prevNode = null;
        ListNode middleNode = head;
        ListNode nextNode = head.next;

        while (true) {
            middleNode.next = prevNode;
            prevNode = middleNode;
            middleNode = nextNode;

            if (middleNode.next != null) {
                nextNode = middleNode.next;
            } else {
                middleNode.next = prevNode;
                break;
            }
        }

        return middleNode;
    }
}
