package d07;

/**
 * 斐波那契数列
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项
 *（从0开始，第0项为0）。 n<=39 F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
 *
 * 思路2:
 * 利用动态规划把子问题的解缓存起来，从而避免重复求解子问题。
 * 由于每次计算的时候都会使用目前n的前两项,所以最好存储起来避免重复计算.
 * @author 77515
 *
 */
public class Solution2 {
    public int Fibonacci(int n) {
    	if(n == 1 || n ==2){
    		return 1;
    	}
    	int pre1 = 1;
    	int pre2 = 1;
    	int sum = 0;
    	for(int i=2; i<n; i++){
    		sum = pre1 + pre2;
    		pre1 = pre2;
    		pre2 = sum;
    	}
    	return sum;
    }
}