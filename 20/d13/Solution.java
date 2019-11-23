package d13;


/**
 * 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 
 * 思路:
 * 设置一个奇数数组专门用于存放奇数,随后再把偶数添加进行
 * @author 77515
 *
 */
public class Solution {
    public void reOrderArray(int [] array) {
    	//记录奇数的数量
    	int count = 0;
    	for(int i:array){
    		if(!isOdd(i)){
    			++count;
    		}
    	}
    	int length = array.length;
    	//复制数组
    	int [] arr = array.clone();
    	int a=0;
    	for(int i=0; i<length; i++){
    		if(!isOdd(arr[i])){
    			array[a++] = arr[i];
    		}else{
    			array[count++] = arr[i];
    		}
    	}
    }
    public boolean isOdd(int a){
    	return a%2==0? true:false;
    }
}
