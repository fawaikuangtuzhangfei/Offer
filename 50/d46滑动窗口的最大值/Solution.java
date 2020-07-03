package d46滑动窗口的最大值;

import java.util.ArrayList;

/**
 * 滑动窗口的最大值
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，
 * 如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： 
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 * 
 * 思路：
 * 简单 无脑 O(n*size)
 * 
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020年7月1日 下午3:12:22
 */
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	
    	if(size <= 0 || num.length <= 0){
    		return result;
    	}
    	// 第几个元素
    	int index = 0;
    	// 窗口中的最大值
    	int max = 0;
    	// 循环拿最大 拿到之后添加进去
    	while(index+size <= num.length){
    		max = num[index];
    		for(int i=1; i<size; i++){
    			max = Math.max(num[index+i], max);
    		}
			result.add(max);
			index++;
    	}
    	return result;
    }
}