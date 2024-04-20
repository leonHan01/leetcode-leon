package com.hanqi.leetcode.common;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.val);
        ListNode tmp = next;
        while (tmp != null) {
            stringBuilder.append("->").append(tmp.val);
            tmp = tmp.next;
        }
        stringBuilder.append("->NULL");
        return stringBuilder.toString();
    }
}
