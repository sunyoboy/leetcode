package com.javase.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by DD240 on 2016/10/25.
 */
//
public class StringUtil {
    public int compareVersion(String version1, String version2) {
        if (version1 == "" && version2 == "") return 0;
        if (version1 == "" || version2 == "") return (version1 == "") ? -1 : 1;
        String[] array1 = version1.split("\\.");
        String[] array2 = version2.split("\\.");
        int min = Math.min(array1.length, array2.length);
        int i = 0;
        while (i < array1.length || i < array2.length) {
            int a = (i < array1.length) ? Integer.valueOf(array1[i]) : 0;
            int b = (i < array2.length) ? Integer.valueOf(array2[i]) : 0;
            if (a > b) return 1;
            if (a < b) return -1;
            i++;
        }
        return 0;
    }

    public String reverseString(String s) {
        if(s == null || s == "") return s;
        StringBuilder sb = new StringBuilder(s.length());
        for(int i=s.length() - 1; i> -1;i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        char tmp;
        while(i< j) {
            while(!isVowel(chars[i]) && i< j)
                i++;
            while(!isVowel(chars[j]) && i< j)
                j--;
            if(isVowel(chars[i]) && isVowel(chars[j])) {
                tmp = chars[j];
                chars[j] = chars[i];
                chars[i] = tmp;
                i++;
                j--;
            }
        }
        return new String(chars);
    }

    public boolean isVowel(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            return true;
        else
            return false;
    }

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList();
        HashMap<Character,String> hashMap = new HashMap<>();
        hashMap.put('2',"abc");
        hashMap.put('3',"def");
        hashMap.put('4',"ghi");
        hashMap.put('5',"jkl");
        hashMap.put('6',"mno");
        hashMap.put('7',"pqrs");
        hashMap.put('8',"tuv");
        hashMap.put('9',"wxyz");
        if (digits == null | digits.length() == 0)
            return list;

        if (digits.length() == 1) {
            List<String> lista = new ArrayList();
            int i = 0;
            while(i<hashMap.get(digits.charAt(0)).length()) {
                lista.add(hashMap.get(digits.charAt(0)).substring(i,i+1));
                i++;
            }
            return lista;
        } else {

            List subList = letterCombinations(digits.substring(0,digits.length() -1));
            int  j = 0;
            String substr = (String)subList.get(j);
            while(j<subList.size()) {
                int i = 0;
                while(i<hashMap.get(digits.charAt(digits.length() -1)).length()) {
                    list.add((substr).concat(hashMap.get(digits.charAt(digits.length() -1)).substring(i,i+1)));
                    i++;
                }
                j++;
                if(j<subList.size()) {
                    substr = (String)subList.get(j);
                }
            }
            return list;
        }
    }

    public List<String> generateParenthesis(int n) {
        List list = new ArrayList<String>();
        if(n == 0) return list;
        if(n == 1) {
            List a = new ArrayList<String>();
            a.add("()");
            return a;
        } else {
            List b = generateParenthesis(n-1);
            int j = 0;
            while(j<b.size()) {

                if(!((String)b.get(j)).concat("()").equals(("()").concat(((String) b.get(j))))) {
                    list.add("(" + ((String)b.get(j)) + ")");
                    list.add(((String)b.get(j)).concat("()"));
                    list.add(("()").concat(((String) b.get(j))));

                } else {
                    list.add("(" + ((String)b.get(j)) + ")");
                    list.add(((String)b.get(j)).concat("()"));
                }
                j++;
            }
            return list;
        }
    }

/*    Given s = "the sky is blue" -> eulb si yks eht,
    return "blue is sky the".*/

    // Example 1:
/*    Given s = "hello", return "holle".

    Example 2:
    Given s = "leetcode", return "leotcede".*/

    public String reverseWords(String s) {
        String reverseStr = reverseString(s.trim());
        String [] strings = reverseStr.split(" ");
        StringBuilder sb = new StringBuilder(s.length());
        for(int i = 0; i<strings.length; i++) {
            if(strings[i].trim().length() > 0) {
                sb.append(reverseString(strings[i]));
                if(i != strings.length - 1) {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }


}
