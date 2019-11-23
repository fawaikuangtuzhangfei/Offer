package d12;


/**
 * 数值的整数次方
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 
 * 思路:
 * 不使用递归,使用循环
 * @author 77515
 *
 */
public class Solution2 {
	public double Power(double base, int exponent) {
		double sum = 1;
		if(exponent == 0){
			return 1;
		}else if(exponent > 0){
			for(int i=0; i<exponent; i++){
				sum *= base;
			}
		}else{
			for(int i=0; i<-exponent; i++){
				sum *= base;
			}
			sum = 1/sum;
		}
		return sum;
	}
}
