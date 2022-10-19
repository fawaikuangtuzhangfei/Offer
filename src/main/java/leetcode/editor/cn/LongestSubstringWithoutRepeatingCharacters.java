package leetcode.editor.cn;

// leetcode 数组相关 m 3 无重复字符的最长子串
// 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 示例 4: 
//
// 
//输入: s = ""
//输出: 0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 10⁴ 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 字符串 滑动窗口 👍 6005 👎 0

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters{
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
        String s = "abba";
        System.out.println(solution.lengthOfLongestSubstring(s));
    }

    /**
     * 双指针、滑动窗口
     * 用Map存每个字符串的位置，key是字符，value是所在的位置
     * 碰到存在的且位置在开始的位置之后的，则新的开始位置在当前重复元素的位置+1，刷新Map中的位置
     * 而最长子串的长度=end-start+1
     */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        while(end < chars.length){
            char endChar = chars[end];
            if(map.containsKey(endChar) ){
                start = Math.max(map.get(endChar) + 1, start);
            }
            map.put(endChar, end);
            max = Math.max(max, (end - start + 1));
            end++;
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

/**
 * 双指针-暴力
 * 一前一后 用hashMap key存元素 value存 当前双指针的开始位置
 * 若包含此串 且位置=start的 则代表存在 此串终止，否则继续
 */
/*
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int nowLength = 0;
        int start = 0;
        int end = 0;
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        while(end < chars.length){
            char endChar = chars[end];
            if(map.containsKey(endChar) && map.get(endChar) == start){
                start++;
                end = start;
                nowLength = 0;
            }else{
                map.put(endChar, start);
                nowLength++;
                max = max > nowLength? max : nowLength;
                end++;
            }
        }
        return max;
    }
}*/
