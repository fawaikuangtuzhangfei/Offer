package d40������ֻ����һ�ε�����;

/**
 * ������ֻ����һ�ε�����
 * һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
 * 
 * System.out.println(9 ^ 8 ^ 9);//8
 * �����������->�ظ����ֵĻᱻ������
 * �뽫ȫ���������һ�� ->�õ����ظ�������ֵ�������
 * ���������ҵ���һ������1��λ�ã������ǻ���Ϊ����(��Ϊ����������������Ľ����˵��һ����1 ��һ����0)
 * ������������ҵ����ս��->Ҳ����֪��һ��Ψһ�����֣��ظ����ֵĻᱻ������
 * @author nanshoudabaojian
 *
 */
//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
//��num1[0],num2[0]����Ϊ���ؽ��
public class Solution3 {
  public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	  if(array.length == 2){
		  num1[0] = array[0];
		  num2[0] = array[0];
	  }
	  //�������е��������������
	  int bigResult = array[0];
	  for(int i=1; i<array.length; i++){
		  bigResult ^= array[i];
	  }
	  //�ҵ����ҵ����һ�����ֵ�1
	  int index = getIndex(bigResult);
	  //�����1Ϊ���޷�Ϊ���飬�ֱ���ֻ����һ�ε�
	  for(int i=0; i<array.length; i++){
		  if(isGroup(array[i], index)){
			  num1[0] ^= array[i];
		  }else{
			  num2[0] ^= array[i];
		  }
	  }
  }
  //�ҵ����ҵ����һ�����ֵ�1
  public static int getIndex(int bigResult){
	  int index = 0;
	  while(index < 32 && (bigResult&1)==0 ){
		  bigResult = bigResult>>1;
	  	  index++;
	  }
	  return index;
  }
  //�����1Ϊ���޷�Ϊ����
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
