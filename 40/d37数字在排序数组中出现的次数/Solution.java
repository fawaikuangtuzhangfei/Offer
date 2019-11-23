package d37数字在排序数组中出现的次数;

/**
 * 统计一个数字在排序数组中出现的次数。
 * 
 * 
 * @author nanshoudabaojian
 *
 */
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
    	int result = 0;
    	for(int i=0; i<array.length; i++){
    		if(k < array[i]){
    			break;
    		}
    		if(array[i] == k){
    			result++;
    		}
    	}
    	return result;
    }
}
