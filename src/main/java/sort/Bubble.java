package sort;

/**
 * 冒泡排序
 * 不断的两两比较，把较大的数放到后面
 * 同时设置一个boolean变量，若一次排序没交换位置就说明已经排好序了
 * @author nanshoudabaojian
 *
 * @param <T>
 */
public class Bubble<T extends Comparable<T>> extends Sort<T> {

	@Override
	public void sort(T[] nums) {
		boolean isSort = false;
		for(int i=0; i<nums.length && !isSort; i++){
			isSort = true;
			for(int j=0; j<nums.length-1-i; j++){
				if(less(nums[j], nums[j+1])){
					swap(nums, j, j+1);
					isSort = false;
				}
			}
		}
	}

}
