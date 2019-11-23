package d22从上往下打印二叉树;

import java.util.ArrayList;

/**
 * 从上往下打印二叉树
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 
 * 思路:
 * 用一个arraylist来模拟队列
 * @author 77515
 *
 */
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	ArrayList<TreeNode> tree = new ArrayList<TreeNode>();
    	if(root == null){
    		return arr;
    	}
    	tree.add(root);
    	while(tree.size() > 0){
    		//tree.remove(0)相当于弹栈操作
    		TreeNode t = tree.remove(0);
    		arr.add(t.val);
    		if(t.left != null){
    			tree.add(t.left);
    		}
    		if(t.right != null){
    			tree.add(t.right);
    		}
    	}
        
        return arr;
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