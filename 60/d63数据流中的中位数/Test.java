package d63�������е���λ��;

public class Test {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = {5,2,3,4,1,6,7,0,8};
		for(int i:arr){
			s.Insert(i);
			System.out.println(s.GetMedian());
		}
		
	}
}
