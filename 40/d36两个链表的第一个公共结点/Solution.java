package d36两个链表的第一个公共结点;

import java.util.ArrayList;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 * 
 * 思路:
 * 利用ArrayList的contains方法
 * 先把第一个链表的所有值放入 然后循环第二个链表 利用contains方法检查
 * @author nanshoudabaojian
 *
 */
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	if(pHead1 == null || pHead2 == null){
    		return null;
    	}
    	ListNode result = null;
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	ListNode node = pHead1;
    	while(node != null){
    		list.add(node.val);
    		node = node.next;
    	}
    	node = pHead2;
    	while(node != null){
    		if(list.contains(node.val)){
    			result = node;
    			break;
    		}
    		node = node.next;
    	}
    	return result;
    }
}




class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

