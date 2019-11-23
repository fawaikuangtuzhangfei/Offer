package d39ƽ�������;

/**
 * ����һ�ö��������жϸö������Ƿ���ƽ���������
 * 
 * ƽ��������Ķ��壺��������������һ���������������ĸ߶Ⱥ��������ĸ߶�������1ʱ���ö�����Ϊƽ���������
 * 
 * ˼·��
 * �Ƿ�Ϊһ�Ŷ���������Ҫ֪������������Ϣ
 * 1.���������ĸ߶�
 * 2.�Ƿ�Ϊƽ����
 * 
 * @author nanshoudabaojian
 *
 */
public class Solution {
    public static boolean IsBalanced_Solution(TreeNode root) {
    	ReturnTree now = isBalance(root);
    	return now.isBalance;
    }
    
    public static ReturnTree isBalance(TreeNode root){
    	if(root == null){
    		return new ReturnTree(0, true);
    	}
    	ReturnTree left = isBalance(root.left);
    	if(left.isBalance == false){
    		return new ReturnTree(0, false);
    	}
    	ReturnTree right = isBalance(root.right);
    	if(right.isBalance == false){
    		return new ReturnTree(0, false);
    	}
    	if(Math.abs(left.hight - right.hight) > 1){
    		return new ReturnTree(0, false);
    	}
    	//��ƽ����������ĸ߶�Ϊ��������������+1
    	return new ReturnTree(Math.max(left.hight, right.hight)+1, true);
    }
    public static void main(String[] args) {
    	TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.left.left.left = new TreeNode(10);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        boolean isBalanced_Solution = IsBalanced_Solution(root);
        System.out.println(isBalanced_Solution);
    }
}

class ReturnTree{
	public int hight;
	public boolean isBalance;
	public ReturnTree(int hight, boolean isBalance){
		this.hight = hight;
		this.isBalance = isBalance;
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
