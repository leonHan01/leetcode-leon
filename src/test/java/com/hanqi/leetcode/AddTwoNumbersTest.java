package com.hanqi.leetcode;

import com.hanqi.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    @Test
    public void test1() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode node1 = new ListNode(2);
        ListNode node5 = new ListNode(5);

        addTwoNumbers.addTwoNumbers(node1, node5);
    }
}