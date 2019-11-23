package d12;


/**
 * 数值的整数次方
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 
 * 思路1:
 * 不断的缩小exponent的规模
 * 当exponent%2==0 (base*base)的exponent/2次方
 * 当exponent%2!=0 base*(base*base)的exponent/2次方
 * 同时需要考虑三种情况
 * 1.exponent==0时 return 1
 * 2.exponent==1时 return base
 * 3.exponent<0时 return 1/结果 设置一个标识标注
 * @author 77515
 *
 */
public class Solution {
	public static void main(String[] args) {
		double a = -2;
		System.out.println(Math.pow(-2, a));
	}
	public double Power(double base, int exponent) {
		boolean isF = false;
        if(exponent == 0){
        	return 1;
        }
        if(exponent == 1){
        	return base;
        }
        if(exponent < 0){
        	isF = true;
        	exponent = -exponent;
        }
        double sum = 0;
        if(exponent % 2 == 0){
        	sum = Power(base*base, exponent/2);
        }else{
        	sum = base * Power(base*base, exponent/2);
        }
        return isF? 1/sum: sum;
	  }
}
