package com.example.leetcode.bytedance;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/explore/interview/card/bytedance/242/string/1012/
 * <p>
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * @author zma
 * @date 2020/3/21 10:16
 */
public class lengthOfLongestSubstring {

    @Test
    public void test() {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }


    public int lengthOfLongestSubstring(String s) {

        char[] chars = s.toCharArray();
        if (s.length() == 1) {
            return 1;
        }
        Map<Character, Integer> map = new HashMap<>();
        int length = 0;
        for (int i = 0; i < chars.length; i++) {
            // 如果已经包含 则暂停记录
            char c = chars[i];
            if (map.get(c) == null) {
                map.put(c, i);
            } else {
                if (map.size() > length) {
                    length = map.size();
                }
                i = map.get(c);
                map.clear();
            }
        }
        if (length < map.size()) {
            return map.size();
        }
        return length;
    }


}
