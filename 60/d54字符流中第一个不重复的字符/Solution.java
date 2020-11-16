package d54字符流中第一个不重复的字符;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 字符流中第一个不重复的字符
 *
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 *
 * 如果当前字符流没有存在出现一次的字符，返回#字符
 */
public class Solution {
    private Set<Character> set = new HashSet<>();
    private List<Character> list = new ArrayList<>();
    //Insert one char from stringstream
    public void Insert(char ch) {
        if(set.contains(ch)){
            int i = list.indexOf(ch);
            if(i != -1){
                list.remove(i);
            }
        }else{
            set.add(ch);
            list.add(ch);
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        if(list.size() > 0){
            return list.get(0);
        }
        return '#';
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.Insert('g');
        s.Insert('g');
        s.Insert('g');
        s.Insert('g');
        s.Insert('g');
        System.out.println(s.FirstAppearingOnce());
    }
}
