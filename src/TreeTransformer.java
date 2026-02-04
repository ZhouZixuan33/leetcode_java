public class TreeTransformer {

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    public TreeNode helper(int [] array, int left, int right){
        if(left > right){
            return null;
        }

        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(array[mid]);
        root.left = helper(array, left, mid-1);
        root.right = helper(array, mid+1, right);

        return root;
    }

    public static void main(String[] args){
        int[] arr1 = {-10, -3, 0, 5, 9};

        TreeTransformer result = new TreeTransformer();
        TreeNode output = result.sortedArrayToBST(arr1);

        System.out.println(output.val);
        System.out.println(output.left.val);
        System.out.println(output.right.val);
    }
}
