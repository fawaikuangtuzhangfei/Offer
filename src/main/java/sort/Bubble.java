package sort;

/**
 * ð������
 * ���ϵ������Ƚϣ��ѽϴ�����ŵ�����
 * ͬʱ����һ��boolean��������һ������û����λ�þ�˵���Ѿ��ź�����
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
