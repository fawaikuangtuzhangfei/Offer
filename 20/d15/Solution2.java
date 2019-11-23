package d15;


/**
 * 反转链表
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 
 * 思路1：
 * 设置两个指针，实现反转
 * @author 77515
 *
 */
public class Solution2 {
	public static ListNode ReverseList(ListNode head) {
		ListNode pre = null;
		ListNode next = null;
		//next永远指向head的下一位;head的next永远指向前一位
		//pre永远等于head,head等于next的当前位置
		while(head != null){
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
    }

}

