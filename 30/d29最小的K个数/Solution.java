package d29��С��K����;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ��С��K����
 * ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 * 
 * �ź���� ȡ��ǰ���k��
 * @author nanshoudabaojian
 *
 */
public class Solution {
	
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(input.length < k){
			return result;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i:input){
        	list.add(i);
        }
        Collections.sort(list);
        for(int i=0; i<k; i++){
        	result.add(list.get(i));
        }
        return result;
    }
	
}
