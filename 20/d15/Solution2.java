package d15;


/**
 * ��ת����
 * ����һ��������ת��������������ı�ͷ��
 * 
 * ˼·1��
 * ��������ָ�룬ʵ�ַ�ת
 * @author 77515
 *
 */
public class Solution2 {
	public static ListNode ReverseList(ListNode head) {
		ListNode pre = null;
		ListNode next = null;
		//next��Զָ��head����һλ;head��next��Զָ��ǰһλ
		//pre��Զ����head,head����next�ĵ�ǰλ��
		while(head != null){
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
    }

}

