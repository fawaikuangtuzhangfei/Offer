package d08;

/**
 * 跳台阶
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * 
 * 思路1:
 * 定义两个变量 x和y,分别代表可以跳1级和2级
 * target=1 1
 * target=2 2
 * 其实就是求1x+2y=target
 * @author 77515
 *
 */
public class Solution {
    public int JumpFloor(int target) {
    	if(target == 1){
    		return 1;
    	}
    	if(target == 2){
    		return 2;
    	}
    	int pre1 = 1;
    	int pre2 = 2;
    	int sum = 0;
    	for(int i=2; i<target; i++){
    		sum = pre1 + pre2;
    		pre1 = pre2;
    		pre2 = sum;
    	}
    	return sum;
    }
}