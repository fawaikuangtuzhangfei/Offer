package d26������������˫������;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * ������������˫������
 * ����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 * tips:����������->��С�ڸ�С����; ˫������:ֱ��ǰ��-��ǰ���-ֱ�Ӻ��
 * 
 * ˼·:
 * �������ʱ����ǰ���ͺ��->�γ�����
 * 1.�������ʱ�������鱣������Ľ��
 * 2.�γ�����
 * 
 * ����:
 * �����������Ϥ->
 * ����ջ eg:   2
 * 			1    3
 * ��������(��ջ)˳��Ϊ:1 2 3
 * ����ѹջ 2 1 3 
 * �Ƚ�ͷѹ��ջ�У����ϵ�ȥ�����ƶ�ֱ��Ϊnull->��ջ �Դ˽�������ƶ� ֱ���ٴ�Ϊnull->
 * ��ջ �Դ˽�������ƶ� ֱ���ٴ�Ϊnull.....
 * ��ֹ��������ջΪ���ҵ�ǰ�����null->Ҳ�����������������
 * @author nanshoudabaojian
 *
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

}

public class Solution {
	public static void main(String[] args) {
		TreeNode test = new TreeNode(2);
		TreeNode left = new TreeNode(1);
		TreeNode right = new TreeNode(3);
		test.left = left;
		test.right = right;
		System.out.println(Convert(test));
	}
	
	private static List<TreeNode> list = new ArrayList<TreeNode>();
	
    public static TreeNode Convert(TreeNode pRootOfTree) {
    	inorderTree(pRootOfTree);
    	//   2
    	//1    3   ->�����1 2 3 null
    	if(list.size() == 0 || list.size() == 1){
    		return pRootOfTree;
    	}
    	//list�е�ֵΪ 1 2 3
    	for(int i=0; i<list.size() - 1; i++){
    		list.get(i).right = list.get(i+1);
    		list.get(i+1).left = list.get(i);
    	}
    	
    	return list.get(0);
    }
    
    //�ǵݹ������������Ķ���������
    public static void inorderTree(TreeNode head){
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	if(head != null){
    		while(!stack.isEmpty() || head != null){
    			//		2 
    			//1          3
    			//stack 2    2 1     1  2  3
    			if(head != null){
    				stack.push(head);
    				head = head.left;
    			}else{
    				head = stack.pop();
    				list.add(head);
    				head = head.right;
    			}
    		}
    	}
    }
}
