package d40数组中只出现一次的数字;

/**
 * 数组中只出现一次的数字
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * 
 * System.out.println(9 ^ 8 ^ 9);//8
 * 利用异或运算->重复出现的会被消除掉
 * 想将全部的数异或一遍 ->得到不重复的两个值的异或结果
 * 从右往左找到第一个出现1的位置，将他们划分为两组(因为这个数是两个数异或的结果，说明一个是1 另一个是0)
 * 将这两组异或，找到最终结果->也就是知道一个唯一的数字，重复出现的会被消除掉
 * @author nanshoudabaojian
 *
 */
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution3 {
  public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	  if(array.length == 2){
		  num1[0] = array[0];
		  num2[0] = array[0];
	  }
	  //将数组中的所有数进行异或
	  int bigResult = array[0];
	  for(int i=1; i<array.length; i++){
		  bigResult ^= array[i];
	  }
	  //找到从右到左第一个出现的1
	  int index = getIndex(bigResult);
	  //以这个1为界限分为两组，分别求只出现一次的
	  for(int i=0; i<array.length; i++){
		  if(isGroup(array[i], index)){
			  num1[0] ^= array[i];
		  }else{
			  num2[0] ^= array[i];
		  }
	  }
  }
  //找到从右到左第一个出现的1
  public static int getIndex(int bigResult){
	  int index = 0;
	  while(index < 32 && (bigResult&1)==0 ){
		  bigResult = bigResult>>1;
	  	  index++;
	  }
	  return index;
  }
  //以这个1为界限分为两组
  public static boolean isGroup(int array, int index){
	  if(((array>>index)&1) == 1){
		  return true;
	  }else{
		  return false;
	  }
  }
  
  public static void main(String[] args) {
	int [] array = {4,6,2,2,3,3,8,8,9,9,1000000,1000000};
	FindNumsAppearOnce(array, array, array);
  }
}
