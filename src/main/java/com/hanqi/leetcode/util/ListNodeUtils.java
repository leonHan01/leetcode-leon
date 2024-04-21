package com.hanqi.leetcode.util;

import com.hanqi.leetcode.common.ListNode;

public class ListNodeUtils {
    public static ListNode genListNode(int head, int... tail) {
        ListNode headNode = new ListNode(head);
        ListNode dummy = headNode;
        for (int i : tail) {
            ListNode node = new ListNode(i);
            dummy.next = node;
            dummy = dummy.next;
        }
        return headNode;
    }
}
