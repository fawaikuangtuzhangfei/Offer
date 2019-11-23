package d30���������������;

/**
 * ���������������
 * HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ��
 * ��������鿪����,���ַ�����:
 * �ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,
 * ������ȫΪ������ʱ��,����ܺý��������,��������а�������,
 * �Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
 * ����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)->6 -3 -2 7
 * ��һ�����飬��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)
 * 
 * ˼·: ��̬�滮
 * res������
 * maxΪѡ������벻ѡ����������ֵ
 * eg:{6,-3,-2,7,-15,1,2,2} 
 * f(1) res=6 max=6 -> max=max(6-3,-3)=3 res=max(max,res)=max(3,6)=6
 * f(2) res=6 max=3 -> max=max(3-2,-2)=1 res=max(max,res)=max(1,6)=6
 * f(3) res=6 max=1 -> max=max(1+7,7) =8 res=max(8,6)=8
 * f(4) res=8 max=8 -> max=max(8-15,-15)=-7 res=max(-7,8)=8
 * ...
 * @author nanshoudabaojian
 *
 */
public class Solution {
    public static int FindGreatestSumOfSubArray(int[] array) {
    	int result = array[0];
    	int max = array[0];
    	for(int i=1; i<array.length; i++){
    		max = Math.max(array[i], array[i] + max);
    		result = Math.max(result, max);
    	}
    	return result;
    }
    public static void main(String[] args) {
    	int[] arr = {0, -2, -7, 0,9, 2, -6 ,2 ,-4, 1, -4, 1,-1, 8, 0, -2};
		System.out.println(FindGreatestSumOfSubArray(arr));
	}
}