package d36两个链表的第一个公共结点;

import java.util.HashSet;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 * 
 * 思路:
 * 利用HashSet的contains方法
 * 先把第一个链表的所有值放入 然后循环第二个链表 利用contains方法检查
 * HashSet的contains的时间复杂度为O(1) 比LinkList快
 * @author nanshoudabaojian
 *
 */
public class Solution2 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	if(pHead1 == null || pHead2 == null){
    		return null;
    	}
    	ListNode result = null;
    	HashSet<Integer> hash= new HashSet<Integer>();
    	ListNode node = pHead1;
    	while(node != null){
    		hash.add(node.val);
    		node = node.next;
    	}
    	node = pHead2;
    	while(node != null){
    		if(hash.contains(node.val)){
    			result = node;
    			break;
    		}
    		node = node.next;
    	}
    	return result;
    }
}
