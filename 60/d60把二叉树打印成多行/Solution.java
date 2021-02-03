package d60把二叉树打印成多行;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 把二叉树打印成多行
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * 输入 {8,6,10,5,7,9,11}
 * 输出 [[8],[6,10],[5,7,9,11]]
 *
 * 层次遍历二叉树->利用队列 先进先出
 * 根 入队
 * 队列不为空
 * 出一个 当作头
 * 左 入队
 * 右 入队
 *
 * 1、2、4 8 2(n-1)一层添加到list中
 * 1\3\7\15
 *
 * {8,6,10,5,7,9,11}
 * [[8],[10,5],[7,9],[11]]
 */

public class Solution {
    ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //个数
        int count = 0;
        //下一层
        int end = queue.size();

        while (root != null && queue.size() > 0){
            root = queue.poll();
            list.add(root.val);
            count++;

            TreeNode left = root.left;
            TreeNode right = root.right;
            if(left != null){
                queue.add(left);
            }
            if(right != null){
                queue.add(right);
            }
            if(count == end){
                count = 0;
                end = queue.size();
                result.add(list);
                list = new ArrayList<>();
            }
        }
        return result;
    }

    //构建二叉树
    private TreeNode createBinaryTreeByArray(int[] array, int index) {
        TreeNode tn = null;
        if (index < array.length) {
            int value = array[index];
            tn = new TreeNode(value);
            tn.left = createBinaryTreeByArray(array, 2 * index + 1);
            tn.right = createBinaryTreeByArray(array, 2 * index + 2);
            return tn;
        }
        return tn;
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
