package d37数字在排序数组中出现的次数;

/**
 * 统计一个数字在排序数组中出现的次数。
 * 
 * 思路:
 * 有序即二分
 * 用二分找到第一个相等的 如何往前看看 往后看看
 * 
 * @author nanshoudabaojian
 *
 */
public class Solution2 {
    public int GetNumberOfK(int [] array , int k) {
    	int result = 0;
    	int l = 0;
    	int r = array.length-1;
    	
    	while(l <= r){
    		int m = l+((r-l)>>1);
    		
    		if(array[m] > k){
    			r = m-1;
    		}else if(array[m] < k){
    			l = m+1;
    		}else{
    			result++;
    			int index = m-1;
    			//往前看看
    			while(index>=0 && array[index--] == k){
					result++;
    			}
    			index = m+1;
    			//往后看看
    			while(index<array.length && array[index++] == k){
					result++;
    			}
    			break;
    		}
    	}
    	return result;
    }
}
