package d18;

/**
 * 二叉树的镜像
 * 二叉树的镜像定义：
 * 		源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
    	
    思路:
    不断的将根节点的左右孩子交换
    

我们或许还记得递归的终极思想是数学归纳法，我们思考递归的时候一定不要去一步一步看它执行了啥，只会更绕。我们牢牢记住，思考的方式是我们首先假设子问题都已经完美处理，我只需要处理一下最终的问题即可，子问题的处理方式与最终那个处理方式一样，但是问题规模一定要以1的进制缩小。最后给一个递归出口条件即可。

对于本题，首先假设root的左右子树已经都处理好了，即左子树自身已经镜像了，右子树自身也镜像了，那么最后一步就是交换左右子树，问题解决。所以我只需要将root.left和root.right交换即可。下面进入递归，就是处理子问题。子问题的处理方式与root一样，只是要缩小问题规模，所以只需要考虑root.left是什么情况，root.right是什么情况即可。
 * @author 77515
 *
 */
public class Solution {
    public void Mirror(TreeNode root) {
    	//不断进行交换，直到变为叶子节点
    	if(root == null){
    		return;
    	}
    	swap(root);
    	Mirror(root.left);
    	Mirror(root.right);
    }
    public void swap(TreeNode root){
    	TreeNode t = root.left;
    	root.left = root.right;
    	root.right = t;
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


