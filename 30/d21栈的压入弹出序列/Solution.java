package d21ջ��ѹ�뵯������;

import java.util.Stack;

/**
 * ջ��ѹ�롢��������
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
 * ��ע�⣺���������еĳ�������ȵģ�
 * 
 * ˼·:
 * ����һ������ջ������index��ģ��ջ��ѹջ�͵�ջ����
 * 1.��ջ����Ԫ�ز�����������еĵ�һ��Ԫ���򲻶ϵĽ����ݴ���ջ��
 * 2.��������ջͬʱ������е�ָ��+1
 * ����˵����:��Ŀǰ��ջ��Ԫ����ͬ��ջ�����������ջֱ����ջ
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