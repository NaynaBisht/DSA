package LeetCode;
// 3217. Delete Nodes From Linked List Present in Array
/*You are given an array of integers nums and the head of a linked list. Return the head of the modified linked list after removing all nodes from the linked list that have a value that exists in nums.*/

public class DeleteNodes_3217 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int[] nums = {2, 4};

        DeleteNodes_3217 sol = new DeleteNodes_3217();
        ListNode modifiedHead = sol.modifiedList(nums, head);

        printList(modifiedHead);
    }
    public ListNode modifiedList(int[] nums, ListNode head){
//        10^5 is limit +1
        boolean set[] = new boolean[(int)1e5+1];
        for (int num:nums) {
            set[num] = true;
        }
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            if (set[cur.val]==true){
                if(prev==null){
//                    del at head
                    head = cur.next;
                    cur.next = null;
                    cur = head;
                } else{
                    prev.next = cur.next;
                    cur.next = null;
                    cur = prev.next;
                }
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        return head;
    }
    public static void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.println(current.val+" ");
            current = current.next;
        }
    }
}
