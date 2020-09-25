package d49序列化二叉树;

/**
 * 序列化和反序列化
 * 
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020年7月20日 下午2:10:41
 */
public class Solution {
	
	private int index = -1;
	private StringBuffer sb = new StringBuffer();
	
	String Serialize(TreeNode root) {
		if(root == null){
			return "#";
		}
		sb.append(root.val + "!");
		Serialize(root.left);
		Serialize(root.right);
		return sb.toString();
	}

	TreeNode Deserialize(String str) {
		String[] strs = str.split("!");
		return DeserializeChars(strs);
	}
	
	TreeNode DeserializeChars(String[] strs) {
		index++;
		if(!"#".equals(strs[index])){
			TreeNode root = new TreeNode(Integer.valueOf(strs[index]));
			root.left = DeserializeChars(strs);
			root.right = DeserializeChars(strs);
			return root;
		}
		return null;
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
