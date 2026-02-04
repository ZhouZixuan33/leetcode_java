public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }

    public boolean check(TreeNode p, TreeNode q){
        if (p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        SymmetricTree result = new SymmetricTree();

        System.out.println(result.isSymmetric(root));
    }
}
