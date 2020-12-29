package d55;

import java.util.HashSet;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null || pHead.next == null){
            return null;
        }

        HashSet<Integer> set = new HashSet<>();
        set.add(pHead.val);
        while(pHead.next != null){
            pHead = pHead.next;
            if(set.contains(pHead.val)){
                return pHead;
            }else{
                set.add(pHead.val);
            }
        }
        return null;
    }
}
