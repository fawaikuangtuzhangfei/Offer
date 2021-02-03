package d59��֮����˳���ӡ������;

import com.jz.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * ��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ���ڶ��㰴�մ��������˳���ӡ��
 * �����а��մ����ҵ�˳���ӡ���������Դ����ơ�
 *
 * ���룺{8,6,10,5,7,9,11}
 * �����[[8],[10,6],[5,7,9,11]]
 *
 * ��ż ��α����ı���
 * ���нڵ㶼��Ҫ�浽������
 * 1 �Ƚ��ȳ�
 * 2 ����ȳ�
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
        //�Ѹ��ڵ�Ž�ȥ
        queue.add(root);
        // ����
        int level = 1;
        // �²����
        int end = 1;
        //��ǰ����
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
