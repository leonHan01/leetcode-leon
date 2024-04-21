package com.hanqi.leetcode.common;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
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
        int maxLength = 30;
        int i = 0;
        while (tmp != null) {
            i++;
            stringBuilder.append("->").append(tmp.val);
            tmp = tmp.next;
            if (i >= maxLength) {
                stringBuilder.append("......");
                break;
            }
        }
        stringBuilder.append("->NULL");
        return stringBuilder.toString();
    }
}
