package d39平衡二叉树;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 
 * 平衡二叉树的定义：当二叉树的任意一棵子树的左子树的高度和右子树的高度相差不超过1时，该二叉树为平衡二叉树。
 * 
 * 思路：
 * 是否为一颗二叉树，需要知道以下两个信息
 * 1.左右子树的高度
 * 2.是否为平衡树
 * 
 * @author nanshoudabaojian
 *
 */
public class Solution {
    public static boolean IsBalanced_Solution(TreeNode root) {
    	ReturnTree now = isBalance(root);
    	return now.isBalance;
    }
    
    public static ReturnTree isBalance(TreeNode root){
    	if(root == null){
    		return new ReturnTree(0, true);
    	}
    	ReturnTree left = isBalance(root.left);
    	if(left.isBalance == false){
    		return new ReturnTree(0, false);
    	}
    	ReturnTree right = isBalance(root.right);
    	if(right.isBalance == false){
    		return new ReturnTree(0, false);
    	}
    	if(Math.abs(left.hight - right.hight) > 1){
    		return new ReturnTree(0, false);
    	}
    	//若平衡则此子树的高度为左右子树中最大的+1
    	return new ReturnTree(Math.max(left.hight, right.hight)+1, true);
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

class ReturnTree{
	public int hight;
	public boolean isBalance;
	public ReturnTree(int hight, boolean isBalance){
		this.hight = hight;
		this.isBalance = isBalance;
	}
}


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
