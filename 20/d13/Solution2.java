package d13;

/**
 * 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 
 * 思路:
 * 使用冒泡的思想,从后往前,把遇到的偶数全部放在最右边
 * @author 77515
 *
 */
public class Solution2 {
	public void mp(int [] array){
		
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6};
		reOrderArray(arr);
	}
    public static void reOrderArray(int [] array) {
    	for(int i=array.length-1; i>0; i--){
    		for(int j=0; j<i; j++){
    			if(isOdd(array[j]) && !isOdd(array[j+1])){
    				swap(array,j, j+1);
    			}
    		}
    	}
    }
    //交换
    public static void swap(int [] arr, int i, int j){
    	int t=arr[i];
    	arr[i]=arr[j];
    	arr[j]=t;
    }
    //用于判断当前数字是否为偶数
    public static boolean isOdd(int i){
    	return i%2==0;
    }
}
