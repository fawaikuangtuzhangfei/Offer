package d03;

/**
 * 剑指Offer
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * 思路2:
 * 利用Collections的reverse()方法反转数组
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


