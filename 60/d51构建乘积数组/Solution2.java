package d51构建乘积数组;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。（注意：规定B[i] = A[1] * A[2] * ... * A[n-1]		B[n-1] = A[0] * A[1] * ... * A[n-2];）
 * 对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。
 * 
 * B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]
 * 思路:
 * 一层for循环 从左向右 从右向左
 * a=1 2 3 4 5
 * 
 * 第一次循环
 * 第一次：
 * B[0a] = 1
 * B[1a]= B[0]*A[0]
 * B[2a]= B[1]*A[1]
 * ...
 * B[4a] =B[0] B[1] B[2] * A[3]
 * 
 * 第二次循环
 * B[4b] = 1*B[4a]
 * ...
 * B[2b] = A[3]*B[2a] (A[3] A[1] A[0])
 * 
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020年10月22日 上午9:57:31
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
