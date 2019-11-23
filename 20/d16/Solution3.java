package d16;

/**
 * 合并两个排序的链表
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * 
 * 思路:非递归版本
 * 设置两个指针
 * @author 77515
 *
 */
public class Solution3 {
	public ListNode Merge(ListNode list1,ListNode list2) {
		//自己设置一个头节点(方便输出)
		ListNode head = new ListNode(-1);
		//设置一个临时变量当着头节点
		ListNode cur = head;
		while(list1 != null && list2 != null){
			if(list1.val < list2.val){
				cur.next = list1;
				list1 = list1.next;
			}else{
				cur.next = list2;
				list2 = list2.next;
			}
			cur = cur.next;
		}
		//若某一链表已经结束 则直接把另一个链表的添加到当前链表上
		if (list1 != null){
			 cur.next = list1;
		}
	       
	    if (list2 != null){
	    	cur.next = list2;
	    }
		return head.next;
    }
}
