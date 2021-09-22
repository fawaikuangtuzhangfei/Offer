package leetcode.editor.cn;

// feat: leetcode 数组相关 e 125 验证回文子串
// 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 
//
// 示例 1: 
//
// 
//输入: "A man, a plan, a canal: Panama"
//输出: true
//解释："amanaplanacanalpanama" 是回文串
// 
//
// 示例 2: 
//
// 
//输入: "race a car"
//输出: false
//解释："raceacar" 不是回文串
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 2 * 10⁵ 
// 字符串 s 由 ASCII 字符组成 
// 
// Related Topics 双指针 字符串 👍 417 👎 0

public class ValidPalindrome{
    public static void main(String[] args) {
        Solution solution = new ValidPalindrome().new Solution();

    }

    /**
     * 双指针
     */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char aChar : chars) {
            if(Character.isLetterOrDigit(aChar)){
                sb.append(aChar);
            }
        }
        chars = sb.toString().toLowerCase().toCharArray();
        int i=0, j=chars.length-1;
        while (i < j){
            if(chars[i] != chars[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}