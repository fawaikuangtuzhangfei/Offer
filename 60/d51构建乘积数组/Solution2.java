package d51�����˻�����;

/**
 * ����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],
 * ����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]��
 * ����ʹ�ó�������ע�⣺�涨B[i] = A[1] * A[2] * ... * A[n-1]		B[n-1] = A[0] * A[1] * ... * A[n-2];��
 * ����A����Ϊ1�������B�����壬�ʶ��޷���������˸����������ڡ�
 * 
 * B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]
 * ˼·:
 * һ��forѭ�� �������� ��������
 * a=1 2 3 4 5
 * 
 * ��һ��ѭ��
 * ��һ�Σ�
 * B[0a] = 1
 * B[1a]= B[0]*A[0]
 * B[2a]= B[1]*A[1]
 * ...
 * B[4a] =B[0] B[1] B[2] * A[3]
 * 
 * �ڶ���ѭ��
 * B[4b] = 1*B[4a]
 * ...
 * B[2b] = A[3]*B[2a] (A[3] A[1] A[0])
 * 
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020��10��22�� ����9:57:31
 */
public class Solution2 {
	
	public static void main(String[] args) {
		int[] a = {3,2,3,4,5};
		multiply(a);
	}
	
	public static int[] multiply(int[] A) {
	    int n = A.length;
	    int[] B = new int[n];
	    for(int i=0, temp = 1; i<n; temp *= A[i],i++){
	    	B[i] = temp;
	    }
	    for(int i=n-1, temp = 1; i>=0; temp *= A[i],i--){
	    	B[i] *= temp;
	    }
	    
	    return B;
	}

}
