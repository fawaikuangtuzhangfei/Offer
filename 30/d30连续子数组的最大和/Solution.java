package d30连续子数组的最大和;

/**
 * 连续子数组的最大和
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
 * 今天测试组开完会后,他又发话了:
 * 在古老的一维模式识别中,常常需要计算连续子向量的最大和,
 * 当向量全为正数的时候,问题很好解决。但是,如果向量中包含负数,
 * 是否应该包含某个负数,并期望旁边的正数会弥补它呢？
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)->6 -3 -2 7
 * 给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 * 
 * 思路: 动态规划
 * res保存结果
 * max为选择该数与不选择该数的最大值
 * eg:{6,-3,-2,7,-15,1,2,2} 
 * f(1) res=6 max=6 -> max=max(6-3,-3)=3 res=max(max,res)=max(3,6)=6
 * f(2) res=6 max=3 -> max=max(3-2,-2)=1 res=max(max,res)=max(1,6)=6
 * f(3) res=6 max=1 -> max=max(1+7,7) =8 res=max(8,6)=8
 * f(4) res=8 max=8 -> max=max(8-15,-15)=-7 res=max(-7,8)=8
 * ...
 * @author nanshoudabaojian
 *
 */
public class Solution {
    public static int FindGreatestSumOfSubArray(int[] array) {
    	int result = array[0];
    	int max = array[0];
    	for(int i=1; i<array.length; i++){
    		max = Math.max(array[i], array[i] + max);
    		result = Math.max(result, max);
    	}
    	return result;
    }
    public static void main(String[] args) {
    	int[] arr = {0, -2, -7, 0,9, 2, -6 ,2 ,-4, 1, -4, 1,-1, 8, 0, -2};
		System.out.println(FindGreatestSumOfSubArray(arr));
	}
}