package d12;


/**
 * ��ֵ�������η�
 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
 * 
 * ˼·:
 * ������ ->ͨ����λ�������ϵĽ�������
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
        	//�жϵ�ǰ��λ�Ƿ�Ϊ1,��Ϊ1�����յĽ��*��ǰ�Ļ���ֵ
        	//eg:
	    	if((exponent&1) == 1){
	        	sum *= base;
	        }
	    	//ÿ�ƶ�һλ������ֵ���ӱ�
	    	//eg:exponent=3 ��ÿ�ƶ�һ�α�Ϊ3��ƽ��
	        base *= base;
	        System.out.println(base);
	        exponent >>= 1;
        }
		
        
        return isF? 1/sum:sum;
  }
}
