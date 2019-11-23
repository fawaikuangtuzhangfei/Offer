package �������ų���С����;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * �������ų���С���� ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 * 
 * ˼·:
 * ���ñȽ��� 
 * �����ڲ��� ->ʵ��Comparator�ӿ� ��дcompare���� �Լ�ʵ��һ���Ƚ���
 * compare() ������������� ������С�� ->�����Ľ��������
 * @author nanshoudabaojian
 *
 */

public class Solution3 {
	public String PrintMinNumber(int [] numbers) {
		String result = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<numbers.length; i++){
			list.add(numbers[i]);
		}
		Collections.sort(list, new Comparator<Integer>(){

			public int compare(Integer arg0, Integer arg1) {
				String s1 = arg0 + "" +arg1;
				String s2 = arg1 + "" +arg0;
				return s1.compareTo(s2);
			}
			
		});
		for(int i:list){
			result += i;
		}
		return result;
    }
}
