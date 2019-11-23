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
 * 
 * 优化:
 * 若存在则位于排序后数组的中间那个数字一定是，循环判断此数出现的次数，若超过则return 否则0
 * @author nanshoudabaojian
 *
 */

public class Solution_1 {
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
        int count = 0;
        result = list.get(list.size()/2);
        for(int i=0; i<list.size(); i++){
        	if(result == list.get(i)){
        		count++;
        	}
        }
        if(count > array.length/2){
        	return result;
        }else{
        	return 0;
        }
    }
    public static void main(String[] args) {
    	int[] arr = {3, 1, 2, 3, 2, 3, 3, 4, 3};
    	System.out.println(MoreThanHalfNum_Solution(arr));
    }
		
}
