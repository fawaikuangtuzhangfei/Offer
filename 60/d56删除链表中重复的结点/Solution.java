package d56ɾ���������ظ��Ľ��;


import java.util.List;

/**
 * ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣
 * ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
 *
 * {1,2,3,3,4,4,5}
 * {1,2,5}
 *
 * ��������Ⱦ��ظ�
 * ����ǰһ���ڵ㣬�õ�ǰ�ڵ�ͺ�һ���ڵ�Ƚϣ���Ⱦ��ҵ����һ����ȵ�
 * ��ǰһ���ڵ����������ȵĽڵ�ĺ�һ���ڵ�
 */
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        // ��סԭ����ͷ�ڵ�-���ڷ���
        ListNode head = new ListNode(0);
        head.next = pHead;
        // ǰһ���ڵ�
        ListNode pre = head;
        ListNode last = head.next;
        while(last != null){
            // �ҵ����һ����ȵĵط�
            if(last.next != null && last.val == last.next.val){
                while(last.next != null && last.val == last.next.val) {
                    last = last.next;
                }
                pre.next = last.next;
                last = last.next;
            }else{
                pre = pre.next;
                last = last.next;
            }
        }
        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
