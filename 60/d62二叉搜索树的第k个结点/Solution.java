package d62�����������ĵ�k�����;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * ����һ�ö��������������ҳ����еĵ�kС�Ľ�㡣���磬 ��5��3��7��2��4��6��8��    �У��������ֵ��С˳�����С����ֵΪ4��
 * ���������� ��<��<�� ��������������ǵ�����
 * ��k�����ǵ�k��
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020��7��3�� ����3:50:04
 */
public class Solution {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
    	if(k == 0 || pRoot == null){
    		return null;
    	}
    	List<TreeNode> list = new ArrayList<>();
    	Stack<TreeNode> stack = new Stack<>();
    	
        while(pRoot != null || !stack.isEmpty()){
        	if(pRoot != null){
        		stack.add(pRoot);
        		pRoot = pRoot.left;
        	}else{
        		pRoot = stack.pop();
        		list.add(pRoot);
        		pRoot = pRoot.right;
        	}
        }
        if(k > list.size()){
        	return null;
        }
        return list.get(k-1);
    }


}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
