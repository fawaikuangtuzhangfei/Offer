package d57二叉树的下一个结点;

import org.junit.Test;

import javax.xml.soap.Node;

/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 *
 * 中序 左根右
 * 如果有右子树，下一个就是右子树的
 * 1、有左子树->最左节点
 * 2、无左子树->右子树的第一个
 * 如果没有右子树
 * 1、有根
 * 1.1、是根的左孩子->父节点
 * 1.2、是根的右孩子->父节点的父节点，直到是父的父的左子树
 * 2、无根->null
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
    TreeLinkNode next = null; //指向父节点

    TreeLinkNode(int val) {
        this.val = val;
    }
}