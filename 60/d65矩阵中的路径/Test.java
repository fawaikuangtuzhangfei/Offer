package d65¾ØÕóÖÐµÄÂ·¾¶;

public class Test {
	public static void main(String[] args) {
		Solution s = new Solution();
		String s1 = "ABCESFCSADEE";
		
		char[] matrix = s1.toCharArray();
		int rows = 3;
		int cols = 4;
		s1 = "SEE";
		char[] str = s1.toCharArray();
		
		System.out.println(s.hasPath(matrix, rows, cols, str));
	}
}
