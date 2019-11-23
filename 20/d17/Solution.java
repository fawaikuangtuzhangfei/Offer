package d17;

/**
 * 树的子结构
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 
 * 思路:
 * 通常对于查找树的某个节点，都是采用递归的方式来进行的
 * 
 * @author 77515
 *
 */
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	//当树1和数2都为空树的时候 不需要比较 直接false
    	if(root1 == null || root2 == null){
    		return false;
    	}
    	//进行整个树的比较 根左树 根右树
        return isChild(root1, root2) || isChild(root1.left, root2) || isChild(root1.right, root2);
    }
    public boolean isChild(TreeNode root1,TreeNode root2){
    	//如果树2遍历完了还没出错 就返回true
    	if(root2 == null){
    		return true;
    	}
    	//如果树1遍历完了 树2还没遍历完 说明不是子树 返回false
    	if(root1 == null){
    		return false;
    	}
    	//如果两树的有一点不一样 直接false
    	if(root1.val != root2.val){
    		return false;
    	}
    	//如果根对应上了 则比较左和左 右和右 不断的递归循环遍历树 
    	return isChild(root1.left, root2.left) && isChild(root1.right, root2.right);
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