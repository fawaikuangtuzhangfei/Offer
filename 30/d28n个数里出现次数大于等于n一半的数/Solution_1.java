package d28n��������ִ������ڵ���nһ�����;

import java.util.ArrayList;
import java.util.Collections;

/**
 * �����г��ִ�������һ�������
 * ��Ŀ����
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
 * 
 * ˼·:
 * 1.��������Ȼ��ѭ���ź�������飬��ĳһ�����ֳ���һ����return ����0
 * 
 * �Ż�:
 * ��������λ�������������м��Ǹ�����һ���ǣ�ѭ���жϴ������ֵĴ�������������return ����0
 * @author nanshoudabaojian
 *
 */

public class Solution_1 {
    public static int MoreThanHalfNum_Solution(int [] array) {
        int result = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(array.length == 1){
        	return array[0];
        }
        for(int i=0; i<array.length; i++){
        	list.add(array[i]);
        }
        Collections.sort(list);
        System.out.println(list);
        int count = 0;
        result = list.get(list.size()/2);
        for(int i=0; i<list.size(); i++){
        	if(result == list.get(i)){
        		count++;
        	}
        }
        if(count > array.length/2){
        	return result;
        }else{
        	return 0;
        }
    }
    public static void main(String[] args) {
    	int[] arr = {3, 1, 2, 3, 2, 3, 3, 4, 3};
    	System.out.println(MoreThanHalfNum_Solution(arr));
    }
		
}
