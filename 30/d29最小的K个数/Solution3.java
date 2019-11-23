package d29最小的K个数;

import java.util.ArrayList;

/**
 * 最小的K个数
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * 
 * 排好序后 取最前面的k个
 * 练习回顾堆排序
 * heapInsert heapify
 * heapInsert:每次将要插入的元素自底向上不断与父节点进行比较，若大于则交换，直到小于
 * 利用的是完全二叉树的规则 左=(f*2)+1 右=(f*2)+2
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
		//将堆顶和最后一个元素进行交互
		swap(input, 0, size--);
		//不断的将最后一个元素取出来，然后重新建立堆
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
	//建立大根堆的过程(也就是排序的过程)->将堆顶元素置于最后一个 同时size--(表示已经排好序了),接着再进行排序
	//再次排序的时候自顶向下,不断与它孩子中的最大值进行比较，若小于则交换，直到大于
	public static void heapify(int[] input, int index, int heapSize){
		int left = (index*2)+1;
		while(left <= heapSize){
			//左右孩子找最大
			int largest = left+1 <= heapSize && input[left]<input[left+1]?input[left+1]:input[left];
			//如果大于则停止
			if(input[index] >= largest){
				break;
			}
			//左还是右
			largest = largest==input[left]? left:left+1;
			//小于就交换 然后继续比较
			swap(input, index, largest);
			index = largest;
			left = (largest*2)+1;
		}
	}
	//初始化->每次将要插入的元素自底向上不断与父节点进行比较，若大于则交换，直到小于
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
