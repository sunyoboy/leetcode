package com.javase.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** 
* PlusOne Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 31, 2016</pre> 
* @version 1.0 
*/ 
public class PlusOneTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: plusOne(int[] digits) 
* 
*/ 
@Test
public void testPlusOne() throws Exception {
    PlusOne plusOne = new PlusOne();
    int[] array = plusOne.plusOne(new int[]{9});
    for(int j=0; j<array.length; j++) {
        System.out.println(array[j]);
    }
//TODO: Test goes here... 
}

    @Test
    public void testMaxSubArray() throws Exception {
        PlusOne plusOne = new PlusOne();
        int[] array = new int[]{-2,1,-3,4,-1,2,1,-5,4}; // {-2,1,-3,4,-1,2,1,-5,4};
        // Assert.assertEquals(plusOne.maxSubArray(array), 3, "equal");
//TODO: Test goes here...
    }
    @Test
    public void testMerge() throws Exception {
        PlusOne plusOne = new PlusOne();

/*        int[] a = {1,0};
        int[] b = {2};*/
/*        int[] a = {2,0};
        int[] b = {1};*/
        int[] a = {4,0,0,0,0,0};
        int[] b = {1,2,3,5,6};
        plusOne.merge(a, 1, b, 5);

//TODO: Test goes here...
    }
} 
