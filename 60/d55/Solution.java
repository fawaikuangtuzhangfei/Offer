package d55;

import java.util.HashSet;

/**
 * ��һ�����������а����������ҳ�������Ļ�����ڽ�㣬�������null��
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
