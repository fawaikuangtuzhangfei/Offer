package d22�������´�ӡ������;

import java.util.ArrayList;

/**
 * �������´�ӡ������
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * 
 * ˼·:
 * ��һ��arraylist��ģ�����
 * @author 77515
 *
 */
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	ArrayList<TreeNode> tree = new ArrayList<TreeNode>();
    	if(root == null){
    		return arr;
    	}
    	tree.add(root);
    	while(tree.size() > 0){
    		//tree.remove(0)�൱�ڵ�ջ����
    		TreeNode t = tree.remove(0);
    		arr.add(t.val);
    		if(t.left != null){
    			tree.add(t.left);
    		}
    		if(t.right != null){
    			tree.add(t.right);
    		}
    	}
        
        return arr;
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