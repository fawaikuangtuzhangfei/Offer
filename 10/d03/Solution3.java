package d03;

/**
 * 剑指Offer
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * 思路3:
 * 利用递归(有个缺陷，若链表过长，则递归的栈会越来越深，可能会导致栈溢出)
 * 深度理解:递归的本质也是栈，会不断调用自身，不断压栈，到了顶端最后一个时候，
 * 会反向输出，也就相当于是从尾到头反向输出
 * @author 77515
 *
 */
import java.util.ArrayList;
public class Solution3 {
	//此处必须将数组放在外面，否则会造成覆盖
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


