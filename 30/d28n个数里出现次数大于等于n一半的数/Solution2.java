package d28n个数里出现次数大于等于n一半的数;


/**
 * 数组中出现次数超过一半的数字
 * 题目描述
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 
 * 思路:
 * 采用 攻守阵地 思想
 * 设当前数字为守方 其他数字为功方
 * 若遇到友军则count++ 遇到敌方则同归于尽 count-- 当count==0时 则当前元素为新的守方
 * 如果count>0则很有可能是此元素 ->再次循环查看当前元素的数量是否超过数组长度的一半
 * @author nanshoudabaojian
 *
 */

public class Solution2 {
    public static int MoreThanHalfNum_Solution(int [] array) {
    	if(array.length == 1){
    		return array[0];
    	}
        int result = 0;
        int count = 1;
        int now = array[0];
        for(int i=1; i<array.length; i++){
        	if(now != array[i]){
        		count--;
        		if(count == 0){
        			now = array[i];
        			count = 1;
        		}
        	}else{
        		count++;
        	}
        }
        if(count > 0){
        	count = 0;
        	for(int i=0; i<array.length; i++){
            	if(now == array[i]){
            		count++;
            	}
            }
        }
        
        if(count > array.length/2){
        	return now;
        }
        
        return result;
    }
    public static void main(String[] args) {
    	int[] arr = {3, 1, 2, 3, 2, 3, 3, 4, 3};
    	System.out.println(MoreThanHalfNum_Solution(arr));
    }
		
}
