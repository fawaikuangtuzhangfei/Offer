package d38二叉树的深度;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * 
 * 树的层次遍历
经典的非递归层次遍历：利用辅助队列，先将头节点入队列，当队列不空时出队列的节点记为current，
当current左节点不空时入队列，其右节点不空时入队列，如此循环即可。
求深度：构造变量cur记录当前层访问到的节点数，width记录当前层的总个数，每当访问过一层层数deep++；
 * @author nanshoudabaojian
 *
 */
public class Solution2 {
    public int TreeDepth(TreeNode root) {
    	if(root == null){
    		return 0;
    	}
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.add(root);
    	int deep = 0; // 深度
    	int width = 0; //当前行元素的个数
    	int cur = 0; //现在是第几个
    	while(!queue.isEmpty()){
    		cur = 0; //新的一行的第一个
    		width = queue.size();
    		while(cur < width){  //直到走完这层的
    			TreeNode node = queue.poll();
    			if(node.left != null){
        			queue.add(node.left);
        		}
        		if(node.right != null){
        			queue.add(node.right);
        		}
        		cur++;//走完一个了
    		}
    		deep++;//深度+1
    	}
    	return deep;
    }
}
