package d07;

/**
 * 쳲���������
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n��
 *����0��ʼ����0��Ϊ0���� n<=39 F(1)=1��F(2)=1, F(n)=F(n-1)+F(n-2)��n>=3��n��N*��
 *
 * ˼·1:
 * ���õݹ���,�������ܲ���,��ͬ�����ݻ��ظ�����,���һ�������ɶ����������
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