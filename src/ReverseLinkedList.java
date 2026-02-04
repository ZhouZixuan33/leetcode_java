public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode curr = head;
        ListNode next = curr.next;
        ListNode prev = null;

        curr.next = prev;

        while(next != null){
            prev = curr;
            curr = next;
            next = curr.next;
            curr.next = prev;
        }
        return curr;
    }

    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        // 2. Chain them together
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        ReverseLinkedList result = new ReverseLinkedList();
        ListNode output = result.reverseList(node1);

        System.out.print(output.val + " ");
        System.out.print(output.next.val + " ");
        System.out.print(output.next.next.val + " ");
        System.out.print(output.next.next.next.val + " ");
        System.out.print(output.next.next.next.next.val + " ");
    }
}
