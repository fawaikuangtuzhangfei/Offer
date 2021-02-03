package d60�Ѷ�������ӡ�ɶ���;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * �Ѷ�������ӡ�ɶ���
 * ���ϵ��°����ӡ��������ͬһ����������������ÿһ�����һ�С�
 * ���� {8,6,10,5,7,9,11}
 * ��� [[8],[6,10],[5,7,9,11]]
 *
 * ��α���������->���ö��� �Ƚ��ȳ�
 * �� ���
 * ���в�Ϊ��
 * ��һ�� ����ͷ
 * �� ���
 * �� ���
 *
 * 1��2��4 8 2(n-1)һ����ӵ�list��
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
        //����
        int count = 0;
        //��һ��
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

    //����������
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
