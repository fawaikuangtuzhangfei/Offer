package d27字符串的排列;

import java.util.*;

/**
 * 字符串的排列
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。]
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
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