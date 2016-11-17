package com.javase.leetcode.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * SortLinkList Tester.
 *
 * @author <Authors name>
 * @since <pre>ʮһ�� 7, 2016</pre>
 * @version 1.0
 */
public class SortLinkListTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: subsets(int[] nums)
     *
     */
    @Test
    public void testSubsets() throws Exception {
        SortLinkList sortLinkList = new SortLinkList();
        int[] nums = {1};
        int[] nums1 = {1, 2};
        int[] nums2 = {1, 2, 3};
        List list = sortLinkList.subsets(nums1);
        for(int i=0; i<list.size(); i++) {
            System.out.print("List" + i + " ");
            for(int j=0; j<((List<Integer>)list.get(i)).size(); j++) {
                System.out.print(" " + ((List<Integer>) list.get(i)).get(j));
            }
            System.out.println();
        }
        // sortLinkList.subsets(nums1);
        // sortLinkList.subsets(nums2);
//TODO: Test goes here...
    }

    /**
     *
     * Method: sortList(ListNode head)
     *
     */
    @Test
    public void testSortList() throws Exception {
//TODO: Test goes here...
    }


}
