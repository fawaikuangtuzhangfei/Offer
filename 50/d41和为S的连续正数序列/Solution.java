package d41和为S的连续正数序列;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,
 * 他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * 
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * 
 * 思路：
 * 设置两个类似窗口的边界，在次范围内，拥有连续的且公差为1的 满足条件的一组数
 * count=(a0+an)*n/2
 * 如果此处的count比sum小，则右窗口增大
 * 				   比sum大，则左窗口增大
 * 若相等，则添加,并把左边界+1
 * @author nanshoudabaojian
 *
 */
import java.util.ArrayList;
public class Solution {
    public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
    	ArrayList<ArrayList<Integer> > result = new ArrayList<ArrayList<Integer> >();
    	
    	int w1 = 1; 
    	int w2 = 2;
    	
    	
    	while(w2 > w1){
    		int count = (w1+w2)*(w2-w1+1)/2;
    		if(sum == count){
        		ArrayList<Integer> list1 = new ArrayList<Integer>();
        		for (int i = 0; i <= w2-w1; i++) {
    				list1.add(w1+i);
    			}
        		result.add(list1);
        		w1++;
        	}else if(count < sum){
        		w2++;
        	}else{
        		w1++;
        	}
    	}
    	
		return result;
    }
}
