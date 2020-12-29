package d56删除链表中重复的结点;


import java.util.List;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 *
 * {1,2,3,3,4,4,5}
 * {1,2,5}
 *
 * 已排序，相等就重复
 * 保留前一个节点，拿当前节点和后一个节点比较，相等就找到最后一个相等的
 * 拿前一个节点链接最后相等的节点的后一个节点
 */
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        // 记住原来的头节点-用于返回
        ListNode head = new ListNode(0);
        head.next = pHead;
        // 前一个节点
        ListNode pre = head;
        ListNode last = head.next;
        while(last != null){
            // 找到最后一个相等的地方
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
