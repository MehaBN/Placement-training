
// import java.util.*;

// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int val) {
//         this.val = val;
//     }
// }

// public class Solution {

//     public boolean hasCycle(ListNode head) {
//         ListNode slow = head, fast = head;

//         while (fast != null && fast.next != null) {
//             fast = fast.next.next;
//             slow = slow.next;
//             if (fast == slow)
//                 return true;
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number of nodes:");
//         int n = sc.nextInt();

//         if (n == 0) {
//             System.out.println("Has cycle: false");
//             return;
//         }

//         ListNode head = null, tail = null;
//         List<ListNode> nodes = new ArrayList<>();

//         System.out.println("Enter " + n + " node values:");
//         for (int i = 0; i < n; i++) {
//             int val = sc.nextInt();
//             ListNode newNode = new ListNode(val);
//             nodes.add(newNode);
//             if (head == null) {
//                 head = newNode;
//                 tail = newNode;
//             } else {
//                 tail.next = newNode;
//                 tail = newNode;
//             }
//         }

//         System.out.println("Enter position to create cycle (e.g., 0 for head, -1 for no cycle):");
//         int pos = sc.nextInt();

//         if (pos >= 0 && pos < n) {
//             tail.next = nodes.get(pos);  // create cycle
//         }

//         Solution sol = new Solution();
//         boolean result = sol.hasCycle(head);
//         System.out.println("Has cycle: " + result);
//     }
// }