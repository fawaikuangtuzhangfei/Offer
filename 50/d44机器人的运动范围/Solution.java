package d44�����˵��˶���Χ;

/**
 * ������һ��m�к�n�еķ���һ�������˴�����0,0�ĸ��ӿ�ʼ�ƶ���
 * ÿһ��ֻ�������ң��ϣ����ĸ������ƶ�һ�񣬵��ǲ��ܽ�������������������λ֮�ʹ���k�ĸ��ӡ� 
 * ���磬��kΪ18ʱ���������ܹ����뷽��35,37������Ϊ3+5+3+7 = 18�����ǣ������ܽ��뷽��35,38����
 * ��Ϊ3+5+3+8 = 19�����ʸû������ܹ��ﵽ���ٸ����ӣ�
 * eg 5,10,10   21    15 20 20 359
 * 
 * ˼·��
 * ����ͼȫ������Ϊfalse �߹�����Ϊtrue
 * ���ڣ��߳���ͼ( <0 )  �߹��ĵ�   ����threshold
 * 
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020��6��24�� ����2:40:00
 */
public class Solution {
    public int movingCount(int threshold, int rows, int cols)
    {
    	// ��ȫ����Ϊfalse �߹�֮������Ϊtrue
    	boolean[][] flags = new boolean[rows][cols];
    	
    	return dfs(threshold, rows, cols, flags, 0, 0);
    }
    
    private int dfs(int threshold, int rows, int cols, boolean[][] flags, int r, int c){
    	// ����
    	if(r < 0 || r >= rows || c < 0 || c >= cols || flags[r][c] == true || sum(r) + sum(c) > threshold){
    		return 0;
    	}
    	
    	flags[r][c] = true;
    	
    	return dfs(threshold, rows, cols, flags, r, c+1) +
    			dfs(threshold, rows, cols, flags, r, c-1) +
    			dfs(threshold, rows, cols, flags, r+1, c) +
    			dfs(threshold, rows, cols, flags, r-1, c) 
    			+ 1
    			;
    }
    
    private int sum(int num){
    	int count = 0;
    	while(num != 0){
    		count += num % 10;
    		num /= 10;
    	}
    	return count;
    }
}
