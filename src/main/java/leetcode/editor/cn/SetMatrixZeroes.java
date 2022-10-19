package leetcode.editor.cn;

// leetcode 数组 m 73 矩阵置0
// 给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
//
// 进阶： 
//
// 
// 一个直观的解决方案是使用 O(mn) 的额外空间，但这并不是一个好的解决方案。 
// 一个简单的改进方案是使用 O(m + n) 的额外空间，但这仍然不是最好的解决方案。 
// 你能想出一个仅使用常量空间的解决方案吗？ 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：matrix = [[1,1,1],[1,0,1],[1,1,1]]
// 111
// 101
// 111
//输出：[[1,0,1],[0,0,0],[1,0,1]]
// 
//
// 示例 2：
//
// 
//输入：matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//输出：[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
// 
//
// 
//
// 提示： 
//
// 
// m == matrix.length 
// n == matrix[0].length 
// 1 <= m, n <= 200 
// -231 <= matrix[i][j] <= 231 - 1 
// 
// Related Topics 数组 哈希表 矩阵 
// 👍 533 👎 0

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes{
    public static void main(String[] args) {
        Solution solution = new SetMatrixZeroes().new Solution();
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        solution.setZeroes(matrix);
        System.out.println(matrix);
    }


    /**
     * O(1) 存储
     * O(nm) 时间
     * 先遍历第一行和第一列来确定原本是否有0 有的话还需要将其设置为0
     * 拿第一行和第一列存储每行每列是否拥有0
     */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean row = false;
        boolean line = false;
        // 检测第一行、第一列是否本身就有0
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == 0){
                row = true;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if(matrix[0][i] == 0){
                line = true;
            }
        }
        // 检测除了第一行和第一列外是否有0
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        // 根据首行 首列改变原矩阵格式化
        for (int i = 1; i < matrix.length; i++) {
           if(matrix[i][0] == 0){
               for (int j = 1; j < matrix[0].length; j++) {
                   matrix[i][j] = 0;
               }
           }
        }
        for (int i = 1; i < matrix[0].length; i++) {
            if(matrix[0][i] == 0){
                for (int j = 1; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        // 第一行 第一列格式化
        if(row){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        if(line){
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

//    class Solution {
//        public void setZeroes(int[][] matrix) {
//            List<String> list = new ArrayList<>();
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[i].length; j++) {
//                    if(matrix[i][j] == 0){
//                        list.add(i + "," + j);
//                    }
//                }
//            }
//
//            for (String s : list) {
//                String[] split = s.split(",");
//                int row = Integer.parseInt(split[0]);
//                int line = Integer.parseInt(split[1]);
//
//                for (int i = 0; i < matrix.length; i++) {
//                    matrix[i][line] = 0;
//                }
//                for (int i = 0; i < matrix[0].length; i++) {
//                    matrix[row][i] = 0;
//                }
//            }
//
//        }
//    }