package d30连续子数组的最大和;

/**
 * 最大子矩阵
 * 已知矩阵的大小定义为矩阵中所有元素的和。
 * 给定一个矩阵，你的任务是找到最大的非空(大小至少是1 * 1)子矩阵。
 * 比如，如下4 * 4的矩阵 
 * 0 -2 -7 0 
 * 9 2 -6 2 
 * -4 1 -4 1 
 * -1 8 0 -2 
 * 的最大子矩阵是 
 * 9 2 
 * -4 1 
 * -1 8 
 * 这个子矩阵的大小是15。
 * 
 * 思路: 动态规划
 * eg:先第从第一行开始 整个扫描找最大
 * 然后不断缩小行 整个扫描找最大
 * 将这个二维数组当作一维数组->将列上的相加 不断的找最大
 * eg:
 * 0 -2 -7 0  ->  9 0 -13 2 ->9
 * 9 2 -6 2 
 * 
 * @author nanshoudabaojian
 *
 */
public class Solution_max {
	//一维数组中求最大连续和
	public static int findMax(int[] arr){
		int max = arr[0];
		int res = max;
		for(int i=1; i<arr.length; i++){
			max = Math.max(arr[i], arr[i] + max);
			res = Math.max(max, res);
		}
		return res;
	}
	//寻找最大矩阵
	public static int findRect(int[][] arr){
		int max = Integer.MIN_VALUE;
		int m = arr.length;
		int n = arr[0].length;
		for(int i=0; i<m; i++){
			//借用此矩阵来求得
			int[] temp = new int[n];
			for(int j=i; j<m; j++){
				for(int k=0; k<n; k++){
					temp[k] += arr[j][k];
				}
				max = Math.max(max, findMax(temp));
			}
		}
		return max;
	}
	
    public static void main(String[] args){
    	int[] arr1 = {0, -2, -7, 0,9, 2, -6 ,2 ,-4, 1, -4, 1,-1, 8, 0, -2};
		System.out.println(findMax(arr1));
    	int [][] arr = {{0, -2, -7, 0},
    					{9 ,2 ,-6, 2},
    					{-4, 1,-4,  1},
    					{-1, 8 , 0 ,-2}
    	};
    	System.out.println(findRect(arr));
    }
}