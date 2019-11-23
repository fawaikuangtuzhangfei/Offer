package d39平衡二叉树;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 
 * 平衡二叉树的定义：当二叉树的任意一棵子树的左子树的高度和右子树的高度相差不超过1时，该二叉树为平衡二叉树。
 * 
 * 思路：
 * 获得左右子树的高度 查看高度之差
 * 
 * @author nanshoudabaojian
 *
 */
public class Solution2 {
    public static boolean IsBalanced_Solution(TreeNode root) {
        if(root == null){
        	return true;
        }
        //获取左右最大子树
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        System.out.println(left + ":" + right);
        //如果是叶结点就返回true
        if(root.left == null && root.right == null){
            return true;
        }
        return Math.abs(left - right) <= 1  && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
    //求最大高度
    public static int TreeDepth(TreeNode root){
    	if(root == null){
    		return 0;
    	}
    	int left = TreeDepth(root.left);
    	int right = TreeDepth(root.right);
    	return Math.max(left, right)+1;
    }

    public static void main(String[] args) {
    	TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.left.left.left = new TreeNode(10);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        boolean isBalanced_Solution = IsBalanced_Solution(root);
        System.out.println(isBalanced_Solution);
    }
}

