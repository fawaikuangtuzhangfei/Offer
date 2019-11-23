package d23�����������ĺ����������;

/**
 * �����������ĺ����������
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ��
 * 
 * ˼·:
 * �����������Ĺ���Ϊ:��������ԶС�ڸ�������ԶС��������
 * ��ÿһ��С����������Ϊ������ģ�ͣ�����ģ�;���ȷ����һ����ȷ
 * @author 77515
 *
 */
public class Solution {
	public static void main(String[] args) {
		int [] sequence = {4,7};
		VerifySquenceOfBST(sequence);
	}
	public static boolean VerifySquenceOfBST(int [] sequence) {
        //������Ϊ�ջ򳤶�Ϊ0�����
		if(sequence == null || sequence.length == 0){
			return false;
		}
		return Verify(sequence, 0, sequence.length-1);
    }
	public static boolean Verify(int [] sequence, int first, int last){
		//��ǰʣ��2���ڵ㼰����ʱ����(�����ڵ��ʱ��������ô�����Ƕ���������)
		if(last - first <= 1){
		//if(last <= first ) 
			return true; 
		}
		int index = first;
		//���ҵ��������ķֽ��
		while(index < last && sequence[last] > sequence[index]){
			index++;
		}
		//��һ�������Ϲ���������
		for(int i=index; i<last; i++){
			if(sequence[i] < sequence[last]){
				return false;
			}
		}
		return Verify(sequence, first, index-1) && Verify(sequence, index, last-1);
	}
}	
