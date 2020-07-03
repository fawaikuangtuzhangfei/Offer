package d46�������ڵ����ֵ;

import java.util.ArrayList;

/**
 * �������ڵ����ֵ
 * ����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ�����磬
 * �����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3����ôһ������6���������ڣ�
 * ���ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}�� �������{2,3,4,2,6,2,5,1}�Ļ�������������6���� 
 * {[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� {2,3,[4,2,6],2,5,1}�� {2,3,4,[2,6,2],5,1}�� {2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
 * 
 * ˼·��
 * �� ���� O(n*size)
 * 
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020��7��1�� ����3:12:22
 */
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	
    	if(size <= 0 || num.length <= 0){
    		return result;
    	}
    	// �ڼ���Ԫ��
    	int index = 0;
    	// �����е����ֵ
    	int max = 0;
    	// ѭ������� �õ�֮����ӽ�ȥ
    	while(index+size <= num.length){
    		max = num[index];
    		for(int i=1; i<size; i++){
    			max = Math.max(num[index+i], max);
    		}
			result.add(max);
			index++;
    	}
    	return result;
    }
}