package d06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ��Ŀ:��ת�������С����
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� 
 * ����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء� 
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * ˼·1:
 * ����Collections��sort()����ֱ�ӽ�������ȡ�±�Ϊ0��
 * ע��:
 * 
 * 
 * @author 77515
 *
 */
public class Solution {
    public int minNumberInRotateArray(int [] array) {
    	//�������СΪ0->����0
    	if(array.length <= 0){
    		return 0;
    	}
    	List<Integer> list = new ArrayList<Integer>();
    	for(int i:array){
    		list.add(i);
    	}
    	Collections.sort(list);
    	return list.get(0);
    }
}
