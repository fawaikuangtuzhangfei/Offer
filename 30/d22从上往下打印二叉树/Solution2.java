package d22�������´�ӡ������;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * �������´�ӡ������
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * 
 * ˼·:
 * ����һ��������ʵ�ּ��ɣ��ö��д���ò�����нڵ�
 * �ڿ�ʼ����һ��Ľڵ�ʱ����ǰ�����еĽڵ������ǵ�ǰ��Ľڵ�����
 * ֻҪ���Ʊ�����ô��ڵ��������ܱ�֤��α����Ķ��ǵ�ǰ��Ľڵ㡣
 * @author 77515
 *
 */
public class Solution2 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
        	int size = queue.size();
        	while(size-- > 0){
        		TreeNode tree = queue.poll();
        		if(tree == null){
        			continue;
        		}
        		arr.add(tree.val);
        		queue.add(tree.left);
        		queue.add(tree.right);
        	}
        }
        return arr;
    }
}
