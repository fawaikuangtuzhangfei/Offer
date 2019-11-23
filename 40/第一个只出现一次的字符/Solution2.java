package ��һ��ֻ����һ�ε��ַ�;

import java.util.HashMap;

/**
 * ��һ��ֻ����һ�ε��ַ�
 * ��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,
 * ����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��.
 * 
 * ˼·:
 * ����ţ�͵������Լ��Կ���ʦ��һ��һ�����ڰٶ�Ա�����������������
 * �������ƹ�ϣ��Ч��->
 * ��������:1.����1-100��(100��)����������Ϊkeyֵ������ͬ��valueֵ++ 2.�ٴα���1-100�꣬�Ը������value��Ϊѭ�����������ϴ�ӡ
 * ������:1.�������飬���ַ�����ÿһ���ַ���Ϊkeyֵ,����ͬ��value++ 2.���ַ�����˳���ٴα�������,��һ��value==1�ľ��Ǵ�
 * 
 * @author nanshoudabaojian
 *
 */

public class Solution2 {
    public static int FirstNotRepeatingChar(String str) {
    	if(str.length() == 1){
    		return 0;
    	}
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	for(int i=0; i<str.length(); i++){
    		char now = str.charAt(i);
    		if(map.containsKey(now)){
    			int temp = map.get(now);
    			map.put(now, ++temp);
    		}else{
    			map.put(now, 1);
    		}
    	}
    	for(int i=0; i<str.length(); i++){
    		if(map.get(str.charAt(i)) == 1){
    			return i;
    		}
    	}
    	
        return -1;
    }
    
    public static void main(String[] args) {
		System.out.println(FirstNotRepeatingChar("bccbda"));//
	}
}