package d20;

import java.util.Stack;

/**
 * 包含min函数的栈
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 
 * 思路:
 * 利用两个辅助栈来实现，一个栈用于存放所有要填入的元素，另一个栈只放最小值
 * 每进栈一次，将当前元素和栈顶元素进行比较，将最小的存放进去
 * 而出栈时，两个栈均出栈
 * @author 77515
 *
 */
public class Solution {

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    public void push(int node) {
    	//将此元素直接添加到直接存放所有元素的栈中
        stack.push(node);
        //如果min栈为空,则直接添加，否则将栈顶的和node中的最小值放进去
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
