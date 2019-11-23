package d36��������ĵ�һ���������;

import java.util.HashSet;

/**
 * �������������ҳ����ǵĵ�һ��������㡣
 * 
 * ˼·:
 * ����HashSet��contains����
 * �Ȱѵ�һ�����������ֵ���� Ȼ��ѭ���ڶ������� ����contains�������
 * HashSet��contains��ʱ�临�Ӷ�ΪO(1) ��LinkList��
 * @author nanshoudabaojian
 *
 */
public class Solution2 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	if(pHead1 == null || pHead2 == null){
    		return null;
    	}
    	ListNode result = null;
    	HashSet<Integer> hash= new HashSet<Integer>();
    	ListNode node = pHead1;
    	while(node != null){
    		hash.add(node.val);
    		node = node.next;
    	}
    	node = pHead2;
    	while(node != null){
    		if(hash.contains(node.val)){
    			result = node;
    			break;
    		}
    		node = node.next;
    	}
    	return result;
    }
}
