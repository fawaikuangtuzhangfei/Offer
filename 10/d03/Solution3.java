package d03;

/**
 * ��ָOffer
 * ����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList��
 * ˼·3:
 * ���õݹ�(�и�ȱ�ݣ��������������ݹ��ջ��Խ��Խ����ܻᵼ��ջ���)
 * ������:�ݹ�ı���Ҳ��ջ���᲻�ϵ�����������ѹջ�����˶������һ��ʱ��
 * �ᷴ�������Ҳ���൱���Ǵ�β��ͷ�������
 * @author 77515
 *
 */
import java.util.ArrayList;
public class Solution3 {
	//�˴����뽫����������棬�������ɸ���
	private ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        
    	if(listNode == null){
    		return list;
    	}
        printListFromTailToHead(listNode.next);
        list.add(listNode.val);
        
        return list;
    }
}


