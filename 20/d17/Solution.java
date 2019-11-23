package d17;

/**
 * �����ӽṹ
 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 * 
 * ˼·:
 * ͨ�����ڲ�������ĳ���ڵ㣬���ǲ��õݹ�ķ�ʽ�����е�
 * 
 * @author 77515
 *
 */
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	//����1����2��Ϊ������ʱ�� ����Ҫ�Ƚ� ֱ��false
    	if(root1 == null || root2 == null){
    		return false;
    	}
    	//�����������ıȽ� ������ ������
        return isChild(root1, root2) || isChild(root1.left, root2) || isChild(root1.right, root2);
    }
    public boolean isChild(TreeNode root1,TreeNode root2){
    	//�����2�������˻�û���� �ͷ���true
    	if(root2 == null){
    		return true;
    	}
    	//�����1�������� ��2��û������ ˵���������� ����false
    	if(root1 == null){
    		return false;
    	}
    	//�����������һ�㲻һ�� ֱ��false
    	if(root1.val != root2.val){
    		return false;
    	}
    	//�������Ӧ���� ��Ƚ������ �Һ��� ���ϵĵݹ�ѭ�������� 
    	return isChild(root1.left, root2.left) && isChild(root1.right, root2.right);
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