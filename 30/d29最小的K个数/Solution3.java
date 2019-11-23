package d29��С��K����;

import java.util.ArrayList;

/**
 * ��С��K����
 * ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 * 
 * �ź���� ȡ��ǰ���k��
 * ��ϰ�ع˶�����
 * heapInsert heapify
 * heapInsert:ÿ�ν�Ҫ�����Ԫ���Ե����ϲ����븸�ڵ���бȽϣ��������򽻻���ֱ��С��
 * ���õ�����ȫ�������Ĺ��� ��=(f*2)+1 ��=(f*2)+2
 * @author nanshoudabaojian
 *
 */
public class Solution3 {
	
	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int size = input.length - 1;
		if(input.length < k || input.length <= 0){
			return result;
		}
		for(int i=0; i<input.length; i++){
			headInsert(input, i);
		}
		for(int i=0; i<input.length; i++){
			System.out.print(input[i] + " ");
		}
		//���Ѷ������һ��Ԫ�ؽ��н���
		swap(input, 0, size--);
		//���ϵĽ����һ��Ԫ��ȡ������Ȼ�����½�����
		while(size > 0){
			heapify(input, 0, size);
			swap(input, 0, size--);
		}
		for(int i=0; i<k; i++){
			result.add(input[i]);
		}
		System.out.println();
		System.out.println(result);
		for(int i=0; i<input.length; i++){
			System.out.print(input[i] + " ");
		}
        return result;
    }
	//��������ѵĹ���(Ҳ��������Ĺ���)->���Ѷ�Ԫ���������һ�� ͬʱsize--(��ʾ�Ѿ��ź�����),�����ٽ�������
	//�ٴ������ʱ���Զ�����,�������������е����ֵ���бȽϣ���С���򽻻���ֱ������
	public static void heapify(int[] input, int index, int heapSize){
		int left = (index*2)+1;
		while(left <= heapSize){
			//���Һ��������
			int largest = left+1 <= heapSize && input[left]<input[left+1]?input[left+1]:input[left];
			//���������ֹͣ
			if(input[index] >= largest){
				break;
			}
			//������
			largest = largest==input[left]? left:left+1;
			//С�ھͽ��� Ȼ������Ƚ�
			swap(input, index, largest);
			index = largest;
			left = (largest*2)+1;
		}
	}
	//��ʼ��->ÿ�ν�Ҫ�����Ԫ���Ե����ϲ����븸�ڵ���бȽϣ��������򽻻���ֱ��С��
	public static void headInsert(int[] input, int index){
		while(input[index] > input[(index-1)/2]){
			swap(input, index, (index-1)/2);
			index = (index-1)/2;
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
		GetLeastNumbers_Solution(arr,4);
	}
}
