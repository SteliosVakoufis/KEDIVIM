public class MainApp {
    public static void main(String[] args) {
        var node1 = new ListNode(1);
        var node2 = new ListNode(2);
        var node3 = new ListNode(3);
        var node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.printf("%s, %s, %s, %s\n", node1, node2, node3, node4);

        Solution.reverseList(node1);

        System.out.printf("%s, %s, %s, %s\n", node4, node3, node2, node1);
    }
}
