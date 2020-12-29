package d52正则表达式匹配;

/**
 * @author yc
 * @create 2020-11-11 14:43
 */
public class Solution3 {

    public boolean match(char[] str, char[] pattern) {
        return isMatch(str.toString(), pattern.toString());
    }

    public boolean isMatch(String s, String p){
        if (p.length() <= 0) {
            return s.length() <= 0;
        }
        boolean match = (s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));
        if (p.length() > 1 && p.charAt(1) == '*'){
            return isMatch(s, p.substring(2)) || (match && isMatch(s.substring(1), p));
        } else {
            return match && isMatch(s.substring(1), p.substring(1));
        }
    }
}
