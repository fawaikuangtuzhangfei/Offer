package d27�ַ���������;

import java.util.*;

/**
 * �ַ���������
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�]
 * ���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
 * 
 * @author nanshoudabaojian
 *
 */
public class Main{
    private static ArrayList<String> list = new ArrayList<String>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(sc.hasNext()){
        	String s1 = sc.next(); 
        	s += s1;
        }
        allSort(s.toCharArray(), 0, s.length()-1);
        Collections.sort(list);
        System.out.println(list);
    }
    
    public static void allSort(char[] array, int index, int end){
        if(index == end){
            if(!list.contains(String.valueOf(array))){
                list.add(String.valueOf(array));
            }
            return;
        }
        for(int i=index; i<=end; i++){
            swap(array, index, i);
            allSort(array,index+1,end);
            swap(array, index, i);
        }
    }
    
    public static void swap(char[] array, int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}