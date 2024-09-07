package LeetCode;
/*Return True if all the elements in the linked list starting from the head correspond to some downward path connected in the binary tree otherwise return False.*/

public class LinkedListInBinaryTree_1367 {
    public static void main(String[] args) {
        // Example linked list: 1 -> 4 -> 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);

        // Example binary tree:
        /*
                  1
                 / \
                4   4
               /   / \
              2   1   6
             /
            6
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(6);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(6);

        // Create an instance of the solution class and call the method
        LinkedListInBinaryTree_1367 solution = new LinkedListInBinaryTree_1367();
        boolean result = solution.isSubPath(head, root);
        System.out.println("Is the linked list a subpath in the binary tree? " + result);

    }
    public boolean dfs(ListNode head, TreeNode node){
        if(head==null) return true;
        if(node==null) return false;
        if(head.val != node.val) return false;
        return dfs(head.next, node.left) || dfs(head.next, node.right);
    }
    public boolean isSubPath(ListNode head, TreeNode root){
        if(root == null) return false;

        if (root.val == head.val){
            if (dfs(head,root))
                return true;
        }
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }
}
