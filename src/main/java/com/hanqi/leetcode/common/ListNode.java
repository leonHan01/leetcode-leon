package com.hanqi.leetcode.common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ListNode {

    Map<ListNode, Integer> map = new HashMap<>();

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
        map.clear();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.val);
        ListNode tmp = next;
        int maxLength = 30;
        int i = 0;
        map.put(this, 1);

        while (tmp != null) {
            i++;
            if (map.containsKey(tmp)) {
                int cnt = map.get(tmp);
                if (cnt % 2 == 1) {
                    stringBuilder.append("->").append("(").append(tmp.val).append(")");
                } else {
                    stringBuilder.append("->").append("{").append(tmp.val).append("}");
                }
                map.put(tmp, ++cnt);
            } else {
                stringBuilder.append("->").append(tmp.val);
                map.put(tmp, 1);
            }
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
