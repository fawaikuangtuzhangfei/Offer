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
 * n=0+1+2+3+n-2+n-1
 * n-1=0+1+2+3+n-2
 * n=0+1+2+3+(n-1-0-1-2-3...)+n-1
 * 	=2(n-1)
 * @author 77515
 *
 */
public class Solution {
    public int JumpFloorII(int target) {
        if(target == 1){
        	return 1;
        }
        return 2*JumpFloorII(target-1);
    }
}