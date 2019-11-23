package d38�����������;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 * 
 * ���Ĳ�α���
����ķǵݹ��α��������ø������У��Ƚ�ͷ�ڵ�����У������в���ʱ�����еĽڵ��Ϊcurrent��
��current��ڵ㲻��ʱ����У����ҽڵ㲻��ʱ����У����ѭ�����ɡ�
����ȣ��������cur��¼��ǰ����ʵ��Ľڵ�����width��¼��ǰ����ܸ�����ÿ�����ʹ�һ�����deep++��
 * @author nanshoudabaojian
 *
 */
public class Solution2 {
    public int TreeDepth(TreeNode root) {
    	if(root == null){
    		return 0;
    	}
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.add(root);
    	int deep = 0; // ���
    	int width = 0; //��ǰ��Ԫ�صĸ���
    	int cur = 0; //�����ǵڼ���
    	while(!queue.isEmpty()){
    		cur = 0; //�µ�һ�еĵ�һ��
    		width = queue.size();
    		while(cur < width){  //ֱ����������
    			TreeNode node = queue.poll();
    			if(node.left != null){
        			queue.add(node.left);
        		}
        		if(node.right != null){
        			queue.add(node.right);
        		}
        		cur++;//����һ����
    		}
    		deep++;//���+1
    	}
    	return deep;
    }
}
