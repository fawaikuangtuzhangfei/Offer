package d62二叉搜索树的第k个结点;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 * 二叉搜索树 左<中<右 所以中序遍历就是递增的
 * 第k个就是第k个
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020年7月3日 下午3:50:04
 */
public class Solution {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
    	if(k == 0 || pRoot == null){
    		return null;
    	}
    	List<TreeNode> list = new ArrayList<>();
    	Stack<TreeNode> stack = new Stack<>();
    	
        while(pRoot != null || !stack.isEmpty()){
        	if(pRoot != null){
        		stack.add(pRoot);
        		pRoot = pRoot.left;
        	}else{
        		pRoot = stack.pop();
        		list.add(pRoot);
        		pRoot = pRoot.right;
        	}
        }
        if(k > list.size()){
        	return null;
        }
        return list.get(k-1);
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
