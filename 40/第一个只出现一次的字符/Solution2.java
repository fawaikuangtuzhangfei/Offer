package 第一个只出现一次的字符;

import java.util.HashMap;

/**
 * 第一个只出现一次的字符
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 * 
 * 思路:
 * 看了牛客的评论以及赵俊老师上一周一道关于百度员工年龄的题有所启发
 * 构造类似哈希的效果->
 * 年龄题中:1.遍历1-100岁(100次)，将年龄作为key值，若相同则value值++ 2.再次遍历1-100岁，以该年龄的value作为循环条件，不断打印
 * 本题中:1.遍历数组，将字符串的每一个字符作为key值,若相同则value++ 2.以字符串的顺序再次遍历数组,第一个value==1的就是答案
 * 
 * @author nanshoudabaojian
 *
 */

public class Solution2 {
    public static int FirstNotRepeatingChar(String str) {
    	if(str.length() == 1){
    		return 0;
    	}
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	for(int i=0; i<str.length(); i++){
    		char now = str.charAt(i);
    		if(map.containsKey(now)){
    			int temp = map.get(now);
    			map.put(now, ++temp);
    		}else{
    			map.put(now, 1);
    		}
    	}
    	for(int i=0; i<str.length(); i++){
    		if(map.get(str.charAt(i)) == 1){
    			return i;
    		}
    	}
    	
        return -1;
    }
    
    public static void main(String[] args) {
		System.out.println(FirstNotRepeatingChar("bccbda"));//
	}
}