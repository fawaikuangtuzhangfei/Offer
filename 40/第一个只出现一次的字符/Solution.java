package 第一个只出现一次的字符;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 第一个只出现一次的字符
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 * 
 * 思路:
 * 先排序 排序之后看前后两个是否相等 不等就存入数组 
 * 循环数组 找最小 
 * 
 * @author nanshoudabaojian
 *
 */

public class Solution {
    public static int FirstNotRepeatingChar(String str) {
    	if(str.length() == 1){
    		return 0;
    	}
    	ArrayList<String> list = new  ArrayList<String>();
    	for(char i:str.toCharArray()){
    		list.add(String.valueOf(i));
    	}
    	Collections.sort(list);
    	System.out.println(list);
    	ArrayList<String> results = new  ArrayList<String>();
    	for(int i=1; i<list.size()-1; i++){
    		if(!list.get(i).equals(list.get(i+1)) && !list.get(i).equals(list.get(i-1))){
    			results.add(list.get(i));
    		}
    	}
    	//如果最后一个元素与它的前一个不相等 就放入
    	if(list.size()>1 && !list.get(list.size()-1).equals(list.get(list.size()-2))){
    		results.add(list.get(list.size()-1));
    	}
    	//如果第一个元素与它的后一个不相等 就放入
    	if(list.size()>1 && !list.get(0).equals(list.get(1))){
    		results.add(list.get(0));
    	}
        return findMin(results, str);
    }
    
    public static int findMin(ArrayList<String> list, String str){
    	if(list.size() == 0){
    		return -1;
    	}
    	System.out.println(list);
    	int result = str.indexOf(list.get(0));
    	for(int i=1; i<list.size(); i++){
    		int pre = str.indexOf(list.get(i));
    		result = pre > result? result:pre;
    	}
    	return result;
    }
    
    public static void main(String[] args) {
		System.out.println(FirstNotRepeatingChar("google"));//
	}
}