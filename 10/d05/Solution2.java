package d05;

import java.util.Stack;

/**
 * ��Ŀ:������ջʵ�ֶ���
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 * 
 * ˼·2:
 * stack1ר�����ڴ�����
 * stack2����pop
 * ע��:
 * 1.����push����Ҫ�Ƚ�Ŀǰstack2���������ѹ�뵽stack1��,�ٽ������ݴ��뵽stack1��
 * 2.popʱ��stack1�������ݾͰ�����ȫ��ȡ��������stack2��
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
