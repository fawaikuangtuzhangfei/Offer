package d10;

/**
 * ���θ���
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 * 
 * ˼·1: ->쳲���������
 * ��̬�滮
 * @author 77515
 *
 */
public class Solution {
    public int RectCover(int target) {
    	int pre1 = 1;
    	int pre2 = 2;
    	if(target <= 2){
    		return target;
    	}
    	int sum = 0;
    	for(int i=2; i<target; i++){
    		sum = pre1 + pre2;
    		pre1 = pre2;
    		pre2 = sum;
    	}
    	return sum;
    }
}
