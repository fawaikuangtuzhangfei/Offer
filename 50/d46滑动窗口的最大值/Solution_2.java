package d46滑动窗口的最大值;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * 更优化的解法  复杂度没变 但是少了重复计算
 * 第一种方法存在着多次重复的计算，比如当i+1>i时，i+1此时为最大值，再次滑动时，只需要和i+1进行比较，此刻的i为无用值
 * 也就是说当窗口滑动时，只需要保留区间内最大的
 * 
 * 利用双端队列来存储最大值以及次小值
 * 1、当队列为空，则直接添加
 * 2、队列不为空，第一位的范围超出的滑动窗口的范围，弹出第一位
 * 3、队列不为空，新的元素>最后一位，弹出最后一位，直到<=，将此元素添加入队尾
 * 4、判断是否为滑动窗口中的有效值，是则添加
 * 
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020年7月3日 上午9:12:11
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
