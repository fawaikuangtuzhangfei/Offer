package d16;

/**
 * �ϲ��������������
 * ���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
 * 
 * ˼·:�ǵݹ�汾
 * ��������ָ��
 * @author 77515
 *
 */
public class Solution3 {
	public ListNode Merge(ListNode list1,ListNode list2) {
		//�Լ�����һ��ͷ�ڵ�(�������)
		ListNode head = new ListNode(-1);
		//����һ����ʱ��������ͷ�ڵ�
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
		//��ĳһ�����Ѿ����� ��ֱ�Ӱ���һ���������ӵ���ǰ������
		if (list1 != null){
			 cur.next = list1;
		}
	       
	    if (list2 != null){
	    	cur.next = list2;
	    }
		return head.next;
    }
}
