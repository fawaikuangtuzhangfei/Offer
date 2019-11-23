package d29最小的K个数;

import java.util.ArrayList;

/**
 * 最小的K个数
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * 
 * 排好序后 取最前面的k个
 * 练习快排
 * @author nanshoudabaojian
 *
 */
public class Solution2 {
	
	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(input.length < k){
			return result;
		}
		quickSort(input, 0, input.length-1);
		for(int i=0; i<k; i++){
			result.add(input[i]);
		}
        return result;
    }
	
	public static void quickSort(int[] arr, int l, int r){
		if(l < r){
			int i = partation(arr, l, r);
			quickSort(arr,l, i-1);
			quickSort(arr, i+1, r);
		}
	}
	
	public static int partation(int[] arr, int l, int r){
		//设arr[r]为基准值
		int num = arr[r];
		int more = r;
		int less = l-1;
		while(l < more){
			if(arr[l] < num){
				swap(arr, l++, ++less);
			}else if(arr[l] > num){
				swap(arr, l, more--);
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
