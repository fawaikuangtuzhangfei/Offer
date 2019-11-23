package d14;

/**
 * 链表中倒数第k个结点
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 
 * 思路1:
 * n-k+k=n
 * 设置两个指针，一个指针从头开始走k步，则还剩n-k项，此时指针2开始出发，
 * 直到指针1走到末尾为止。也就是说指针2走了n-k步，指针1走了k步也走了n-k步那么距离末尾就是k步
 * 
 * @author 77515
 *
 */
public class Solution {
	public ListNode FindKthToTail(ListNode head,int k) {
		ListNode head1 = head;
		while(head != null && k-- > 0){
			head = head.next;
		}
		//若k比head的长度都长 返回null
		if(k > 0){
			return null;
		}
		while(head != null){
			head = head.next;
			head1 = head1.next;
		}
		return head1;
    }
}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}