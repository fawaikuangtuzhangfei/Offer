package d51构建乘积数组;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。（注意：规定B[i] = A[1] * A[2] * ... * A[n-1]		B[n-1] = A[0] * A[1] * ... * A[n-2];）
 * 对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。
 * 
 * B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]
 * 思路:
 * 两层for循环 O(n2)
 * 
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020年10月22日 上午9:57:31
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
