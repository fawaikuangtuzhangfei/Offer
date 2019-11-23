package ��һ��ֻ����һ�ε��ַ�;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ��һ��ֻ����һ�ε��ַ�
 * ��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,
 * ����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��.
 * 
 * ˼·:
 * ������ ����֮��ǰ�������Ƿ���� ���Ⱦʹ������� 
 * ѭ������ ����С 
 * 
 * @author nanshoudabaojian
 *
 */

public class Solution {
    public static int FirstNotRepeatingChar(String str) {
    	if(str.length() == 1){
    		return 0;
    	}
    	ArrayList<String> list = new  ArrayList<String>();
    	for(char i:str.toCharArray()){
    		list.add(String.valueOf(i));
    	}
    	Collections.sort(list);
    	System.out.println(list);
    	ArrayList<String> results = new  ArrayList<String>();
    	for(int i=1; i<list.size()-1; i++){
    		if(!list.get(i).equals(list.get(i+1)) && !list.get(i).equals(list.get(i-1))){
    			results.add(list.get(i));
    		}
    	}
    	//������һ��Ԫ��������ǰһ������� �ͷ���
    	if(list.size()>1 && !list.get(list.size()-1).equals(list.get(list.size()-2))){
    		results.add(list.get(list.size()-1));
    	}
    	//�����һ��Ԫ�������ĺ�һ������� �ͷ���
    	if(list.size()>1 && !list.get(0).equals(list.get(1))){
    		results.add(list.get(0));
    	}
        return findMin(results, str);
    }
    
    public static int findMin(ArrayList<String> list, String str){
    	if(list.size() == 0){
    		return -1;
    	}
    	System.out.println(list);
    	int result = str.indexOf(list.get(0));
    	for(int i=1; i<list.size(); i++){
    		int pre = str.indexOf(list.get(i));
    		result = pre > result? result:pre;
    	}
    	return result;
    }
    
    public static void main(String[] args) {
		System.out.println(FirstNotRepeatingChar("google"));//
	}
}