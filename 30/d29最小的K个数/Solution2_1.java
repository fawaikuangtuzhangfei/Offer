package d29最小的K个数;

import java.util.ArrayList;

/**
 * 最小的K个数
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * 
 * 排好序后 取最前面的k个
 * 回顾快排:
 * quickSort和partation
 * @author nanshoudabaojian
 *
 */
public class Solution2_1 {
	
	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(input.length == 0 || k > input.length){
			return result;
		}
		quickSort(input, 0, input.length-1);
		for(int i=0; i<input.length; i++){
			result.add(input[i]);
		}
		System.out.println(result);
        return result;
    }
	public static void quickSort(int[] input, int l, int r){
		if(l < r){
			int j = partation(input, l, r);
			quickSort(input, l, j-1);
			quickSort(input, j+1, r);
		}
	}
	
	public static int partation(int[] input, int l, int r){
		int num = input[r]; //设其为基准值
		int less = l-1;
		int more = r;
		while(l < more){
			if(input[l] > num){
				swap(input, l, more--);
			}else if(input[l] < num){
				swap(input, l++, ++less);
			}else{
				l++;
			}
		}
		return less+1;
	}
	
	
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,5,1,6,2,7,3,8};
		GetLeastNumbers_Solution(arr,4);
	}
}
