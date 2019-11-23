package d30���������������;

/**
 * ����Ӿ���
 * ��֪����Ĵ�С����Ϊ����������Ԫ�صĺ͡�
 * ����һ����������������ҵ����ķǿ�(��С������1 * 1)�Ӿ���
 * ���磬����4 * 4�ľ��� 
 * 0 -2 -7 0 
 * 9 2 -6 2 
 * -4 1 -4 1 
 * -1 8 0 -2 
 * ������Ӿ����� 
 * 9 2 
 * -4 1 
 * -1 8 
 * ����Ӿ���Ĵ�С��15��
 * 
 * ˼·: ��̬�滮
 * eg:�ȵڴӵ�һ�п�ʼ ����ɨ�������
 * Ȼ�󲻶���С�� ����ɨ�������
 * �������ά���鵱��һά����->�����ϵ���� ���ϵ������
 * eg:
 * 0 -2 -7 0  ->  9 0 -13 2 ->9
 * 9 2 -6 2 
 * 
 * @author nanshoudabaojian
 *
 */
public class Solution_max {
	//һά�����������������
	public static int findMax(int[] arr){
		int max = arr[0];
		int res = max;
		for(int i=1; i<arr.length; i++){
			max = Math.max(arr[i], arr[i] + max);
			res = Math.max(max, res);
		}
		return res;
	}
	//Ѱ��������
	public static int findRect(int[][] arr){
		int max = Integer.MIN_VALUE;
		int m = arr.length;
		int n = arr[0].length;
		for(int i=0; i<m; i++){
			//���ô˾��������
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