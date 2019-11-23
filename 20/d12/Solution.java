package d12;


/**
 * ��ֵ�������η�
 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
 * 
 * ˼·1:
 * ���ϵ���Сexponent�Ĺ�ģ
 * ��exponent%2==0 (base*base)��exponent/2�η�
 * ��exponent%2!=0 base*(base*base)��exponent/2�η�
 * ͬʱ��Ҫ�����������
 * 1.exponent==0ʱ return 1
 * 2.exponent==1ʱ return base
 * 3.exponent<0ʱ return 1/��� ����һ����ʶ��ע
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
