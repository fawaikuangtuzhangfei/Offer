package d14;

/**
 * �����е�����k�����
 * ����һ����������������е�����k����㡣
 * 
 * ˼·1:
 * n-k+k=n
 * ��������ָ�룬һ��ָ���ͷ��ʼ��k������ʣn-k���ʱָ��2��ʼ������
 * ֱ��ָ��1�ߵ�ĩβΪֹ��Ҳ����˵ָ��2����n-k����ָ��1����k��Ҳ����n-k����ô����ĩβ����k��
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
		//��k��head�ĳ��ȶ��� ����null
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