package d57����������һ�����;

import org.junit.Test;

import javax.xml.soap.Node;

/**
 * ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�
 * ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
 *
 * ���� �����
 * ���������������һ��������������
 * 1����������->����ڵ�
 * 2����������->�������ĵ�һ��
 * ���û��������
 * 1���и�
 * 1.1���Ǹ�������->���ڵ�
 * 1.2���Ǹ����Һ���->���ڵ�ĸ��ڵ㣬ֱ���Ǹ��ĸ���������
 * 2���޸�->null
 *
 * {8,6,10,5,7,9,11},11
 */
public class Solution {

//    @Test
//    public void test(){
//        TreeLinkNode root = new TreeLinkNode(8);
//        root.left = new TreeLinkNode(6);
//        root.right = new TreeLinkNode(10);
//        root.right.left = new TreeLinkNode(9);
//        System.out.println(GetNext(root).val);
//    }


    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        TreeLinkNode parent = pNode.next;
        TreeLinkNode right = pNode.right;
        if(right != null){
            return getLeftNode(right);
        }
        if(parent != null){
            if(parent.left == pNode){
                return parent;
            }
            return getParentLeftNode(parent);
        }
        return null;
    }

    private TreeLinkNode getParentLeftNode(TreeLinkNode node) {
        if(node.next == null){
            return null;
        }
        if(node.next.left == node){
            return node.next;
        }else{
            node = getParentLeftNode(node.next);
        }
        return  node;
    }

    private TreeLinkNode getLeftNode(TreeLinkNode node) {
        if(node.left != null){
            node = getLeftNode(node.left);
        }
        return node;
    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null; //ָ�򸸽ڵ�

    TreeLinkNode(int val) {
        this.val = val;
    }
}