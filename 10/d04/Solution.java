package d04;

/**
 * ��Ŀ:�ؽ�������
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
 * 
 * ˼·1:
 * ��˳����������ҵ��Ķ�Ϊ���ڵ㣬Ȼ��˳����������ҵ�����ڵ���ͬ��Ԫ�أ���˽ڵ���ߵ�Ϊ��������
 * �ұߵ�Ϊ�����������ϵĽ��з�����
 * @author 77515
 *
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode tree = reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
        
        return tree;
    }
    
    private TreeNode reConstructBinaryTree(int [] pre, int startPre, int endPre, int [] in, int startIn, int endIn){
    	
    	//�ݹ��������
    	if(startPre > endPre || startIn > endIn){
    		return null;
    	}
    	
    	int root = pre[startPre]; //�ܸ��ڵ�
    	//��rootΪ������ 
    	TreeNode tree = new TreeNode(root);
    	int nowRootIndex = 0; //Ŀǰ�ĸ��ڵ�
    	//��������,��ѯĿǰ�ĸ��ڵ�
    	for(int i=startIn; i<=endIn; i++){
    		if(in[i] == root){
    			nowRootIndex = i;
    			break;
    		}
    	}
    	//��ǰ�ĸ��ڵ��µ���������
    	int leftCount = nowRootIndex - startIn;
    	int rightCount = endIn - nowRootIndex;
    	
    	//�����ݹ����
    	tree.left = reConstructBinaryTree(pre, startPre+1, startPre+leftCount, in, startIn, nowRootIndex-1);
    	tree.right = reConstructBinaryTree(pre, startPre+leftCount+1, endPre, in, nowRootIndex+1, endIn);
    	
    	return tree;
    	
    }
}



//Definition for binary tree
  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
