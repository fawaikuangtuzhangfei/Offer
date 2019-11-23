package d10;

/**
 * 矩形覆盖
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 
 * 思路1: ->斐波那契数列
 * 动态规划
 * @author 77515
 *
 */
public class Solution {
    public int RectCover(int target) {
    	int pre1 = 1;
    	int pre2 = 2;
    	if(target <= 2){
    		return target;
    	}
    	int sum = 0;
    	for(int i=2; i<target; i++){
    		sum = pre1 + pre2;
    		pre1 = pre2;
    		pre2 = sum;
    	}
    	return sum;
    }
}
