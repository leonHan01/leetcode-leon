package com.hanqi.leetcode;


import com.hanqi.leetcode.common.ListNode;
import com.hanqi.leetcode.util.ListNodeUtils;
import org.junit.jupiter.api.Test;

public class MergeKSortedListsTest {

    @Test
    public void mergeKLists() {
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode l1 = ListNodeUtils.genListNode(1, 2, 3, 4);

        ListNode l3 = ListNodeUtils.genListNode(1, 5, 6, 8);

        ListNode[] lists = new ListNode[4];
        lists[1] = l1;
        lists[3] = l3;
        mergeKSortedLists.mergeKLists(lists);
    }
}