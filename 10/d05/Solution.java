package d05;

import java.util.Stack;

/**
 * 题目:用两个栈实现队列
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * 
 * 思路1:
 * push:直接将数据存入第一个栈中
 * pop:若第二个栈为空且第一个栈不为空，则把第1个栈中的元素取出来压入栈2中
 * 若第二个栈不为空，则直接弹栈
 * 注意:空栈的处理
 * @author 77515
 *
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	stack1.push(node);
    }
    
    public int pop() {
    	if(stack2.isEmpty()){
    		while(!stack1.isEmpty()){
            	stack2.push(stack1.pop());
            }
    	}
    	return stack2.pop();
    }
}
