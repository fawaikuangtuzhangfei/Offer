package d04;

/**
 * 题目:重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * 
 * 思路1:
 * 先顺序遍历先序，找到的都为根节点，然后顺序遍历中序，找到与根节点相同的元素，则此节点左边的为左子树，
 * 右边的为右子树，不断的进行分离树
 * @author 77515
 *
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode tree = reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
        
        return tree;
    }
    
    private TreeNode reConstructBinaryTree(int [] pre, int startPre, int endPre, int [] in, int startIn, int endIn){
    	
    	//递归结束条件
    	if(startPre > endPre || startIn > endIn){
    		return null;
    	}
    	
    	int root = pre[startPre]; //总根节点
    	//以root为根的树 
    	TreeNode tree = new TreeNode(root);
    	int nowRootIndex = 0; //目前的根节点
    	//遍历中序,查询目前的根节点
    	for(int i=startIn; i<=endIn; i++){
    		if(in[i] == root){
    			nowRootIndex = i;
    			break;
    		}
    	}
    	//当前的根节点下的左右子树
    	int leftCount = nowRootIndex - startIn;
    	int rightCount = endIn - nowRootIndex;
    	
    	//继续递归调用
    	tree.left = reConstructBinaryTree(pre, startPre+1, startPre+leftCount, in, startIn, nowRootIndex-1);
    	tree.right = reConstructBinaryTree(pre, startPre+leftCount+1, endPre, in, nowRootIndex+1, endIn);
    	
    	return tree;
    	
    }
}



//Definition for binary tree
  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
