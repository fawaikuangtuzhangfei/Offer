package d05;

import java.util.Stack;

/**
 * ��Ŀ:������ջʵ�ֶ���
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 * 
 * ˼·1:
 * push:ֱ�ӽ����ݴ����һ��ջ��
 * pop:���ڶ���ջΪ���ҵ�һ��ջ��Ϊ�գ���ѵ�1��ջ�е�Ԫ��ȡ����ѹ��ջ2��
 * ���ڶ���ջ��Ϊ�գ���ֱ�ӵ�ջ
 * ע��:��ջ�Ĵ���
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
