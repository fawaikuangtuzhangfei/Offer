package d29最小的K个数;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 最小的K个数
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * 
 * 排好序后 取最前面的k个
 * @author nanshoudabaojian
 *
 */
public class Solution {
	
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(input.length < k){
			return result;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i:input){
        	list.add(i);
        }
        Collections.sort(list);
        for(int i=0; i<k; i++){
        	result.add(list.get(i));
        }
        return result;
    }
	
}
