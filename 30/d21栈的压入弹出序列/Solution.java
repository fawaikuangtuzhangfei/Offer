package d21栈的压入弹出序列;

import java.util.Stack;

/**
 * 栈的压入、弹出序列
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 * 
 * 思路:
 * 设置一个辅助栈和两个index来模拟栈的压栈和弹栈操作
 * 1.若栈顶的元素不等于输出队列的第一个元素则不断的将数据存入栈中
 * 2.若等于则弹栈同时输出队列的指针+1
 * 简单来说就是:若目前的栈顶元素相同则弹栈，否则继续入栈直到弹栈
 * @author 77515
 *
 */
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	Stack<Integer> stack = new Stack<Integer>();
    	int n = pushA.length;
    	int popIndex = 0;
    	for(int pushIndex=0; pushIndex<n; pushIndex++){
    		stack.push(pushA[pushIndex]);
    		while(popIndex<n && !stack.isEmpty() && stack.peek()==popA[popIndex]){
    			stack.pop();
    			popIndex++;
    		}
    	}
    	return stack.isEmpty();
    }
}