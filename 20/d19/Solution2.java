package d19;

import java.util.ArrayList;

/**
 * 顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * 
 * 思路:
 * 像旋转魔方一样,不断的取出数并且旋转数组
 * 123
 * 456  ->先把第一行取出来 剩下 456 ->逆向旋转90°   69   
 * 789  					  789				 58
 * @author 77515								 49	
 * 
 * 总结:
 * 找一个相对较小的例子去思考
 *
 */
public class Solution2 {
	public static void main(String[] args) {
		int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printMatrix(matrix);
	}
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	int ylength = matrix.length;
    	int xlength = matrix[0].length;
    	while(xlength > 0){
    		//取出第一行
        	for(int i=0; i<xlength; i++){
        		arr.add(matrix[0][i]);
        	}
        	//若只剩下一行 直接弹出
        	if(ylength == 1){
        		break;
        	}
        	//删除第一行并旋转数组
        	matrix = reverse(matrix);
        	xlength = matrix[0].length;
        	ylength = matrix.length;
    	}
    	return arr;
    }
    public static int[][] reverse(int[][] matrix){
    	//获得当前数组的长和宽
    	int ylength = matrix.length;
    	int xlength = matrix[0].length;
    	//删除掉原数组的第一行并旋转
    	int[][] newMatrix = new int[xlength][ylength-1];
    	//给新数组赋值
    	for(int i=1; i<ylength; i++){
    		for(int j=xlength-1; j>=0; j--){
    			newMatrix[xlength-j-1][i-1] = matrix[i][j];
    		}
    	}
    	return newMatrix;
    }
}
