package d13;


/**
 * ��������˳��ʹ����λ��ż��ǰ��
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�
 * ����֤������������ż����ż��֮������λ�ò��䡣
 * 
 * ˼·:
 * ����һ����������ר�����ڴ������,����ٰ�ż����ӽ���
 * @author 77515
 *
 */
public class Solution {
    public void reOrderArray(int [] array) {
    	//��¼����������
    	int count = 0;
    	for(int i:array){
    		if(!isOdd(i)){
    			++count;
    		}
    	}
    	int length = array.length;
    	//��������
    	int [] arr = array.clone();
    	int a=0;
    	for(int i=0; i<length; i++){
    		if(!isOdd(arr[i])){
    			array[a++] = arr[i];
    		}else{
    			array[count++] = arr[i];
    		}
    	}
    }
    public boolean isOdd(int a){
    	return a%2==0? true:false;
    }
}
