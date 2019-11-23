package d05;

import java.util.Stack;

/**
 * 题目:用两个栈实现队列
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * 
 * 思路2:
 * stack1专门用于存数据
 * stack2用于pop
 * 注意:
 * 1.若新push则需要先将目前stack2所存的数据压入到stack1中,再将新数据存入到stack1中
 * 2.pop时若stack1中有数据就把数据全部取出来存入stack2中
 * 
 * @author 77515
 *
 */
public class Solution2 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	while(!stack2.isEmpty()){
    		stack1.push(stack2.pop());
    	}
    	stack1.push(node);
    }
    
    public int pop() {
    	while(!stack1.isEmpty()){
    		stack2.push(stack1.pop());
    	}
    	return stack2.pop();
    }
}
