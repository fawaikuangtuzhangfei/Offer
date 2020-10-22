package d50数组中重复的数字;

import java.util.HashMap;
import java.util.Map;

/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 * 返回描述：
	如果数组中有重复的数字，函数返回true，否则返回false。
	如果数组中有重复的数字，把重复的数字放到参数duplication[0]中。（ps:duplication已经初始化，可以直接赋值使用。）
	
 * 思路: On On 烂
 * 利用map存储，包含就返回true，并将元素存入
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020年7月20日 下午4:51:46
 */
public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
    	if(numbers == null || numbers.length == 0){
    		return false;
    	}
    	Map<Integer, Boolean> result = new HashMap<>();
    	for (int i : numbers) {
    		if(result.containsKey(i)){
    			duplication[0] = i;
    			return true;
    		}
    		result.put(i, true);
		}
    	return false;
    
    }
}
