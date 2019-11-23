package �������ų���С����;

import java.util.ArrayList;
import java.util.Collections;

/**
 * �������ų���С����
 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 * 
 * ˼·:
 * ȫ���� Ȼ������ ȡ��1��
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
