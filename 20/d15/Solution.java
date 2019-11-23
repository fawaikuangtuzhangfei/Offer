package d15;


/**
 * 反转链表
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 
 * 思路1：递归
 * 利用栈的特性
 * @author 77515
 *
 */
public class Solution {
	public static ListNode ReverseList(ListNode head) {
		if(head == null || head.next == null){
			return head;
		}
		ListNode now = head.next;
		head.next = null;
		ListNode newListNode = ReverseList(now);
		now.next = head;
		return newListNode;
    }

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}