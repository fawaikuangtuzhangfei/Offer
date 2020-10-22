package d51�����˻�����;

/**
 * ����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],
 * ����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]��
 * ����ʹ�ó�������ע�⣺�涨B[i] = A[1] * A[2] * ... * A[n-1]		B[n-1] = A[0] * A[1] * ... * A[n-2];��
 * ����A����Ϊ1�������B�����壬�ʶ��޷���������˸����������ڡ�
 * 
 * B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]
 * ˼·:
 * ����forѭ�� O(n2)
 * 
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020��10��22�� ����9:57:31
 */
public class Solution {
    public int[] multiply(int[] A) {
    	int[] B = new int[A.length];
    	for (int i = 0; i < B.length; i++) {
			B[i] = 1;
		}
    	for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if(i == j){
					continue;
				}
				B[i] = B[i]*A[j];
			}
		}
    	return B;
    }
}
