public class InvertBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void traversal(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.val + " ");
        traversal(node.left);
        traversal(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(4);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        System.out.println("Original tree: ");
        traversal(root);
        
        System.out.println("\nInverted tree: ");
        invertTree(root);
        traversal(root);



    }

}


// Invert Binary Tree
// Visit a node, take a look at its two children, and swipe the positions of
// them
// Recursively run the invert tree on the left subtree and then on right subtree
// Use Depth First Search