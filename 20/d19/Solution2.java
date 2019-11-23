package d19;

import java.util.ArrayList;

/**
 * ˳ʱ���ӡ����
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * 
 * ˼·:
 * ����תħ��һ��,���ϵ�ȡ����������ת����
 * 123
 * 456  ->�Ȱѵ�һ��ȡ���� ʣ�� 456 ->������ת90��   69   
 * 789  					  789				 58
 * @author 77515								 49	
 * 
 * �ܽ�:
 * ��һ����Խ�С������ȥ˼��
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
    		//ȡ����һ��
        	for(int i=0; i<xlength; i++){
        		arr.add(matrix[0][i]);
        	}
        	//��ֻʣ��һ�� ֱ�ӵ���
        	if(ylength == 1){
        		break;
        	}
        	//ɾ����һ�в���ת����
        	matrix = reverse(matrix);
        	xlength = matrix[0].length;
        	ylength = matrix.length;
    	}
    	return arr;
    }
    public static int[][] reverse(int[][] matrix){
    	//��õ�ǰ����ĳ��Ϳ�
    	int ylength = matrix.length;
    	int xlength = matrix[0].length;
    	//ɾ����ԭ����ĵ�һ�в���ת
    	int[][] newMatrix = new int[xlength][ylength-1];
    	//�������鸳ֵ
    	for(int i=1; i<ylength; i++){
    		for(int j=xlength-1; j>=0; j--){
    			newMatrix[xlength-j-1][i-1] = matrix[i][j];
    		}
    	}
    	return newMatrix;
    }
}
