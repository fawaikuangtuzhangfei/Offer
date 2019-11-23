package d15;


/**
 * ��ת����
 * ����һ��������ת��������������ı�ͷ��
 * 
 * ˼·1���ݹ�
 * ����ջ������
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