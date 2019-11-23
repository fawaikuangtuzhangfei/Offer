package d24�������к�Ϊĳһֵ��·��;

import java.util.ArrayList;

/**
 * �������к�Ϊĳһֵ��·��
 * ����һ�Ŷ������ĸ��ڵ��һ��������
 * ��ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 * (ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
 * 
 * ˼·:
 * ˳���߼���
 * @author 77515
 *
 */
public class Solution {
	private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    	backtracking(root, target, new ArrayList<Integer>());
    	return result;
    }
    public void backtracking(TreeNode root, int target, ArrayList<Integer>path){
    	if(root == null){
    		return;
    	}
    	target -= root.val;
    	path.add(root.val);
    	if(target == 0 && root.left == null && root.right == null){
    		//ÿ�ζ��½�һ��path Ԥ��ֵ������Ⱦ��һ��path
    		result.add(new ArrayList<>(path));
    	}else{
    		backtracking(root.left, target, path);
    		backtracking(root.right, target, path);
    	}
    	//�ݹ鵽Ҷ�ӽڵ㻹û�������Ҫ����
    	path.remove(path.size() - 1);
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