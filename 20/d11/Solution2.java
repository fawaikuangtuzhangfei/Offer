package d11;

/**
 * ��������1�ĸ���
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 * 
 * ˼·: n&(n-1)
 * ֱ������API
 * @author 77515
 *
 */
public class Solution2 {
	public  int NumberOf1(int n) {
		return Integer.bitCount(n);
	}
}