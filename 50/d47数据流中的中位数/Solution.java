package d47�������е���λ��;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * ��εõ�һ���������е���λ����������������ж�����������ֵ����ô��λ������������ֵ����֮��λ���м����ֵ��
 * ������������ж���ż������ֵ����ô��λ������������ֵ����֮���м���������ƽ��ֵ��
 * ����ʹ��Insert()������ȡ��������ʹ��GetMedian()������ȡ��ǰ��ȡ���ݵ���λ����
 * 
 * �ȷ������ݽṹ
 * �������飺δ����Ĳ���O(n) ����λ��O(1)
 * ���������O(n) O(1)
 * ��������O(n) O(1)
 * ���ڶ�����O(logN)���O(n)  O(logN)���O(n)
 * ���ڶ�O(logN)  O(1)
 * ���ں������ݺ��������ݣ������Ѻ���С��������
 * 
 * ����PriorityQueue����С���Ѻʹ���ѣ��������������ֵС��С���������Сֵ
 * С���ѵ���Сֵ�������  ����ѵ����ֵ��С���� ��֤С���ѵ���С���ڴ���ѵ����
 * ��������ʱ ����ѵĸ����Ǵ�  ż������ʱ С���Ѻʹ���ѵĸ��ĺͳ���2���Ǵ�
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020��7��3�� ����11:16:17
 */
public class Solution {
	
	private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>(){
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2-o1;
		}			});
	// ����ĸ���
	private int count = 1;

    public void Insert(Integer num) {
    	if(count % 2 == 0){
    		minHeap.add(num);
    		maxHeap.add(minHeap.poll());
    	}else{
    		maxHeap.add(num);
    		minHeap.add(maxHeap.poll());
    	}
    }

    public Double GetMedian() {
    	if(count % 2 == 0){
    		count++;
    		return Double.valueOf(minHeap.peek() + maxHeap.peek())/2;
    	}else{
    		count++;
    		return Double.valueOf(minHeap.peek());
    	}
    }


}