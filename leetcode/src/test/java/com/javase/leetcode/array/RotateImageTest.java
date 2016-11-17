package com.javase.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** 
* RotateImage Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 31, 2016</pre> 
* @version 1.0 
*/ 
public class RotateImageTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: rotate(int[][] matrix) 
* 
*/ 
@Test
public void testRotate() throws Exception {
    RotateImage rotateImage = new RotateImage();
    // int[][] array = {{1,2}, {3,4}};

    int[][] array = {{1,2, 3}, {4, 5, 6}, {7, 8, 9}};
    rotateImage.rotateTwo(array);

//TODO: Test goes here... 
} 


} 
