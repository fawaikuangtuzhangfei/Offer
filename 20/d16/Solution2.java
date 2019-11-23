package d16;

/**
 * 合并两个排序的链表
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * 
 * 思路:
 * 递归简介版本
 * 思路一致，若1<2则1的头节点不变，1的下一个节点为
 * -1 若1<2 则此时该节点为上一步1的下一个节点 继续重复
 * -2 若1>2 则此时2节点为上一步1的下一个节点 继续重复
 * 
 * @author 77515
 *
 */
public class Solution2 {
	public ListNode Merge(ListNode list1,ListNode list2) {
		if(list1 == null){
			return list2;
		}
		if(list2 == null){
			return list1;
		}
		if(list1.val < list2.val){
			list1.next = Merge(list1.next, list2);
			return list1;
		}else{
			list2.next = Merge(list1, list2.next);
			return list2;
		}
    }
}
