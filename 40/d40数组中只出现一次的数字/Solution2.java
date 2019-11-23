package d40数组中只出现一次的数字;

import java.util.HashMap;

/**
 * 数组中只出现一次的数字
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * 
 * 利用之前的一道第一个出现一次的字符的解题思路：利用哈希来存储
 * key为数字 value为出现的次数
 * 
 * @author nanshoudabaojian
 *
 */
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution2 {
  public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	  for(int i=0; i<array.length; i++){
		  if(map.containsKey(array[i])){
			  int temp = map.get(array[i]);
			  map.put(array[i], ++temp);
		  }else{
			  map.put(array[i], 1);
		  }
	  }
	  
	  boolean first = false;
	  for(int i=0; i<array.length; i++){
		  if(map.get(array[i]) == 1 && !first){
			  num1[0] = array[i];
			  first = true;
		  }else if(map.get(array[i]) == 1 && first){
			  num2[0] = array[i];
			  break;
		  }
	  }
  }
  public static void main(String[] args) {
	int [] array = {4,6,2,2,3,3,8,8,9,9,1000000,1000000};
	FindNumsAppearOnce(array, array, array);
  }
}
