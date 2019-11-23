package d03;

/**
 * ��ָOffer
 * ����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList��
 * ˼·1:
 * ����ջ�ĺ���ȳ�����
 * @author 77515
 *
 */
import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        //��listNode��Ϊ�գ���һֱ��ջ�����Ԫ��
        while(listNode != null){
        	stack.add(listNode.val);
        	listNode = listNode.next;
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        //��ջ��Ϊ�����ջ
        while(!stack.isEmpty()){
        	list.add(stack.pop());
        }
        
        return list;
    }
}


class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}
