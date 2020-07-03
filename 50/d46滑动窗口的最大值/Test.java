package d46滑动窗口的最大值;

public class Test {

	public static void main(String[] args) {
		Solution_2 s = new Solution_2();
		int[] num = {2,3,4,2,6,2,5,1};
		int size = 3;
		// [4,4,6,6,6,5]
		System.out.println(s.maxInWindows(num, size));
	}

}
