package d65矩阵中的路径;

/**
 * 矩阵中的路径
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一个格子开始，
 * 每一步可以在矩阵中向左，向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
 * eg:"ABCESFCSADEE",3,4,"ABCCED"   true
 *
 * 思路:
 * 1、将给定的一维数组转换成二维数组
 * 2、循环遍历，找到指定字符串中的第一个元素
 * 3、以此为契机，上下左右寻找第二个，在找的过程中走过就设置为true，如果没有就return false
 * 也就是说出口条件为 ：
 * 	走出地图 +不等于目标字符串 +此单元格已走过
 * 4、如果找到了第二个就继续找第3个.....
 * 5、如果找到了字符串的末尾 return true
 *
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020年7月1日 上午10:57:58
 */

public class Solution {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        char[][] map = new char[rows][cols];
        boolean[][] visits = new boolean[rows][cols];
        int index = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                map[i][j] = matrix[index++];
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(bfs(map, visits, rows, cols, i, j, 0, str)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean bfs(char[][] map, boolean[][] visits, int rows, int cols, int r, int c, int target, char[] str){
        // 出口
        if(r < 0 || r >= rows || c < 0 || c >= cols || visits[r][c] || map[r][c] != str[target]){
            return false;
        }
        if(target == str.length-1){
            return true;
        }
        visits[r][c] = true;
        if(bfs(map, visits, rows, cols, r+1, c, target+1, str)
                || bfs(map, visits, rows, cols, r-1, c, target+1, str)
                || bfs(map, visits, rows, cols, r, c+1, target+1, str)
                || bfs(map, visits, rows, cols, r, c-1, target+1, str))
        {
            return true;
        }
        visits[r][c] = false;
        return false;

    }

}
