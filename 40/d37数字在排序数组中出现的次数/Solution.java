package d37���������������г��ֵĴ���;

/**
 * ͳ��һ�����������������г��ֵĴ�����
 * 
 * 
 * @author nanshoudabaojian
 *
 */
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
    	int result = 0;
    	for(int i=0; i<array.length; i++){
    		if(k < array[i]){
    			break;
    		}
    		if(array[i] == k){
    			result++;
    		}
    	}
    	return result;
    }
}
