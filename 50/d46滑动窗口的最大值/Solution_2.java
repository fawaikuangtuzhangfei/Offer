package d46�������ڵ����ֵ;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * ���Ż��Ľⷨ  ���Ӷ�û�� ���������ظ�����
 * ��һ�ַ��������Ŷ���ظ��ļ��㣬���統i+1>iʱ��i+1��ʱΪ���ֵ���ٴλ���ʱ��ֻ��Ҫ��i+1���бȽϣ��˿̵�iΪ����ֵ
 * Ҳ����˵�����ڻ���ʱ��ֻ��Ҫ��������������
 * 
 * ����˫�˶������洢���ֵ�Լ���Сֵ
 * 1��������Ϊ�գ���ֱ�����
 * 2�����в�Ϊ�գ���һλ�ķ�Χ�����Ļ������ڵķ�Χ��������һλ
 * 3�����в�Ϊ�գ��µ�Ԫ��>���һλ���������һλ��ֱ��<=������Ԫ��������β
 * 4���ж��Ƿ�Ϊ���������е���Чֵ���������
 * 
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020��7��3�� ����9:12:11
 */
public class Solution_2 {
	public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(num == null || num.length <= 0 || size <= 0){
			return result;
		}
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		for(int i=0; i<num.length; i++){
			if(deque.isEmpty()){
				deque.add(i);
			}else if(deque.peekFirst() < i-size+1){
				deque.pollFirst();
			}
			while((!deque.isEmpty()) && num[i] >= num[deque.peekLast()]){
				deque.pollLast();
			}
			deque.add(i);
			if(i-size+1 >= 0){
				result.add(num[deque.peekFirst()]);
			}
			
		}
		return result;
    }

}
