package com.example.leetcode.bytedance;


import org.apache.tomcat.util.buf.HexUtils;
import org.junit.Test;

/**
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * @author zma
 * @date 2020/3/23 11:26
 */
public class LongestCommonPrefix {

    @Test
    public void test() {
        String[] strs = {"dog","racecar","car"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }

    public String longestCommonPrefix(String[] strs) {


        if (strs.length== 1){
            return strs[0];
        }
        String prefix = "";
        int num = 0;
        for (int i = 0, j = 0; i < strs.length - 1; i++, j++) {
            String s = strs[i];
            char[] chars_1 = s.toCharArray();
            String s1 = strs[i + 1];
            byte[] chars_2 = s1.getBytes();
            int ans = chars_1[num] ^ chars_2[num];
            if (ans == 0) {
                prefix += chars_1[num];
                num++;
            } else {
                return prefix;
            }
        }
        return prefix;
    }

}
