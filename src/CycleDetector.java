//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.HashSet;
import java.util.Set;

public class CycleDetector {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while(head != null){
            if(!seen.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args){
        // 1. Create the individual nodes
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        // 2. Chain them together
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // 3. Create the cycle (Point -4 back to 2)
        node4.next = node2;

        CycleDetector result = new CycleDetector();

        if(result.hasCycle(node1)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}