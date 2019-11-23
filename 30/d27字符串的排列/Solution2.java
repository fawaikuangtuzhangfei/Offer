package d27字符串的排列;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 字符串的排列
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 * 
 * 思路:
 * ab= ab ba a和b交换位置
 * abc=ab和c+ac和b+bc和a=a和b+a和c+b和c
 * 
 * 注意:最后一次的排序结果为cba cab 还要将这两个进行交换才是按照字典序进行打印的
 * 
 * 利用全排列的思想->
 * 1.首先将a和三个位置进行交换->abc       bac        cba
 * 2.将b和两个位置交换->     abc acb    bac cab   cba bca
 * 3.此时只剩c无法交换，打印输出
 * 由此可见，每次循环终止的条件均为走到了最后一个元素->既index=last
 * 每次都从0开始选定一个元素，与每一个元素进行交换(包括自己)
 * 
 * 注意:可能出现重复 eg:acc 
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
    		//当前元素向后移eg:abc->0a 1b 2c
    		Permuttion(a,index+1, end);
    		//还原回来，便于下一次排列
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
