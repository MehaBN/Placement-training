class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class cycledetection {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            // If they meet, cycle exists
            if (fast == slow) {
                return true;
            }
        }

        return false; // No cycle
    }

    public static void main(String[] args) {
        // Create nodes
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        // Connect nodes: 1 -> 2 -> 3 -> 4 -> 2 (cycle)
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // creates the cycle

        // Check for cycle
        cycledetection solution = new cycledetection();
        boolean result = solution.hasCycle(head);
        System.out.println("Has cycle: " + result); // Output: true
    }
}


