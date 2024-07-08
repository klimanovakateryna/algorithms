public class LowestCommonAncestor {
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

        public static TreeNode findLowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
            TreeNode current = root;

            while (root != null){
                if ((p.val > current.val) && (q.val > current.val)){
                    current = current.right;
                } else if ((p.val < current.val) && (q.val < current.val)){
                    current = current.left;
                } else {
                    return current;
                }
            }
            return null;
        }

        public static void main(String[] args) {
            TreeNode root = new TreeNode(6);
            root.left = new TreeNode(2);
            root.right = new TreeNode(8);
            root.left.left = new TreeNode(0);
            root.left.right = new TreeNode(4);
            root.left.right.left = new TreeNode(3);
            root.left.right.right = new TreeNode(5);
            root.right.left = new TreeNode(7);
            root.right.right = new TreeNode(9);

            TreeNode p = root.left;
            TreeNode q = root.right; 

            TreeNode lca = findLowestCommonAncestor(root, p, q);

            System.out.println(lca.val);
        }
}
