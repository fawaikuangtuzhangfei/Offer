package d59按之字形顺序打印二叉树;

import com.jz.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，
 * 第三行按照从左到右的顺序打印，其他行以此类推。
 *
 * 输入：{8,6,10,5,7,9,11}
 * 输出：[[8],[10,6],[5,7,9,11]]
 *
 * 奇偶 层次遍历的变种
 * 所有节点都需要存到队列中
 * 1 先进先出
 * 2 后进先出
 */
public class Solution {

    public ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        //把根节点放进去
        queue.add(root);
        // 层数
        int level = 1;
        // 下层个数
        int end = 1;
        //当前个数
        int count = 0;
        while(!queue.isEmpty()){
            count++;
            boolean isStackflag = level % 2 != 0;

            root = queue.poll();
            TreeNode left = root.left;
            TreeNode right = root.right;

            if(left != null){
                queue.offer(left);
            }
            if(right != null){
                queue.offer(right);
            }
            if(isStackflag){
                if(left != null){
                    stack.push(left);
                }
                if(right != null){
                    stack.push(right);
                }
                list.add(root.val);
            }else{
                list.add(stack.pop().val);
            }
            if(end == count){
                count = 0;
                level++;
                end = queue.size();
                result.add(list);
                list = new ArrayList<>();
            }
        }
        return result;
    }

}
