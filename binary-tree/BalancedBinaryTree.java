class BalancedBinaryTree {

    //Nested TreeNode class 
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public boolean isBalanced(TreeNode root) {
        //If the tree is empty, it's balanced
        if (root == null) {
            return true;
        }

        //Height function returns -1 when the tree is unbalanced
        if(Height(root) == -1){
            return false;
        }

        return true;
    }

    //Function to return the height of a current subtree using recursion
    public int Height(TreeNode root) {
        
        //Base case
        if (root == null){
            return 0;
        }

        //Get heights of left and right subtrees
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        //In case left or right subtrees are unbalanced, return -1
        if(leftHeight == -1 || rightHeight == -1){
            return -1;
        }
        
        //If the heights differ by more than 1, it's unbalanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return - 1;
        }

        //Return the height of this subtree as max(leftHeight, rightHeight) + 1
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BalancedBinaryTree tree = new BalancedBinaryTree();
        boolean result = tree.isBalanced(root);
        System.out.println(result);

    }
}