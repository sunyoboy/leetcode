package com.javase.leetcode.array;

/**
 * Created by DD240 on 2016/10/21.
 */
public class RemoveElement {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int [] array = new int[nums.length];
        int duplicate = 0;
        int tmp = nums[0];
        for(int j=1,i=j; j<nums.length; j++) {
            if(nums[j] == tmp) {
                array[duplicate++] = j;
            } else {
                if(nums[i] != nums[j] ) {
                    nums[i] = nums[j];
                }
                tmp = nums[j];
                i++;
            }
        }

        return nums.length - duplicate;
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int position = 0;
        int len = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < len) {
                position = i;
                len = strs[i].length();
            }
        }

        String tmp = "";

        for (int k = strs[position].length(); k > 0; k--) {
            boolean flag = true;
            tmp = strs[position].substring(0, k);
            for (int i = 0; i < strs.length; i++) {
                if (!strs[i].startsWith(tmp)) {
                    flag = false;
                    continue;
                }
            }
            if (flag) {
                return tmp;
            }
        }
        return "";
    }

    public String largestNumber(int[] nums) {
        for (int i = 0, j = i; i < nums.length - 1; j = ++i) {
            int ai = nums[i + 1];
            while ((ai / 10) < (nums[j] % 10)) {
                nums[j + 1] = nums[j];
                if (j-- == 0) {
                    break;
                }
            }
            nums[j + 1] = ai;
        }
        StringBuffer sb = new StringBuffer();
        for(int i= nums.length - 1; i>=0; i--) {
            sb.append(nums[i]);
        }
        return sb.toString();
    }
}
