package d22从上往下打印二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印二叉树
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 
 * 思路:
 * 利用一个队列来实现即可，该队列储存该层的所有节点
 * 在开始遍历一层的节点时，当前队列中的节点数就是当前层的节点数，
 * 只要控制遍历这么多节点数，就能保证这次遍历的都是当前层的节点。
 * @author 77515
 *
 */
public class Solution2 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
        	int size = queue.size();
        	while(size-- > 0){
        		TreeNode tree = queue.poll();
        		if(tree == null){
        			continue;
        		}
        		arr.add(tree.val);
        		queue.add(tree.left);
        		queue.add(tree.right);
        	}
        }
        return arr;
    }
}
