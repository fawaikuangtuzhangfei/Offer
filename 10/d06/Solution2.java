package d06;

/**
 * ��Ŀ:��ת�������С����
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� 
 * ����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء� 
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * ˼·2:
 * ���ö��ַ��ҳ���С��
 * 1.��mid>right,����С����mid���ұ�
 * 2.��mid<right,����С����mid�����
 * 3.��mid=1,��
 * ע��:
 * 
 * 
 * @author 77515
 *
 */
public class Solution2 {
	public static void main(String[] args) {
		int [] arry = {5,8,5,5,5};
		int n = minNumberInRotateArray(arry);
		System.out.println(n);
	}
    public static int minNumberInRotateArray(int [] array) {
    	//�������СΪ0->����0
    	if(array.length <= 0){
    		return 0;
    	}
    	int left = 0;
    	int right = array.length -1;
    	
    	int mid = 0;
    	while(right > left){
    		//�൱��mid=(right+left)/2 ���������д�����Է�ֹ����Խ��
    		mid = left + (right - left) / 2;
    		if(array[mid] > array[right]){
    			left = mid + 1;
    		}else if(array[mid] < array[right]){
    			right = mid;
    		}else{
    			//��mid=right,��ݼ�һ��һ������
    			right = right-1;
    		}
    	}
    	return array[left];
    }
}
