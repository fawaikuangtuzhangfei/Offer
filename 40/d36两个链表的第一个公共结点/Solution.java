package d36��������ĵ�һ���������;

import java.util.ArrayList;

/**
 * �������������ҳ����ǵĵ�һ��������㡣
 * 
 * ˼·:
 * ����ArrayList��contains����
 * �Ȱѵ�һ�����������ֵ���� Ȼ��ѭ���ڶ������� ����contains�������
 * @author nanshoudabaojian
 *
 */
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	if(pHead1 == null || pHead2 == null){
    		return null;
    	}
    	ListNode result = null;
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	ListNode node = pHead1;
    	while(node != null){
    		list.add(node.val);
    		node = node.next;
    	}
    	node = pHead2;
    	while(node != null){
    		if(list.contains(node.val)){
    			result = node;
    			break;
    		}
    		node = node.next;
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

