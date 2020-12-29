package d52正则表达式匹配;

/**
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，
 * 而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 *
 * "aaa","a*a"    true
 * 当模式中的第二个字符不是“*”时：
 *
 * 1、如果字符串第一个字符和模式中的第一个字符相匹配，那么字符串和模式都后移一个字符，然后匹配剩余的。
 * 2、如果字符串第一个字符和模式中的第一个字符相不匹配，直接返回false。
 *
 * 而当模式中的第二个字符是“*”时：
 *
 * 如果字符串第一个字符跟模式第一个字符不匹配，则模式后移2个字符，继续匹配。如果字符串第一个字符跟模式第一个字符匹配，可以有3种匹配方式：
 * 1、模式后移2字符，相当于x*被忽略；
 * 2、字符串后移1字符，模式后移2字符；
 * 3、字符串后移1字符，模式不变，即继续匹配字符下一位，因为*可以匹配多位；
 * 这里需要注意的是：Java里，要时刻检验数组是否越界。
 */
public class Solution2 {
    public boolean match(char[] str, char[] pattern) {
       if(str == null || pattern == null){
           return false;
       }
        return matchCore(str, 0, pattern, 0);
    }

//    "a",".*"
    public boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex){
        // 都走到尾部了
        if(strIndex == str.length && patternIndex == pattern.length){
            return true;
        }
        // 模式走到尾了，但是字符串没有全部匹配
        if(strIndex != str.length && patternIndex == pattern.length){
            return  false;
        }
        // 如果是* 有3种情况 1.当前值与第一个不一样 模式后移两位
        //2.当前值与第一个一样 模式不动 字符串后移一位 继续匹配
        //3.第二种情况的变种，若后一个不一致，字符串不变，模式后移两位
        if((patternIndex+1 < pattern.length && pattern[patternIndex+1] == '*')){
            if(strIndex != str.length && str[strIndex] == pattern[patternIndex] || (strIndex != str.length && pattern[patternIndex] == '.')){
                return matchCore(str, strIndex+1, pattern, patternIndex) // 匹配了一个 继续匹配下一个
                        || matchCore(str, strIndex+1, pattern, patternIndex+2)// 就匹配了一个
                        || matchCore(str, strIndex, pattern, patternIndex+2);// 匹配不了了 字符串不变 模式后移2
            }else {
                return matchCore(str, strIndex, pattern, patternIndex + 2);
            }
        }
        // 如果不是*则有2种情况
        if(strIndex != str.length && pattern[patternIndex] == str[strIndex] ||  pattern[patternIndex] == '.'){
            return matchCore(str, strIndex+1, pattern, patternIndex+1);
        }
        return false;
    }

}
