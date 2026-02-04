public class InvertingTree {
    public TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }

        TreeNode newLeft = invertTree(root.left);
        TreeNode newRight = invertTree(root.right);
        root.left = newRight;
        root.right = newLeft;

        return root;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        InvertingTree result = new InvertingTree();

        TreeNode output = result.invertTree(root);

        System.out.println(output.val);
        System.out.println(output.left.val);
        System.out.println(output.right.val);
    }
}
