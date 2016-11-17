package com.javase.leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by DD240 on 2016/11/7.
 */
public class SortLinkList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    // Sort a linked list in O(n log n) time using constant space complexity.
    public class Solution {
        public ListNode sortList(ListNode head) {
            return head;
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0) {
            list.add(new ArrayList<Integer>());
            return list;
        }

        if(nums.length == 1) {
            List b = new ArrayList<Integer>();
            list.add(b);
            List a = new ArrayList<Integer>();
            a.add(nums[0]);
            list.add(a);
            return list;
        } else {
            List subList = subsets(Arrays.copyOfRange(nums,0, nums.length-1));
            List b = null;
            for(int i=0; i<subList.size(); i++) {
                list.add((List<Integer>)subList.get(i));
                b = cloneList((List<Integer>) subList.get(i));
                b.add(nums[nums.length -1]);
                list.add(b);
            }
            return list;
        }
    }
    public List<Integer> cloneList(List<Integer> a) {
        List b = new ArrayList(a.size());
        for(int i=0; i<a.size(); i++) {
            b.add(a.get(i));
        }
        return b;
    }
}
