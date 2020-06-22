package d42和为S的两个数字;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 
 * 对应每个测试案例，输出两个数，小的先输出。
 * 
 * 思路:
 * 永远是最小的和最大的乘积最小，也就是数组的第一个和最后一个。
 * 设置两个指针，如果相加>S，那么右指针移动
 * 如果<S，那么左指针移动
 * 
 * 特殊情况：
 * 数组的长度<2  -> return 空数组
 * 没有符合条件的两个数 ->return 空数组
 * 
 * @author nanshoudabaojian
 *
 */
public class Solution {
	public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if(array.length < 2 || array == null){
			return result;
		}
		
        int left = 0;
        int right = array.length - 1;
        
        int rightNum = array[right];
        int leftNum = array[left];
        
        int count = rightNum + leftNum;
        
        while(true){
        	if(count == sum || left >= right){
        		break;
        	}
        	if(count > sum){
        		right--;
        		rightNum = array[right];
        	}else{
        		left++;
        		leftNum = array[left];
        	}
        	
        	count = rightNum + leftNum;
        }
        
        result.add(leftNum);
        result.add(rightNum);
        if(left >= right){
        	result.clear();
        	return result;
        }
        return result;
    }
	
	/**
	 * 和上面一样，写法无冗余
	 * @param array
	 * @param sum
	 * @return
	 */
	public static ArrayList<Integer> FindNumbersWithSum2(int [] array,int sum) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if(array.length < 2 || array == null){
			return result;
		}
		int low = 0;
		int hight = array.length - 1;
		while(low < hight){
			int tempSum = array[low] + array[hight];
			if(tempSum == sum){
				result.add(array[low]);
				result.add(array[hight]);
				break;
			}else if(tempSum > sum){
				hight--;
			}else{
				low++;
			}
		}
		return result;
	}
}
