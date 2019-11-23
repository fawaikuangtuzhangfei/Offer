package d07;

/**
 * 쳲���������
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n��
 *����0��ʼ����0��Ϊ0���� n<=39 F(1)=1��F(2)=1, F(n)=F(n-1)+F(n-2)��n>=3��n��N*��
 *
 * ˼·2:
 * ���ڴ����� n С�� 40����˿��Խ�ǰ 40 ��Ľ���Ƚ��м��㣬֮������� O(1) ʱ�临�Ӷȵõ��� n ���ֵ
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