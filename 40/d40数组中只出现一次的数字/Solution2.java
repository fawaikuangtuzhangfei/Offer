package d40������ֻ����һ�ε�����;

import java.util.HashMap;

/**
 * ������ֻ����һ�ε�����
 * һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
 * 
 * ����֮ǰ��һ����һ������һ�ε��ַ��Ľ���˼·�����ù�ϣ���洢
 * keyΪ���� valueΪ���ֵĴ���
 * 
 * @author nanshoudabaojian
 *
 */
//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
//��num1[0],num2[0]����Ϊ���ؽ��
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
