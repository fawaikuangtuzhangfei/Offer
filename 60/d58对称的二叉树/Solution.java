package d58�ԳƵĶ�����;

import com.jz.common.TreeNode;

/**
 * �ԳƵĶ�����
 * ��ʵ��һ�������������ж�һ�ö������ǲ��ǶԳƵġ�ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
 *
 * ���룺{8,6,6,5,7,7,5}   {8,6,9,5,7,7,5}
 * �����true              false
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
