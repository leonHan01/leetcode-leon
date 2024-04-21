package com.hanqi.leetcode;

import com.hanqi.leetcode.common.ListNode;
import com.hanqi.leetcode.util.ListNodeUtils;
import org.junit.jupiter.api.Test;

public class RotateListTest {

    @Test
    public void rotateRight() {
        ListNode listNode = ListNodeUtils.genListNode(1,2,3,4,5);
        RotateList rotateList = new RotateList();
        System.out.println(rotateList.rotateRight(listNode, 3));
    }
}