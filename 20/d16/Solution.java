package d16;

/**
 * 合并两个排序的链表
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * 
 * 思路:
 * 边比较边合成
 * 若1的值小于2的值，则1的头节点为新链表3的头节点，若链表1的值大于链表2的值，则链表2的头节点为剩下节点
 * 的头节点，连接起来
 * @author 77515
 *
 */
public class Solution {
	public ListNode Merge(ListNode list1,ListNode list2) {
		if(list1 == null){
			return list2;
		}
		if(list2 == null){
			return list1;
		}
		ListNode result = null;
		if(list1.val < list2.val){
			result = list1;
			result.next = Merge(list1.next, list2);
		}else{
			result = list2;
			result.next = Merge(list1, list2.next);
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