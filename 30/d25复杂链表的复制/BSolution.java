package d25复杂链表的复制;

/**
 * 复杂链表的复制
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * 
 * 思路:
 * 1.在每个节点的后面插入复制后的节点
 * 2.给random赋值
 * 3.拆分
 * @author 77515
 *
 */
public class BSolution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null){
        	return null;
        }
        //创建一个来模拟头指针
        RandomListNode cur = pHead;
        //在每个节点的后面插入复制后的节点
        while(cur != null){
        	RandomListNode clone = new RandomListNode(cur.label);
        	clone.next = cur.next;
        	cur.next = clone;
        	cur = clone.next;
        }
        //重新将cur指向head
        cur = pHead;
        //给random赋值
        while(cur != null){
        	RandomListNode clone = cur.next;
        	if(cur.random != null){
        		clone.random = cur.random.next;
        	}
        	//cur向后移动
        	cur = clone.next;
        }
        //拆分
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
