package leetcode.editor.cn;

// leetcode 数组相关 m 48 旋转图像
// 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
//
// 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。 
//
// 
//
// 示例 1： 
//
// 
//输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[[7,4,1],[8,5,2],[9,6,3]]
//
// 示例 2：
//
// 
//输入：matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//输出：[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
// 
//
// 示例 3： 
//
// 
//输入：matrix = [[1]]
//输出：[[1]]
// 
//
// 示例 4： 
//
// 
//输入：matrix = [[1,2],[3,4]]
//输出：[[3,1],[4,2]]
// 
//
// 
//
// 提示： 
//
// 
// matrix.length == n 
// matrix[i].length == n 
// 1 <= n <= 20 
// -1000 <= matrix[i][j] <= 1000 
// 
// Related Topics 数组 数学 矩阵 👍 1001 👎 0

public class RotateImage{
    public static void main(String[] args) {
        Solution solution = new RotateImage().new Solution();
        int[][] matrix = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        solution.rotate(matrix);
    }

    /**
     * 顺时针旋转90°=
     * 斜线互换+对角互换
     * 1 2
     * 3 4
     *
     * 1 3
     * 2 4
     *
     * 3 1
     * 4 2
     */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        // 斜线
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // 对折
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][length-1 - j];
                matrix[i][length -1 - j] = temp;
            }
        }


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}