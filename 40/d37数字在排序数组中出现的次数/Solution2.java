package d37���������������г��ֵĴ���;

/**
 * ͳ��һ�����������������г��ֵĴ�����
 * 
 * ˼·:
 * ���򼴶���
 * �ö����ҵ���һ����ȵ� �����ǰ���� ���󿴿�
 * 
 * @author nanshoudabaojian
 *
 */
public class Solution2 {
    public int GetNumberOfK(int [] array , int k) {
    	int result = 0;
    	int l = 0;
    	int r = array.length-1;
    	
    	while(l <= r){
    		int m = l+((r-l)>>1);
    		
    		if(array[m] > k){
    			r = m-1;
    		}else if(array[m] < k){
    			l = m+1;
    		}else{
    			result++;
    			int index = m-1;
    			//��ǰ����
    			while(index>=0 && array[index--] == k){
					result++;
    			}
    			index = m+1;
    			//���󿴿�
    			while(index<array.length && array[index++] == k){
					result++;
    			}
    			break;
    		}
    	}
    	return result;
    }
}
