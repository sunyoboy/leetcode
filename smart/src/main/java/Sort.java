import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;

/**
 * Created by root on 12/1/16.
 */
public class Sort {

    public static final int RANDOM_SEED = 1024;

    public static void main(String[] args) {
        System.out.println("RANDOM_SEED :" + RANDOM_SEED);
        int[] array = getRandomArrays(10);
        int[] array2 = array;
        traversalArray(array);
        traversalArray(array2);
        divideSort(array, 0, array.length - 1);
        // insertSort(array);
        traversalArray(array);
        traversalArray(array2);


    }

    /**
     * 插入排序
     * @param nums
     */
    public static void insertSort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];
            boolean flag = false;
            int p = i - 1;
            while (p >= 0 && !flag) {
                if (x >= nums[p]) {
                    flag = true;
                } else {
                    p--;
                }
            }
            p = p+1;
            for(int j=i-1; j>=p; j--) {
                nums[j+1] = nums[j];
            }
            nums[p] = x;
        }
    }

    public static void divideSort(int[] nums, int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            divideSort(nums, start,mid);
            divideSort(nums, mid+1, end);
            mergeSort(nums, start, mid, end);
/*
        int len = nums.length;
        if(len > 2) {
            int mid = len / 2;
            int[] left = Arrays.copyOfRange(nums, 0, mid);
            int[] right = Arrays.copyOfRange(nums, mid, len);
            if(left.length >= 2) {
                divideSort(nums);
            }

            if(right.length >= 2) {
                divideSort(nums);
            }

*/

        }
    }

    public static void mergeSort(int[] nums, int start, int mid, int end) {
        int len1 = (mid - start) + 1;
        int len2 = (end - mid);
        int[] left = new int[len1];
        int[] right = new int[len2];
        int i = 0;
        int j = 0;
        while(i != len1) {
            left[i] = nums[start + i];
            ++i;
        }

        while(j != len2) {
            right[j] = nums[mid + j + 1];
            ++j;
        }

        i = j = 0;
        int k = start;
        while(i != len1 && j != len2) {
            if(left[i] < right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }

        if(i == len1) {
            while(j!=len2) {
                nums[k++] = right[j++];
            }
        }

        if(j==len2) {
            while(i!=len1) {
                nums[k++] = left[i++];
            }
        }
    }

    public static void swap(int a, int b) {
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
    }

    public static int random(int seed) {
        return RandomUtils.nextInt(0, RANDOM_SEED);
    }

    public static int[] getRandomArrays(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random(RANDOM_SEED);
        }
        return array;
    }

    public static void traversalArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t", array[i]);
        }
        System.out.println();
    }
}
