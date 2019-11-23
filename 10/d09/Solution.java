package d09;

/**
 * 变态跳台阶
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 
 * 思路:
 * target=1 0 
 * target=2 0 1
 * target=3 0 1 2
 * target=4 0 1 2 3 
 * target=n 0 1 2 3 n-2  n-1  
 * n=0+1+2+3+n-2+n-1
 * n-1=0+1+2+3+n-2
 * n=0+1+2+3+(n-1-0-1-2-3...)+n-1
 * 	=2(n-1)
 * @author 77515
 *
 */
public class Solution {
    public int JumpFloorII(int target) {
        if(target == 1){
        	return 1;
        }
        return 2*JumpFloorII(target-1);
    }
}