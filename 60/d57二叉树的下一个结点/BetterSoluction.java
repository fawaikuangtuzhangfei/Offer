package d57����������һ�����;

/**
 * 1��������ҽڵ�-���ҽڵ������
 * 2��û���ң��ҵ�һ����ǰ�ڵ�ĸ��ĸ�����
 * 3�����˸���û�ҵ�������null
 * @author yc
 * @date 2021-02-02 16:12
 */
public class BetterSoluction {
    TreeLinkNode GetNext(TreeLinkNode node){
        if(node == null){
            return null;
        }
        if(node.right != null){
            node = node.right;
            while(node.left != null){
                node = node.left;
            }
            return node;
        }
        while (node.next != null){
            if(node.next.left == node){
                return node.next;
            }
            node = node.next;
        }
        return null;
    }
}

