package d16;

/**
 * �ϲ��������������
 * ���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
 * 
 * ˼·:
 * �߱Ƚϱߺϳ�
 * ��1��ֵС��2��ֵ����1��ͷ�ڵ�Ϊ������3��ͷ�ڵ㣬������1��ֵ��������2��ֵ��������2��ͷ�ڵ�Ϊʣ�½ڵ�
 * ��ͷ�ڵ㣬��������
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