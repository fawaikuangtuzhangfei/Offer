package leetcode.editor.cn;

// leetcode 字符串相关 e 14 最长公共前缀
// 编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
// Related Topics 字符串 👍 1789 👎 0

public class LongestCommonPrefix{
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
        String[] strs = new String[]{"aaa","aa","aaa"};
        solution.longestCommonPrefix(strs);
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = 201;
        char[] first = strs[0].toCharArray();
        for (int i = 0; i < strs.length; i++) {
            char[] ichar = strs[i].toCharArray();
            int minLength = Math.min(first.length, ichar.length);
            // 逐个判断
            int p = 0;
            while(p < minLength){
                if(first[p] == ichar[p]){
                    p++;
                }else{
                    break;
                }
            }
            // 一个也没匹配
            if(p == 0){
                return "";
            }
            len = Math.min(p, len);
        }
        return new String(first).substring(0, len);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}