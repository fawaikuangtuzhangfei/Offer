package d38�����������;

/**
 * ����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 * 
 * �ݹ�
 * ������ѻ�֪�������������������ȣ���ôֻ��Ҫ��������+1����
 * 
 * @author nanshoudabaojian
 *
 */
public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root == null){
        	return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left, right)+1;
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