package d06;

/**
 * 题目:旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 思路2:
 * 利用二分法找出最小的
 * 1.若mid>right,则最小的在mid的右边
 * 2.若mid<right,则最小的在mid的左边
 * 3.若mid=1,则
 * 注意:
 * 
 * 
 * @author 77515
 *
 */
public class Solution2 {
	public static void main(String[] args) {
		int [] arry = {5,8,5,5,5};
		int n = minNumberInRotateArray(arry);
		System.out.println(n);
	}
    public static int minNumberInRotateArray(int [] array) {
    	//若数组大小为0->返回0
    	if(array.length <= 0){
    		return 0;
    	}
    	int left = 0;
    	int right = array.length -1;
    	
    	int mid = 0;
    	while(right > left){
    		//相当于mid=(right+left)/2 但是下面的写法可以防止计算越界
    		mid = left + (right - left) / 2;
    		if(array[mid] > array[right]){
    			left = mid + 1;
    		}else if(array[mid] < array[right]){
    			right = mid;
    		}else{
    			//若mid=right,则递减一个一个的试
    			right = right-1;
    		}
    	}
    	return array[left];
    }
}
