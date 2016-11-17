package com.javase.leetcode.array;

import java.util.Arrays;

/**
 * Created by DD240 on 2016/11/1.
 */
public class Intersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[]{};
        }

        if (nums1.length < nums2.length) {
            return insertectOfArray(nums2, nums1);
        } else {
            return insertectOfArray(nums1, nums2);
        }
        // return nums1;
    }

    //
    public int[] insertectOfArray(int[] nums1, int[] nums2) {
        // nums1.length >= nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int nums[] = new int[nums2.length];
        int k = 0;
        int flag1 = -1;
        int flag2 = -1;
        for(int i=0; i<nums2.length && i>flag1;i++) {
            for(int j=0; j<nums1.length && j>flag2; j++) {
                if(nums2[i] == nums1[j]) {
                    flag1 = i;
                    flag2 = j;
                    nums[k++] = nums1[i];
                    continue;
                }
            }
        }
        return Arrays.copyOfRange(nums, 0, k);
    }
}
