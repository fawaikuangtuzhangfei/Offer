package d03;

/**
 * 剑指Offer
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * 思路1:
 * 利用栈的后进先出性质
 * @author 77515
 *
 */
import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        //若listNode不为空，则一直往栈中添加元素
        while(listNode != null){
        	stack.add(listNode.val);
        	listNode = listNode.next;
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        //若栈不为空则出栈
        while(!stack.isEmpty()){
        	list.add(stack.pop());
        }
        
        return list;
    }
}


class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}
