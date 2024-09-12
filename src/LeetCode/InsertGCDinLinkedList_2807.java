package LeetCode;

public class InsertGCDinLinkedList_2807 {
    public static void main(String[] args) {
        // Create a sample linked list: 12 -> 15 -> 9
        ListNode head = new ListNode(12);
        head.next = new ListNode(15);
        head.next.next = new ListNode(9);

        // Create an instance of the class
        InsertGCDinLinkedList_2807 solution = new InsertGCDinLinkedList_2807();

        // Call the insertGCD method
        ListNode modifiedHead = solution.insertGCD(head);

        // Print the modified linked list
        printList(modifiedHead);
    }
    public static void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }
    public int findGCD(int a, int b){
        if(b==0) return a;
//        just swap values of b and a%b becoz everytime we do a%b we get a value smaller than b, but we want max,min so swap
        return findGCD(b, a%b);
    }
    public ListNode insertGCD(ListNode head){
        if(head.next==null) return head;
        ListNode cur = head;
        while(cur.next!=null){
            int max = Math.max(cur.val, cur.next.val);
            int min = Math.min(cur.val, cur.next.val);
            int gcd = findGCD(max,min);
            ListNode gcdNode = new ListNode(gcd);

            gcdNode.next = cur.next;
            cur.next = gcdNode;
            cur = gcdNode.next;
        }
        return head;
    }
}
