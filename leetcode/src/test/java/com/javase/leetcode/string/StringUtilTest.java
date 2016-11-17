package com.javase.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/** 
* StringUtil Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 25, 2016</pre> 
* @version 1.0 
*/ 
public class StringUtilTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: compareVersion(String version1, String version2)
     */
    @Test
    public void testCompareVersion() throws Exception {
//TODO: Test goes here...
        // 0.1 < 1.1 < 1.2 < 13.37//
        StringUtil stringUtil = new StringUtil();
        Assert.assertEquals("equal", -1, stringUtil.compareVersion("0.1", "1.1"));
        Assert.assertEquals("equal", 1, stringUtil.compareVersion("1.1", "0.1"));
        Assert.assertEquals("equal", -1, stringUtil.compareVersion("1.1", "1.37"));
    }

    @Test
    public void testReverseVowels() {
        StringUtil stringUtil = new StringUtil();
        Assert.assertEquals("equla", "holle", stringUtil.reverseVowels("hello"));
        Assert.assertEquals("equla", "leotcede", stringUtil.reverseVowels("leetcode"));
        Assert.assertEquals("equla", "Aa", stringUtil.reverseVowels("aA"));
    }

    @Test
    public void testReverseWords() {
        StringUtil stringUtil = new StringUtil();
        Assert.assertEquals("equla", "blue is sky the", stringUtil.reverseWords("the sky is blue"));
        Assert.assertEquals("equla", "b a", stringUtil.reverseWords("   a   b "));

    }

    @Test
    public void TestLetterCombinations() {
        StringUtil stringUtil = new StringUtil();
        List list = stringUtil.letterCombinations("23");
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void testGenerateParenthesis() throws Exception {
        StringUtil stringUtil = new StringUtil();
        List list = stringUtil.generateParenthesis(3);
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
