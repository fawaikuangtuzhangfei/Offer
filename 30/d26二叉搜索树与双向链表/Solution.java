package d26二叉搜索树与双向链表;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉搜索树与双向链表
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * tips:二叉搜索树->左小于根小于右; 双向链表:直接前驱-当前结点-直接后继
 * 
 * 思路:
 * 中序遍历时保存前驱和后继->形成链表
 * 1.中序遍历时利用数组保存遍历的结果
 * 2.形成链表
 * 
 * 不足:
 * 中序遍历不熟悉->
 * 利用栈 eg:   2
 * 			1    3
 * 中历遍历(弹栈)顺序为:1 2 3
 * 所以压栈 2 1 3 
 * 先将头压入栈中，不断的去向左移动直到为null->弹栈 以此结点向右移动 直到再次为null->
 * 弹栈 以此结点向右移动 直到再次为null.....
 * 中止的条件是栈为空且当前结点是null->也就是整棵树遍历完成
 * @author nanshoudabaojian
 *
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

}

public class Solution {
	public static void main(String[] args) {
		TreeNode test = new TreeNode(2);
		TreeNode left = new TreeNode(1);
		TreeNode right = new TreeNode(3);
		test.left = left;
		test.right = right;
		System.out.println(Convert(test));
	}
	
	private static List<TreeNode> list = new ArrayList<TreeNode>();
	
    public static TreeNode Convert(TreeNode pRootOfTree) {
    	inorderTree(pRootOfTree);
    	//   2
    	//1    3   ->结果是1 2 3 null
    	if(list.size() == 0 || list.size() == 1){
    		return pRootOfTree;
    	}
    	//list中的值为 1 2 3
    	for(int i=0; i<list.size() - 1; i++){
    		list.get(i).right = list.get(i+1);
    		list.get(i+1).left = list.get(i);
    	}
    	
    	return list.get(0);
    }
    
    //非递归中序遍历输入的二叉搜索树
    public static void inorderTree(TreeNode head){
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	if(head != null){
    		while(!stack.isEmpty() || head != null){
    			//		2 
    			//1          3
    			//stack 2    2 1     1  2  3
    			if(head != null){
    				stack.push(head);
    				head = head.left;
    			}else{
    				head = stack.pop();
    				list.add(head);
    				head = head.right;
    			}
    		}
    	}
    }
}
