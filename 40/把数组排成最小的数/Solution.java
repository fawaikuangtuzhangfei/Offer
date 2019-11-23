package 把数组排成最小的数;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 把数组排成最小的数
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * 
 * 思路:
 * 全排列 然后排序 取第1个
 * @author nanshoudabaojian
 *
 */

public class Solution {
	
    public static String PrintMinNumber(int [] numbers) {
    	if(numbers.length == 0){
    		return "";
    	}
    	ArrayList<String> list = new ArrayList<String>();
    	allSort(numbers, 0, numbers.length-1,list);
    	Collections.sort(list);
    	return list.get(0);
    }
    
    public static void allSort(int[] arr, int index, int end, ArrayList<String> list){
    	if(index == end){
    		String s ="";
    		for(int i=0; i<=end; i++){
    			s += arr[i];
    		}
    		list.add(s);
    		return;
    	}
    	
    	for(int i=0; i<=end; i++){
    		swap(arr,index, i);
    		allSort(arr, index+1, end,list);
    		swap(arr,index, i);
    	}
    }
    
    public static void swap(int[] arr, int i, int j){
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }
    
    public static void main(String[] args) {
		int[] arr = {3,32,321};
		System.out.println(PrintMinNumber(arr));
	}
}
