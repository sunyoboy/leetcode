package com.javase.leetcode.datastructure.stack;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* MinStack Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 25, 2016</pre> 
* @version 1.0 
*/ 
public class MinStackTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
}


/*    Input:
            ["MinStack","push","push","push","getMin","pop","top","getMin"]
            [[],[-2],[0],[-3],[],[],[],[]]
    Output:
            ["constructor","null","null","null","-3","null","0","-3"]
    Expected:
            ["constructor","null","null","null","-3","null","0","-2"]*/
/** 
* 
* Method: push(int x) 
* 
*/ 
@Test
public void testPush() throws Exception {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    Assert.assertEquals("equal", -3, minStack.getMin());

      // --> Returns -3.
    minStack.pop();
    Assert.assertEquals("equal", 0, minStack.top());
    ;     //  --> Returns 0.
    Assert.assertEquals("equal", -2, minStack.getMin());
    ;  //  --> Returns -2.
} 

/** 
* 
* Method: pop() 
* 
*/ 
@Test
public void testPop() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: top() 
* 
*/ 
@Test
public void testTop() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getMin() 
* 
*/ 
@Test
public void testGetMin() throws Exception { 
//TODO: Test goes here... 
} 


} 
