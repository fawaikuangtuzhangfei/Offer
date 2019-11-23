package d07;

/**
 * 斐波那契数列
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项
 *（从0开始，第0项为0）。 n<=39 F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
 *
 * 思路2:
 * 由于待求解的 n 小于 40，因此可以将前 40 项的结果先进行计算，之后就能以 O(1) 时间复杂度得到第 n 项的值
 * @author 77515
 *
 */
public class Solution3 {
	private int [] fn = new int[40];
	public Solution3(){
		fn[1] = 1;
		for(int i=2; i<fn.length; i++){
			fn[i] = fn[i-1] + fn[i-2];
		}
	}
    public int Fibonacci(int n) {
    	return fn[n];
    }
    
}