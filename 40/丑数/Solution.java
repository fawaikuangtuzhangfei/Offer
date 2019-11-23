package ����;

import java.util.ArrayList;

/**
 * ����
 * ��ֻ����������2��3��5��������������Ugly Number����
 * ����6��8���ǳ�������14���ǣ���Ϊ������������7�� ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 * 1��2��3��4��5��6��8��9��10��12��15��16��18����ǰ���13��������
 * 
 * ˼·:
 * ��3�������ϵ�ȥ�㣬������С�� ͬʱ�������С�������±�����
 * 
 * @author nanshoudabaojian
 *
 */
public class Solution {
    public static int GetUglyNumber_Solution(int index) {
    	if(index == 0){
    		return 0;
    	}
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	int a2=0,a3=0,a5=0;
    	int i=0;
    	while(i <= index){
    		int m2 = list.get(a2)*2;
    		int m3 = list.get(a3)*3;
    		int m5 = list.get(a5)*5;
    		int min = Math.min(m2, Math.min(m3, m5));
    		if(min == m2) a2++; // 2�ı����ĳ���+1
    		if(min == m3) a3++;
    		if(min == m5) a5++;
    		//���Ͻ���С�ķŽ�ȥ
    		list.add(min);
    		i++;
    	}
        return list.get(index-1);
    }
    public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(13));
	}
}
