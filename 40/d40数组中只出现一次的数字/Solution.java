package d40数组中只出现一次的数字;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 数组中只出现一次的数字
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * 
 * 先排序 然后找前后不同的
 * @author nanshoudabaojian
 *
 */
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
  public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	  ArrayList<Integer> list =new ArrayList<Integer>();
	  for(int i=0; i<array.length; i++){
		  list.add(array[i]);
	  }
      Collections.sort(list);
      System.out.println(list);
      boolean first = false;//记录第一个数字是否找到
      boolean second = false;//记录第一个数字是否找到
      for(int i=1; i<list.size()-1; i++){
    	  if(list.get(i) != list.get(i+1) && list.get(i) != list.get(i-1)){
    		  if(!first){
    			  num1[0] = list.get(i);
        		  first = true;
    		  }else{
    			  num2[0] = list.get(i);
    			  second = true;
    			  break;
    		  }
    	  }
      }
      if(list.get(0) != list.get(1) && !first){
    	  num1[0] = list.get(0);
		  first = true;
      }else if(!second){
    	  num2[0] = list.get(0);
      }
      int length = list.size()-1;
      if(list.get(length) != list.get(length-1) && !first){
    	  num1[0] = list.get(length);
		  first = true;
      }else if(!second){
    	  num2[0] = list.get(length);
      }
  }
  public static void main(String[] args) {
	int [] array = {4,6,2,2,3,3,8,8,9,9,1000000,1000000};
	FindNumsAppearOnce(array, array, array);
  }
}
