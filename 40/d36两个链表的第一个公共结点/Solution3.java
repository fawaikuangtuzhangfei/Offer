package d36两个链表的第一个公共结点;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 * 
 * 思路:
 * 如果他们有公共结点,则代表他俩肯定有相同的尾链(公共结点的意思是两个链表相遇之后后面都是一样的)
 * 长的走(长-短)步 然后一起走 若相同则就是第一个公共结点
 * eg 7,1,2,3   5,2,3   
 * @author nanshoudabaojian
 *
 */
public class Solution3 {
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	if(pHead1 == null || pHead2 == null){
    		return null;
    	}
    	int len1 = findLen(pHead1);
    	int len2 = findLen(pHead2);
    	if(len1 > len2){
    		pHead1 = go(pHead1, len1-len2);
    	}else{
    		pHead2 = go(pHead2, len2-len1);
    	}
    	while(pHead1 != null && pHead2 != null){
    		if(pHead1 == pHead2){
    			return pHead1;
    		}
    		pHead1 = pHead1.next;
    		pHead2 = pHead2.next;
    	}
    	return null;
    }
    //前进n步
    public static ListNode go(ListNode node, int n){
    	while(n > 0){
    		node = node.next;
    		n--;
    	}
    	return node;
    }
    //求链表的长度
    public static int findLen(ListNode node){
    	ListNode head = node;
    	int len = 0;
    	while(node != null){
    		len++;
    		node = node.next;
    	}
    	return len;
    }
    public static void main(String[] args) {
		ListNode h1 = new ListNode(1);
		ListNode h2 = new ListNode(2);
		ListNode h3 = new ListNode(3);
		ListNode h4 = new ListNode(4);
		ListNode h5 = new ListNode(5);
		ListNode h6 = new ListNode(6);
		ListNode h7 = new ListNode(7);
		h1.next = h2;
		h2.next = h3;
		h3.next = h6;
		h6.next = h7;
		h4.next = h5;
		h5.next = h6;
		System.out.println(FindFirstCommonNode(h1, h4));
	}
}
