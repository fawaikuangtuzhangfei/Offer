package d57二叉树的下一个结点;

/**
 * 1、如果有右节点-找右节点的最左
 * 2、没有右，找第一个当前节点的父的父的左
 * 3、到了根还没找到，返回null
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

