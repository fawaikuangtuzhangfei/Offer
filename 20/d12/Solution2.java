package d12;


/**
 * ��ֵ�������η�
 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
 * 
 * ˼·:
 * ��ʹ�õݹ�,ʹ��ѭ��
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
