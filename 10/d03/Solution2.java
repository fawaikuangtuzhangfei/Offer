package d03;

/**
 * ��ָOffer
 * ����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList��
 * ˼·2:
 * ����Collections��reverse()������ת����
 * @author 77515
 *
 */
import java.util.ArrayList;
import java.util.Collections;
public class Solution2 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(listNode != null){
        	list.add(listNode.val);
        	listNode = listNode.next;
        }
        
        Collections.reverse(list);
        
        return list;
    }
}


