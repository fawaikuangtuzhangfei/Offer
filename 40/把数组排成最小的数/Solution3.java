package 把数组排成最小的数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 把数组排成最小的数 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * 
 * 思路:
 * 利用比较器 
 * 匿名内部类 ->实现Comparator接口 重写compare方法 自己实现一个比较器
 * compare() 若是正数则大于 负数则小于 ->排序后的结果是升序
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
