package d13;

/**
 * ��������˳��ʹ����λ��ż��ǰ��
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�
 * ����֤������������ż����ż��֮������λ�ò��䡣
 * 
 * ˼·:
 * ʹ��ð�ݵ�˼��,�Ӻ���ǰ,��������ż��ȫ���������ұ�
 * @author 77515
 *
 */
public class Solution2 {
	public void mp(int [] array){
		
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6};
		reOrderArray(arr);
	}
    public static void reOrderArray(int [] array) {
    	for(int i=array.length-1; i>0; i--){
    		for(int j=0; j<i; j++){
    			if(isOdd(array[j]) && !isOdd(array[j+1])){
    				swap(array,j, j+1);
    			}
    		}
    	}
    }
    //����
    public static void swap(int [] arr, int i, int j){
    	int t=arr[i];
    	arr[i]=arr[j];
    	arr[j]=t;
    }
    //�����жϵ�ǰ�����Ƿ�Ϊż��
    public static boolean isOdd(int i){
    	return i%2==0;
    }
}
