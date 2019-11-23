package d20;

import java.util.Stack;

/**
 * ����min������ջ
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������
 * 
 * ˼·:
 * ������������ջ��ʵ�֣�һ��ջ���ڴ������Ҫ�����Ԫ�أ���һ��ջֻ����Сֵ
 * ÿ��ջһ�Σ�����ǰԪ�غ�ջ��Ԫ�ؽ��бȽϣ�����С�Ĵ�Ž�ȥ
 * ����ջʱ������ջ����ջ
 * @author 77515
 *
 */
public class Solution {

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    public void push(int node) {
    	//����Ԫ��ֱ����ӵ�ֱ�Ӵ������Ԫ�ص�ջ��
        stack.push(node);
        //���minջΪ��,��ֱ����ӣ�����ջ���ĺ�node�е���Сֵ�Ž�ȥ
        min.push(min.isEmpty()? node:Math.min(node, min.peek()));
    }
    
    public void pop() {
        stack.pop();
        min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return min.peek();
    }
}
