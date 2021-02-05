package d61���л�������;

import com.jz.common.TreeNode;
import org.junit.Test;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Queue;

/**
 * ��ʵ�������������ֱ��������л��ͷ����л�������
 *
 * �����������л���ָ����һ�ö���������ĳ�ֱ�����ʽ�Ľ����ĳ�ָ�ʽ����Ϊ�ַ�����
 * �Ӷ�ʹ���ڴ��н��������Ķ��������Գ־ñ��档���л����Ի����������򡢺��򡢲���Ķ�����������ʽ�������޸ģ�
 * ���л��Ľ����һ���ַ��������л�ʱͨ�� ĳ�ַ��ű�ʾ�սڵ㣨#������ �� ��ʾһ�����ֵ�Ľ�����value!����
 *
 * �������ķ����л���ָ������ĳ�ֱ���˳��õ������л��ַ������str���ع���������
 *
 * ���磬���ǿ��԰�һ��ֻ�и��ڵ�Ϊ1�Ķ��������л�Ϊ"1,"��Ȼ��ͨ���Լ��ĺ��������������������
 *
 * ���룺{8,6,10,5,7,9,11}
 * �����{8,6,10,5,7,9,11}
 *
 * {8,6,10,5,7,9,11}
 * {5,4,#,3,#,2}
 * {5,#,4,#,3,#,2}
 * {5}
 * {}
 * {100,50,#,#,150}
 * {8,4,12,2,6,10,14,1,3,5,7,9,11,13,15}
 *
 * ������л�
 * �����վʹ�գ�����������
 * ���е�����ʱ�򣬿վͼ�#������������
 *
 * �����л�
 * ���ö��У�������ھʹ�����У������ھ͸�ֵnull
 */
public class Solution {
    @Test
    public void t1(){
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        System.out.println(Serialize(root));
        Deserialize(Serialize(root));
    }
    String Serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        queue.add(root);
        int count = 0;
        // ��һ��ĸ���
        int end = 1;
        while (!queue.isEmpty()){
            root = queue.poll();
            count++;
            if(root == null){
                sb.append("#,");
                continue;
            }
            int val = root.val;
            sb.append(val).append(",");
            TreeNode left = root.left;
            TreeNode right = root.right;
            if(left != null){
                queue.offer(left);
            }else {
                queue.offer(null);
            }
            if(right != null){
                queue.offer(right);
            }else {
                queue.offer(null);
            }
            if(count == end){
                count = 0;
                end = queue.size();
            }
        }
        return String.valueOf(sb);
    }
    TreeNode Deserialize(String str) {
        String[] split = str.split(",");
        if(split.length == 0){
            return null;
        }
        int length = split.length - 1;
        String s0 = split[0];
        if("#".equals(s0)){
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(s0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 0;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(i >= length || "#".equals(split[++i])){
                node.left = null;
            }else{
                node.left = new TreeNode(Integer.parseInt(split[i]));
                queue.offer(node.left);
            }
            if(i >= length || "#".equals(split[++i])){
                node.right = null;
            }else{
                node.right = new TreeNode(Integer.parseInt(split[i]));
                queue.offer(node.right);
            }
        }
        return root;
    }

}
