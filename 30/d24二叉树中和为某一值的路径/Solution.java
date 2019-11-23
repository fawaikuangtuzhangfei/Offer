package d24二叉树中和为某一值的路径;

import java.util.ArrayList;

/**
 * 二叉树中和为某一值的路径
 * 输入一颗二叉树的根节点和一个整数，
 * 打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 * 
 * 思路:
 * 顺着走即可
 * @author 77515
 *
 */
public class Solution {
	private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    	backtracking(root, target, new ArrayList<Integer>());
    	return result;
    }
    public void backtracking(TreeNode root, int target, ArrayList<Integer>path){
    	if(root == null){
    		return;
    	}
    	target -= root.val;
    	path.add(root.val);
    	if(target == 0 && root.left == null && root.right == null){
    		//每次都新建一个path 预防值传递污染上一个path
    		result.add(new ArrayList<>(path));
    	}else{
    		backtracking(root.left, target, path);
    		backtracking(root.right, target, path);
    	}
    	//递归到叶子节点还没结果就需要回退
    	path.remove(path.size() - 1);
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