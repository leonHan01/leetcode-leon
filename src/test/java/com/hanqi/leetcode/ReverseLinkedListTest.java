package com.hanqi.leetcode;


import com.hanqi.leetcode.common.ListNode;
import com.hanqi.leetcode.util.ListNodeUtils;
import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {
    @Test
    public void test() {
        ListNode head = ListNodeUtils.getDefaultList(5);
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.reverseList(head);
    }
}