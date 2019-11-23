package 整数中1出现的次数;

/**
 * 整数中1出现的次数（从1到n整数中1出现的次数）
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
 * 可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 * 
 * 思路: 
 * 不断将给定的数字-1,直到<=0,判断里面是否包含1
 * 
 * @author nanshoudabaojian
 *
 */
public class Solution2 {
    public static int NumberOf1Between1AndN_Solution(int n) {
    	int result = 0;
    	while(n>0){
    		String a = n +"";
    		result += searchOne(a.toCharArray());
    		n--;
    	}
    	return result;
    }
    public static int searchOne(char[] arr){
    	int count = 0;
    	for(int i=0; i<arr.length; i++){
    		if(arr[i] == '1'){
    			count++;
    		}
    	}
    	return count;
    }
    public static void main(String[] args) {
		System.out.println(NumberOf1Between1AndN_Solution(11));
	}
}
