package d29��С��K����;

import java.util.ArrayList;

/**
 * ��С��K����
 * ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 * 
 * �ź���� ȡ��ǰ���k��
 * �ع˿���:
 * quickSort��partation
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
		int num = input[r]; //����Ϊ��׼ֵ
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
