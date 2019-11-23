package 丑数;

import java.util.ArrayList;

/**
 * 丑数
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * 1，2，3，4，5，6，8，9，10，12，15，16，18是最前面的13个丑数。
 * 
 * 思路:
 * 拿3个数不断的去算，保存最小的 同时将这个最小的数的下标增大
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
    		if(min == m2) a2++; // 2的倍数的丑数+1
    		if(min == m3) a3++;
    		if(min == m5) a5++;
    		//不断将最小的放进去
    		list.add(min);
    		i++;
    	}
        return list.get(index-1);
    }
    public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(13));
	}
}
