/**
 * Created by root on 11/29/16.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        boolean[] have = new boolean[0x10000];
        for(int i=0,j=0;;++i) {
            while((j<s.length()) && !have[s.charAt(j)]) {
                have[s.charAt(j)] = true;
            }

            answer = Math.max(answer, j-i);
            if(j >= s.length()) {
                break;
            }
            while(s.charAt(i) != s.charAt(j)) {
                have[s.charAt(i++)] = false;
            }
            have[s.charAt(i)] = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(0x10000);
    }

    public String removeDuplicateLetters(String s) {
        int[] nums = new int[26];
        boolean[] in = new boolean[26];
        for(int i=0; i< s.length(); i++) {
            ++nums[s.charAt(i) - 'a'];
        }

        StringBuffer answer = new StringBuffer();
        for(int i=0, last=0; i<s.length();) {
            int c = s.charAt(i) - 'a';
            if((nums[c]==1) && (!in[c])) {
                int x = -1;
                for(int j = last; j<=i; ++j) {
                    if((!in[s.charAt(j) - 'a']) && ((x<0) || s.charAt(j) <s.charAt(x))) {
                        x = j;
                    }
                }
                answer.append(s.charAt(x));
                in[s.charAt(x) - 'a'] = true;
                if(s.charAt(x) == s.charAt(i)) {
                    ++i;
                }
                last = x+1;
            } else {
                --nums[c];
                ++i;
            }
        }
        return answer.toString();
    }
}
