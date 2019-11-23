package d39ƽ�������;

/**
 * ����һ�ö��������жϸö������Ƿ���ƽ���������
 * 
 * ƽ��������Ķ��壺��������������һ���������������ĸ߶Ⱥ��������ĸ߶�������1ʱ���ö�����Ϊƽ���������
 * 
 * ˼·��
 * ������������ĸ߶� �鿴�߶�֮��
 * 
 * @author nanshoudabaojian
 *
 */
public class Solution3 {

		public static boolean IsBalanced_Solution(TreeNode root) {
		        if(root == null){
		            return true;
		        }
		 
		        if(root.left == null && root.right == null){
		            return true;
		        }
		 
		        //��ȡ�������������߶�
		        int left = judge(root.left);
		        int right = judge(root.right);
		 
		        //���߸߶Ȳ�����1����
		        return Math.abs(left-right) <= 1;
		    }
		 
		    private static int judge(TreeNode root){
		        if(root == null){
		            return 0;
		        }
		        int left = judge(root.left);
		        int right = judge(root.right);
		 
		        return Math.max(left,right) + 1;
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

