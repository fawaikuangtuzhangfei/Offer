package d07;

/**
 * 쳲���������
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n��
 *����0��ʼ����0��Ϊ0���� n<=39 F(1)=1��F(2)=1, F(n)=F(n-1)+F(n-2)��n>=3��n��N*��
 *
 * ˼·2:
 * ���ö�̬�滮��������Ľ⻺���������Ӷ������ظ���������⡣
 * ����ÿ�μ����ʱ�򶼻�ʹ��Ŀǰn��ǰ����,������ô洢���������ظ�����.
 * @author 77515
 *
 */
public class Solution2 {
    public int Fibonacci(int n) {
    	if(n == 1 || n ==2){
    		return 1;
    	}
    	int pre1 = 1;
    	int pre2 = 1;
    	int sum = 0;
    	for(int i=2; i<n; i++){
    		sum = pre1 + pre2;
    		pre1 = pre2;
    		pre2 = sum;
    	}
    	return sum;
    }
}