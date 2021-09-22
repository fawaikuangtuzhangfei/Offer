package leetcode.editor.cn;

// leetcode 数组相关 e 387 字符串中的第一个唯一字符
// 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
//
// 
//
// 示例： 
//
// s = "leetcode"
//返回 0
//
//s = "loveleetcode"
//返回 2
// 
//
// 
//
// 提示：你可以假定该字符串只包含小写字母。 
// Related Topics 队列 哈希表 字符串 计数 👍 440 👎 0

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString{
    public static void main(String[] args) {
        Solution solution = new FirstUniqueCharacterInAString().new Solution();
        
    }

    /**
     * 判断当前字符首次出现和最后一次出现的位置是否相等
     */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(s.indexOf(chars[i]) == s.lastIndexOf(chars[i])){
                return i;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

/**
 * 遍历两次
 * 第一次用哈希存储每个键存在的次数
 * 第二次找到后直接返回
 */
/*
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        char[] chars = s.toCharArray();
        for (char c : chars) {
            if(map.containsKey(c)){
                map.put(c, -1);
            }else{
                map.put(c, 1);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if(map.get(chars[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}*/
