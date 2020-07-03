package d47数据流中的中位数;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 * 
 * 先分析数据结构
 * 对于数组：未排序的插入O(n) 求中位数O(1)
 * 排序的数组O(n) O(1)
 * 对于链表O(n) O(1)
 * 对于二叉树O(logN)最差O(n)  O(logN)最差O(n)
 * 对于堆O(logN)  O(1)
 * 对于海量数据和流的数据，用最大堆和最小堆来管理
 * 
 * 利用PriorityQueue构造小根堆和大根堆，大根堆里面的最大值小于小根堆里的最小值
 * 小根堆的最小值给大根堆  大根堆的最大值给小根堆 保证小根堆的最小大于大根堆的最大
 * 奇数个数时 大根堆的根就是答案  偶数个数时 小根堆和大根堆的根的和除以2就是答案
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020年7月3日 上午11:16:17
 */
public class Solution {
	
	private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>(){
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2-o1;
		}			});
	// 插入的个数
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