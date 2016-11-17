package com.javase.leetcode.array;

/**
 * Created by DD240 on 2016/10/31.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int plus = 1;
        int i = digits.length - 1;
        while(plus == 1 && i > -1) {
            plus = (digits[i] + 1) / 10;
            digits[i] = (digits[i] + 1) % 10;
            i--;
        }
        if(plus == 0) {
            return digits;
        } else {
            int[] digitsNew = new int[digits.length + 1];
            digitsNew[0] = plus;
            for(int j = 1; j<digitsNew.length; j++) {
                digitsNew[j] = digits[j-1];
            }
            return digitsNew;
        }
    }

    // -2,1,-3,4,-1,2,1,-5,4
    public int maxSubArray(int[] nums) {
        if (nums.length ==1) {
            return nums[0];
        }

        int mid = nums.length >> 1;
        // 0 ... mid-1 // mid ... n - 1
        int[] array1 = new int[mid];
        System.arraycopy(nums, 0, array1, 0, array1.length);
        int[] array2 = new int[nums.length - mid];
        System.arraycopy(nums, mid, array2, 0, array2.length);
        int answer = Math.max(maxSubArray(array1), maxSubArray(array2));
        int now = array1[mid-1], may = now;
        for(int i = mid-2; i>=0; --i) {
            may = Math.max(may, now += array1[i]);
        }
        now = may;
        for(int i=mid; i<array2.length; i++) {
            may = Math.max(may, may += array2[i]);
        }
        return Math.max(answer, may);
    }

    public int maxValue(int nums[]) {
        int max = nums[0];
        for(int i=1; i<nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
/*    public int maxArray(int[] nums, int n) {

    }*/

    public int sum(int nums[], int start, int end) {
        int sum = nums[start];
        for(int i=start + 1; i <= end; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        if(m == 0) {
            int i = 0;
            while(i < n) {
                nums1[i] = nums2[i];
                i++;
            }
            return;
        }
        int[] nums = new int[m + n];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                nums[k++] = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                nums[k++] = nums2[j++];
            }
        }

        while(i<m) {
            nums[k++] = nums1[i++];
        }

        while(j<n) {
            nums[k++] = nums2[j++];
        }

        int index = 0;
        while(index < nums1.length) {
            nums1[index]  = nums[index];
            System.out.println(nums[index]);
            index++;
        }

    }
}
