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
 * �ɴ˿ɼ���ÿ��ѭ����ֹ��������Ϊ�ߵ������һ��Ԫ��->��index=last
 * ÿ�ζ���0��ʼѡ��һ��Ԫ�أ���ÿһ��Ԫ�ؽ��н���(�����Լ�)
 * 
 * ע��:���ܳ����ظ� eg:acc 
 * @author nanshoudabaojian
 *
 */
public class Solution2 {
	public static void main(String[] args) {
		System.out.println(Permutation("acc"));
	}
	private static ArrayList<String> result = new ArrayList<String>();
	
    public static ArrayList<String> Permutation(String str) {
    	Permuttion(str, 0, str.length()-1);
    	Collections.sort(result);
        return result;
    }
    
    public static void Permuttion(String a, int index, int end){
    	if(index == end){
    		if(!result.contains(a)){
    			result.add(a);
    		}
    		return;
    	}
    	for(int i=index; i<=end; i++){
    		a = swap(a.toCharArray(), index, i);
    		//��ǰԪ�������eg:abc->0a 1b 2c
    		Permuttion(a,index+1, end);
    		//��ԭ������������һ������
    		a = swap(a.toCharArray(), index, i);
    	}
    }
    
    public static String swap(char[] a, int i, int j){
    	char temp = a[i];
    	a[i] = a[j];
    	a[j] = temp;
    	return String.valueOf(a);
    }
}
