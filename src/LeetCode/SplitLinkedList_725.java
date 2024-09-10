package LeetCode;
/*Split Linked List in Parts :
* Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.
The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null. */
public class SplitLinkedList_725 {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);

        int k = 4; // We want to split the list into 3 parts

        // Call the method to split the list
        SplitLinkedList_725 solution = new SplitLinkedList_725();
        ListNode[] result = solution.splitListToParts(head, k);

        // Print the result
        for (int i = 0; i < result.length; i++) {
            System.out.print("Part " + (i+1) + ": ");
            ListNode temp = result[i];
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public ListNode[] splitListToParts(ListNode head, int k){
        ListNode temp = head;
        int size = 0;
//        to calculte size of linked list
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        ListNode res[] = new ListNode[k];
        temp = head;
        int avg = size/k;
        int extra = size%k;
        for (int i = 0; i <k; i++) {
            if(temp==null) break;
            ListNode curHead = temp;
            ListNode prev = null;
            int len=0;
            while(temp!=null && len<avg){
                prev = temp;
                temp = temp.next;
                len++;
            }
            if(extra>0){
                prev = temp;
                temp = temp.next;
                extra--;
            }
            prev.next = null; // detach prev list
            res[i] = curHead; //insert head
        }
        return res;
    }
}
