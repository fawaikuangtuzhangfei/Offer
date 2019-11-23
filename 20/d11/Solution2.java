package d11;

/**
 * 二进制中1的个数
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 
 * 思路: n&(n-1)
 * 直接利用API
 * @author 77515
 *
 */
public class Solution2 {
	public  int NumberOf1(int n) {
		return Integer.bitCount(n);
	}
}