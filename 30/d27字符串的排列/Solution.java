package d27�ַ���������;

import java.util.ArrayList;
import java.util.Collections;

/**
 * �ַ���������
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
 * ����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��
 * 
 * ˼·:
 * ab= ab ba a��b����λ��
 * abc=ab��c+ac��b+bc��a=a��b+a��c+b��c
 * 
 * ע��:���һ�ε�������Ϊcba cab ��Ҫ�����������н������ǰ����ֵ�����д�ӡ��
 * 
 * ����ȫ���е�˼��->
 * 1.���Ƚ�a������λ�ý��н���->abc       bac        cba
 * 2.��b������λ�ý���->     abc acb    bac cab   cba bca
 * 3.��ʱֻʣc�޷���������ӡ���
 * �ɴ˿ɼ���ÿ��ѭ����ֹ��������Ϊֻʣ��һ��Ԫ��
 * @author nanshoudabaojian
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println(Permutation("abc"));
	}
	private static ArrayList<String> result = new ArrayList<String>();
	
    public static ArrayList<String> Permutation(String str) {
    	Permuttion(str, 0, str.length()-1);
    	Collections.sort(result);
        return result;
    }
    
    public static void Permuttion(String a, int index, int end){
    	if(end == index){
    		if(!result.contains(a)){
    			result.add(a);
    		}
    		System.out.println(a);
    		return;
    	}
    	//����
        for(int i=index; i<=end; i++){
        	a = swap(a.toCharArray(), i, index);
        	Permuttion(a, index+1,end);
        	a = swap(a.toCharArray(), i, index);
        }
    }
    
    public static String swap(char[] a, int i, int j){
    	char temp = a[i];
    	a[i] = a[j];
    	a[j] = temp;
    	return String.valueOf(a);
    }
}
