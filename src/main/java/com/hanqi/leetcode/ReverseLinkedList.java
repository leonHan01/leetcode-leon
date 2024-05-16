package com.hanqi.leetcode;

import com.hanqi.leetcode.common.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode prev = dummy;
        ListNode cur = prev.next;
        ListNode next = cur.next;
        while (next != null) {
            cur.next = next.next;
            next.next = prev.next;
            prev.next = next;
            next = cur.next;
        }
        return dummy.next;
    }
}
