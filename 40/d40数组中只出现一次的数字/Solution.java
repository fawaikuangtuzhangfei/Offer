package d40������ֻ����һ�ε�����;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ������ֻ����һ�ε�����
 * һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
 * 
 * ������ Ȼ����ǰ��ͬ��
 * @author nanshoudabaojian
 *
 */
//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
//��num1[0],num2[0]����Ϊ���ؽ��
public class Solution {
  public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	  ArrayList<Integer> list =new ArrayList<Integer>();
	  for(int i=0; i<array.length; i++){
		  list.add(array[i]);
	  }
      Collections.sort(list);
      System.out.println(list);
      boolean first = false;//��¼��һ�������Ƿ��ҵ�
      boolean second = false;//��¼��һ�������Ƿ��ҵ�
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
