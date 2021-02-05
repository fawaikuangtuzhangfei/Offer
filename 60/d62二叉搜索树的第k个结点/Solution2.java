package d62�����������ĵ�k�����;

import java.util.Stack;

/**
 * ����һ�ö��������������ҳ����еĵ�kС�Ľ�㡣���磬 ��5��3��7��2��4��6��8��    �У��������ֵ��С˳�����С����ֵΪ4��
 * 
 * �ҵ���k��ֱ��return������list
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020��7��3�� ����3:50:04
 */
public class Solution2 {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
    	if(k == 0 || pRoot == null){
    		return null;
    	}
    	Stack<TreeNode> stack = new Stack<>();
    	int count = 1;
    	
        while(pRoot != null || !stack.isEmpty()){
        	if(pRoot != null){
        		stack.add(pRoot);
        		pRoot = pRoot.left;
        	}else{
        		pRoot = stack.pop();
        		if(k == count++){
        			return pRoot;
        		}
        		pRoot = pRoot.right;
        	}
        }
        return null;
    }


}

