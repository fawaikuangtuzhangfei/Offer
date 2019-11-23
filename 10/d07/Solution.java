package d07;

/**
 * 斐波那契数列
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项
 *（从0开始，第0项为0）。 n<=39 F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
 *
 * 思路1:
 * 利用递归来,但是性能不好,相同的数据会重复计算,而且还可能造成堆溢出等问题
 * @author 77515
 *
 */
public class Solution {
    public int Fibonacci(int n) {
    	if(n == 1 || n ==2){
    		return 1;
    	}
    	int sum = 0;
    	if(n-2 > 0){
    		sum = Fibonacci(n-1) + Fibonacci(n-2);
    	}
    	return sum;
    }
}