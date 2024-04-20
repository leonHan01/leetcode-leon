package com.hanqi.leetcode;

import com.hanqi.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

public class SortListTest {
    @Test
    public void test() {
        SortList sortList = new SortList();
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(4);
        sortList.sortList(head);
    }
}