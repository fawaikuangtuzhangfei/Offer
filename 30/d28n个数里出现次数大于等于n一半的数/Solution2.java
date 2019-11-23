package d28n��������ִ������ڵ���nһ�����;


/**
 * �����г��ִ�������һ�������
 * ��Ŀ����
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
 * 
 * ˼·:
 * ���� ������� ˼��
 * �赱ǰ����Ϊ�ط� ��������Ϊ����
 * �������Ѿ���count++ �����з���ͬ���ھ� count-- ��count==0ʱ ��ǰԪ��Ϊ�µ��ط�
 * ���count>0����п����Ǵ�Ԫ�� ->�ٴ�ѭ���鿴��ǰԪ�ص������Ƿ񳬹����鳤�ȵ�һ��
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
