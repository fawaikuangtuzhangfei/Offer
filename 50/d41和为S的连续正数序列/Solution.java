package d41��ΪS��������������;

/**
 * С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100�����������������ڴ�,
 * �����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
 * û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22�����ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
 * 
 * ������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
 * 
 * ˼·��
 * �����������ƴ��ڵı߽磬�ڴη�Χ�ڣ�ӵ���������ҹ���Ϊ1�� ����������һ����
 * count=(a0+an)*n/2
 * ����˴���count��sumС�����Ҵ�������
 * 				   ��sum�����󴰿�����
 * ����ȣ������,������߽�+1
 * @author nanshoudabaojian
 *
 */
import java.util.ArrayList;
public class Solution {
    public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
    	ArrayList<ArrayList<Integer> > result = new ArrayList<ArrayList<Integer> >();
    	
    	int w1 = 1; 
    	int w2 = 2;
    	
    	
    	while(w2 > w1){
    		int count = (w1+w2)*(w2-w1+1)/2;
    		if(sum == count){
        		ArrayList<Integer> list1 = new ArrayList<Integer>();
        		for (int i = 0; i <= w2-w1; i++) {
    				list1.add(w1+i);
    			}
        		result.add(list1);
        		w1++;
        	}else if(count < sum){
        		w2++;
        	}else{
        		w1++;
        	}
    	}
    	
		return result;
    }
}
