package d28n个数里出现次数大于等于n一半的数;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 数组中出现次数超过一半的数字
 * 题目描述
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 
 * 思路:
 * 1.进行排序然后循环排好序的数组，若某一个数字超过一半则return 否则0
 * @author nanshoudabaojian
 *
 */

public class Solution {
    public static int MoreThanHalfNum_Solution(int [] array) {
        int result = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(array.length == 1){
        	return array[0];
        }
        for(int i=0; i<array.length; i++){
        	list.add(array[i]);
        }
        Collections.sort(list);
        System.out.println(list);
        int count = 1;
        for(int i=1; i<list.size(); i++){
        	int temp = list.get(i-1);
        	int now = list.get(i);
        	if(temp == now){
        		count++;
        	}else{
        		count--;
        		if(count == 0){
            		count = 1;
            	}
        	}
        	if(count > array.length/2){
            	return temp;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
    	int[] arr = {3, 1, 2, 3, 2, 3, 3, 4, 3};
    	System.out.println(arr.length);
    	System.out.println(MoreThanHalfNum_Solution(arr));
    }
		
}
