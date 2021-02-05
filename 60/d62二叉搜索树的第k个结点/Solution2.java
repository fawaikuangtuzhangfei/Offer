package d62二叉搜索树的第k个结点;

import java.util.Stack;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 * 
 * 找到第k个直接return，无需list
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020年7月3日 下午3:50:04
 */
public class Solution2 {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
    	if(k == 0 || pRoot == null){
    		return null;
    	}
    	Stack<TreeNode> stack = new Stack<>();
    	int count = 1;
    	
        while(pRoot != null || !stack.isEmpty()){
        	if(pRoot != null){
        		stack.add(pRoot);
        		pRoot = pRoot.left;
        	}else{
        		pRoot = stack.pop();
        		if(k == count++){
        			return pRoot;
        		}
        		pRoot = pRoot.right;
        	}
        }
        return null;
    }


}

