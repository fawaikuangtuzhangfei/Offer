package d06;


/**
 * ��Ŀ:��ת�������С����
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� 
 * ����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء� 
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * ˼·3:
 * ֱ���ҵ���ʼ��С���Ǹ���
 * ע��:
 * 
 * 
 * @author 77515
 *
 */
public class Solution3 {
	public static void main(String[] args) {
		int [] arry = {5,8,1,5,5};
		int n = minNumberInRotateArray(arry);
		System.out.println(n);
	}
    public static int minNumberInRotateArray(int [] array) {
    	//�������СΪ0->����0
    	if(array.length <= 0){
    		return 0;
    	}
    	int min = 0;
    	for(int i=array.length-1; i>0; i--){
    		if(array[i] < array[i-1]){
    			min = i;
    			break;
    		}
    	}
    	return array[min];
    }
}
