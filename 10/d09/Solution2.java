package d09;


/**
 * ��̬��̨��
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
 * 
 * ˼·:
 * target=1 0 
 * target=2 0 1
 * target=3 0 1 2
 * target=4 0 1 2 3 
 * target=n 0 1 2 3 n-2  n-1  
 * ʹ�ö�̬�滮,��ÿһ���������ֵ���洢����,�Ա�����ʹ��
 * @author 77515
 *
 */
public class Solution2 {
	public static void main(String[] args) {
		System.out.println(JumpFloorII(3));
	}
    public static int JumpFloorII(int target) {
    	int [] arr = new int[target+1];
    	arr[0] = 1;
    	arr[1] = 1;
    	
    	for(int i=2; i<=target; i++){
    		for(int j=0; j<i; j++){
    			arr[i] += arr[j];
    		}
    	}
    	return arr[target];
    }
}