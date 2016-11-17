package com.javase.leetcode.array;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* RemoveElement Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 21, 2016</pre> 
* @version 1.0 
*/ 
public class RemoveElementTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: removeDuplicates(int[] nums) 
* 
*/ 
@Test
public void testRemoveDuplicates() throws Exception {
    // int[] array = {1,1,2};
    int[] array1 = {1,2,3};// {1,2,2};//{0,0,0,0,3};// {1,1,1,2};
    RemoveElement removeElement = new RemoveElement();
    removeElement.removeDuplicates(array1);
//TODO: Test goes here... 
}

    @Test
    public void testLongestCommonPrefix() throws Exception {
//TODO: Test goes here...
        // ["aa","ab"];
        String[] strings = {"ca","a"};//{"aa", "bb"}; //  {"a", "b"};//

        RemoveElement removeElement = new RemoveElement();
        System.out.println("result : " + removeElement.longestCommonPrefix(strings));;
    }

    @Test
    public void testLargestNumber() throws Exception {
//TODO: Test goes here...
        // int[] array = {3, 30, 34, 5, 9};
        int[] array = {20,1};
        RemoveElement removeElement = new RemoveElement();
        System.out.println("result : " + removeElement.largestNumber(array));;
    }

} 
