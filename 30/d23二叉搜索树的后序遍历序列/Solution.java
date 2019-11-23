package d23二叉搜索树的后序遍历序列;

/**
 * 二叉搜索树的后序遍历序列
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * 
 * 思路:
 * 二叉搜索树的规律为:左子树永远小于根，根永远小于右子树
 * 把每一颗小的子树均想为这样的模型，若子模型均正确，则一定正确
 * @author 77515
 *
 */
public class Solution {
	public static void main(String[] args) {
		int [] sequence = {4,7};
		VerifySquenceOfBST(sequence);
	}
	public static boolean VerifySquenceOfBST(int [] sequence) {
        //若序列为空或长度为0则错误
		if(sequence == null || sequence.length == 0){
			return false;
		}
		return Verify(sequence, 0, sequence.length-1);
    }
	public static boolean Verify(int [] sequence, int first, int last){
		//当前剩余2个节点及以下时成立(两个节点的时候，无论怎么看都是二叉排序树)
		if(last - first <= 1){
		//if(last <= first ) 
			return true; 
		}
		int index = first;
		//先找到右子树的分界点
		while(index < last && sequence[last] > sequence[index]){
			index++;
		}
		//有一个不符合规律则跳出
		for(int i=index; i<last; i++){
			if(sequence[i] < sequence[last]){
				return false;
			}
		}
		return Verify(sequence, first, index-1) && Verify(sequence, index, last-1);
	}
}	
