package d44机器人的运动范围;

/**
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
 * 每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。 
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），
 * 因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 * eg 5,10,10   21    15 20 20 359
 * 
 * 思路：
 * 将地图全部设置为false 走过设置为true
 * 出口：走出地图( <0 )  走过的点   大于threshold
 * 
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020年6月24日 下午2:40:00
 */
public class Solution {
    public int movingCount(int threshold, int rows, int cols)
    {
    	// 先全部置为false 走过之后设置为true
    	boolean[][] flags = new boolean[rows][cols];
    	
    	return dfs(threshold, rows, cols, flags, 0, 0);
    }
    
    private int dfs(int threshold, int rows, int cols, boolean[][] flags, int r, int c){
    	// 出口
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
