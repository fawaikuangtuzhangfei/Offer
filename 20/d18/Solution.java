package d18;

/**
 * �������ľ���
 * �������ľ����壺
 * 		Դ������ 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	���������
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
    	
    ˼·:
    ���ϵĽ����ڵ�����Һ��ӽ���
    

���ǻ����ǵõݹ���ռ�˼������ѧ���ɷ�������˼���ݹ��ʱ��һ����Ҫȥһ��һ������ִ����ɶ��ֻ����ơ��������μ�ס��˼���ķ�ʽ���������ȼ��������ⶼ�Ѿ�����������ֻ��Ҫ����һ�����յ����⼴�ɣ�������Ĵ���ʽ�������Ǹ�����ʽһ�������������ģһ��Ҫ��1�Ľ�����С������һ���ݹ�����������ɡ�

���ڱ��⣬���ȼ���root�����������Ѿ���������ˣ��������������Ѿ������ˣ�����������Ҳ�����ˣ���ô���һ�����ǽ���������������������������ֻ��Ҫ��root.left��root.right�������ɡ��������ݹ飬���Ǵ��������⡣������Ĵ���ʽ��rootһ����ֻ��Ҫ��С�����ģ������ֻ��Ҫ����root.left��ʲô�����root.right��ʲô������ɡ�
 * @author 77515
 *
 */
public class Solution {
    public void Mirror(TreeNode root) {
    	//���Ͻ��н�����ֱ����ΪҶ�ӽڵ�
    	if(root == null){
    		return;
    	}
    	swap(root);
    	Mirror(root.left);
    	Mirror(root.right);
    }
    public void swap(TreeNode root){
    	TreeNode t = root.left;
    	root.left = root.right;
    	root.right = t;
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


