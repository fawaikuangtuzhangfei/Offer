package d25��������ĸ���;

/**
 * ��������ĸ���
 * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬
 * ��һ������ָ��ָ������һ���ڵ㣩�����ؽ��Ϊ���ƺ��������head��
 * ��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 * 
 * ˼·:
 * 1.��ÿ���ڵ�ĺ�����븴�ƺ�Ľڵ�
 * 2.��random��ֵ
 * 3.���
 * @author 77515
 *
 */
public class BSolution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null){
        	return null;
        }
        //����һ����ģ��ͷָ��
        RandomListNode cur = pHead;
        //��ÿ���ڵ�ĺ�����븴�ƺ�Ľڵ�
        while(cur != null){
        	RandomListNode clone = new RandomListNode(cur.label);
        	clone.next = cur.next;
        	cur.next = clone;
        	cur = clone.next;
        }
        //���½�curָ��head
        cur = pHead;
        //��random��ֵ
        while(cur != null){
        	RandomListNode clone = cur.next;
        	if(cur.random != null){
        		clone.random = cur.random.next;
        	}
        	//cur����ƶ�
        	cur = clone.next;
        }
        //���
        cur = pHead;
        RandomListNode newClone = pHead.next;
        while(cur.next != null){
        	RandomListNode clone = cur.next;
        	cur.next = clone.next;
        	cur = clone;
        }
        return newClone;
    }
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
