package d08;

/**
 * ��̨��
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
 * �����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
 * 
 * ˼·1:
 * ������������ x��y,�ֱ���������1����2��
 * target=1 1
 * target=2 2
 * ��ʵ������1x+2y=target
 * @author 77515
 *
 */
public class Solution {
    public int JumpFloor(int target) {
    	if(target == 1){
    		return 1;
    	}
    	if(target == 2){
    		return 2;
    	}
    	int pre1 = 1;
    	int pre2 = 2;
    	int sum = 0;
    	for(int i=2; i<target; i++){
    		sum = pre1 + pre2;
    		pre1 = pre2;
    		pre2 = sum;
    	}
    	return sum;
    }
}