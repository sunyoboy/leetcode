package com.javase.leetcode.array;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* Intersection Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮһ�� 1, 2016</pre> 
* @version 1.0 
*/ 
public class IntersectionTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception {


} 

/** 
* 
* Method: intersect(int[] nums1, int[] nums2) 
* 
*/ 
@Test
public void testIntersect() throws Exception {

/*    [0,5,8,7,2,9,7,5]
    [1,4,8,9]*/
    int[] nums1 = {2,1};//{0,5,8,7,2,9,7,5};// {1,2};// {1, 2, 2, 1};{2,1};
    int[] nums2 = {1,2};// {1,4,8,9};// {1,1};// {1,2};
    Intersection intersection = new Intersection();
    int[] nums = intersection.intersect(nums1,nums2);
    for(int i=0; i<nums.length; i++) {
        System.out.println(nums[i]);
    }

} 


} 
