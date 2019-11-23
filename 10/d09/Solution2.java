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
 * 使用动态规划,把每一步算出来的值都存储起来,以备后面使用
 * @author 77515
 *
 */
public class Solution2 {
	public static void main(String[] args) {
		System.out.println(JumpFloorII(3));
	}
    public static int JumpFloorII(int target) {
    	int [] arr = new int[target+1];
    	arr[0] = 1;
    	arr[1] = 1;
    	
    	for(int i=2; i<=target; i++){
    		for(int j=0; j<i; j++){
    			arr[i] += arr[j];
    		}
    	}
    	return arr[target];
    }
}