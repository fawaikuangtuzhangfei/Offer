package ������1���ֵĴ���;

/**
 * ������1���ֵĴ�������1��n������1���ֵĴ�����
 * ���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
 * Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,
 * ���Ƕ��ں�����������û���ˡ�ACMerϣ�����ǰ����,������������ձ黯,
 * ���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�������
 * 
 * ˼·: 
 * ���Ͻ�����������-1,ֱ��<=0,�ж������Ƿ����1
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
