package d65�����е�·��;

/**
 * �����е�·��
 * �����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����·�����ԴӾ����е�����һ�����ӿ�ʼ��
 * ÿһ�������ھ������������ң����ϣ������ƶ�һ�����ӡ����һ��·�������˾����е�ĳһ�����ӣ����·�������ٽ���ø��ӡ�
 * eg:"ABCESFCSADEE",3,4,"ABCCED"   true
 *
 * ˼·:
 * 1����������һά����ת���ɶ�ά����
 * 2��ѭ���������ҵ�ָ���ַ����еĵ�һ��Ԫ��
 * 3���Դ�Ϊ��������������Ѱ�ҵڶ��������ҵĹ������߹�������Ϊtrue�����û�о�return false
 * Ҳ����˵��������Ϊ ��
 * 	�߳���ͼ +������Ŀ���ַ��� +�˵�Ԫ�����߹�
 * 4������ҵ��˵ڶ����ͼ����ҵ�3��.....
 * 5������ҵ����ַ�����ĩβ return true
 *
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020��7��1�� ����10:57:58
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
        // ����
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
