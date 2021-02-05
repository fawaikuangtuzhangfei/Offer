package d58对称的二叉树;

import com.jz.common.TreeNode;

/**
 * 对称的二叉树
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 *
 * 输入：{8,6,6,5,7,7,5}   {8,6,9,5,7,7,5}
 * 输出：true              false
 * {8,6,6,5,7,7}
 */
public class Solution {

    boolean isSymmetrical(TreeNode root){
        if(root == null){
            return false;
        }
        return check(root.left, root.right);
    }

    boolean check(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null || left.val != right.val){
            return false;
        }else{
            return check(left.left, right.right) && check(left.right, right.left);
        }
    }

}
