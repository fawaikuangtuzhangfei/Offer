package d06;


/**
 * 题目:旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 思路3:
 * 直接找到开始减小的那个数
 * 注意:
 * 
 * 
 * @author 77515
 *
 */
public class Solution3 {
	public static void main(String[] args) {
		int [] arry = {5,8,1,5,5};
		int n = minNumberInRotateArray(arry);
		System.out.println(n);
	}
    public static int minNumberInRotateArray(int [] array) {
    	//若数组大小为0->返回0
    	if(array.length <= 0){
    		return 0;
    	}
    	int min = 0;
    	for(int i=array.length-1; i>0; i--){
    		if(array[i] < array[i-1]){
    			min = i;
    			break;
    		}
    	}
    	return array[min];
    }
}
