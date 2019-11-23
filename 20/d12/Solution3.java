package d12;


/**
 * 数值的整数次方
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 
 * 思路:
 * 快速幂 ->通过移位操作不断的进行运算
 * eg:2^11
 * 2^1011 2^2^0 2^2^1 2^2^3
 * 2^1011 = 2^1 2^2 2^8
 * @author 77515
 *
 */
public class Solution3 {
	public static void main(String[] args) {
		System.out.println("result=" + Power(3,2));
	}
	
    public static double Power(double base, int exponent) {
       boolean isF = false;
		double sum = 1;
        if(exponent == 0){
			return 1;
		}else if(exponent < 0){
			isF = true;
            exponent = -exponent;
		}
        while(exponent != 0){
        	//判断当前数位是否为1,若为1则最终的结果*当前的基础值
        	//eg:
	    	if((exponent&1) == 1){
	        	sum *= base;
	        }
	    	//每移动一位，基础值均加倍
	    	//eg:exponent=3 则每移动一次变为3的平方
	        base *= base;
	        System.out.println(base);
	        exponent >>= 1;
        }
		
        
        return isF? 1/sum:sum;
  }
}
