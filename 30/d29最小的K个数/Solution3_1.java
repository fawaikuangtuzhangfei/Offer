package d29��С��K����;

import java.util.ArrayList;

/**
 * ��С��K����
 * ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 * 
 * �ź���� ȡ��ǰ���k��
 * ��ϰ�ع˶�����
 * @author nanshoudabaojian
 *
 */
public class Solution3_1 {
	
	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(input.length == 0 || k > input.length){
			return result;
		}
		int size = input.length-1;
		for(int i=0; i<input.length; i++){
			heapInsert(input, i);
		}
		//�����һ��ȡ���ͶѶ�Ԫ�ؽ���
		swap(input, 0, size--);
		while(size > 0){
			heapify(input, 0, size);
			swap(input, 0, size--);
		}
		for(int i=0; i<input.length; i++){
			System.out.print(input[i] + " ");
		}
		for(int i=0; i<k; i++){
			result.add(input[i]);
		}
		System.out.println(result);
        return result;
    }
	//heapify->����Ĺ��̣��Զ����²�������С���򽻻�������ֹͣ
	public static void heapify(int[] arr, int index, int heapSize){
		int left = index*2+1;
		int right = left+1;
		while(left <= heapSize){
			int largest = right <= heapSize && arr[right] > arr[left]? arr[right]:arr[left];
			if(arr[index] >= largest){
				break;
			}
			largest = largest==arr[left]? left:right;
			swap(arr,index, largest);
			index = largest;
			left = index*2+1;
			right = left+1;
		}
	}
	
	//heapInsert->�Ե����ϲ��ϲ��뽨�ѣ��������򽻻�������ֹͣ
	public static void heapInsert(int[] arr, int index){
		int father = (index-1)/2;
		while(arr[index] > arr[father]){
			swap(arr, index, father);
			index = father;
			father = (index-1)/2;
		}
	}
	
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,5,1,6,2,7,3,8};
		//int[] arr = {4,5,1,6};
		GetLeastNumbers_Solution(arr,8);
	}
}
