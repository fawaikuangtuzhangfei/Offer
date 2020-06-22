package d42��ΪS����������;

import java.util.ArrayList;

/**
 * ����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
 * 
 * ��Ӧÿ�����԰����������������С���������
 * 
 * ˼·:
 * ��Զ����С�ĺ����ĳ˻���С��Ҳ��������ĵ�һ�������һ����
 * ��������ָ�룬������>S����ô��ָ���ƶ�
 * ���<S����ô��ָ���ƶ�
 * 
 * ���������
 * ����ĳ���<2  -> return ������
 * û�з��������������� ->return ������
 * 
 * @author nanshoudabaojian
 *
 */
public class Solution {
	public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if(array.length < 2 || array == null){
			return result;
		}
		
        int left = 0;
        int right = array.length - 1;
        
        int rightNum = array[right];
        int leftNum = array[left];
        
        int count = rightNum + leftNum;
        
        while(true){
        	if(count == sum || left >= right){
        		break;
        	}
        	if(count > sum){
        		right--;
        		rightNum = array[right];
        	}else{
        		left++;
        		leftNum = array[left];
        	}
        	
        	count = rightNum + leftNum;
        }
        
        result.add(leftNum);
        result.add(rightNum);
        if(left >= right){
        	result.clear();
        	return result;
        }
        return result;
    }
	
	/**
	 * ������һ����д��������
	 * @param array
	 * @param sum
	 * @return
	 */
	public static ArrayList<Integer> FindNumbersWithSum2(int [] array,int sum) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if(array.length < 2 || array == null){
			return result;
		}
		int low = 0;
		int hight = array.length - 1;
		while(low < hight){
			int tempSum = array[low] + array[hight];
			if(tempSum == sum){
				result.add(array[low]);
				result.add(array[hight]);
				break;
			}else if(tempSum > sum){
				hight--;
			}else{
				low++;
			}
		}
		return result;
	}
}
