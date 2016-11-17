package com.javase.leetcode.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** 
* InsertSort Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 21, 2016</pre> 
* @version 1.0 
*/ 
public class InsertSortTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sort(int[] a, int left, int right) 
* 
*/ 
@Test
public void testSort() throws Exception { 
//TODO: Test goes here...
    int[] b = {1, 10, 8, 3, 12, 24};
    new InsertSort().sort(b, 0, b.length - 1);
    for(int i=0; i<b.length; i++) {
        System.out.println(b[i]);
    }


}




} 
