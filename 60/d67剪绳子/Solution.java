package d67������;

/**
 * ����һ������Ϊn�����ӣ�������Ӽ�����������m�Σ�m��n����������n>1����m>1����
 * ÿ�����ӵĳ��ȼ�Ϊk[1],...,k[m]������k[1]x...xk[m]���ܵ����˻��Ƕ��٣�
 * ���磬�����ӵĳ�����8ʱ�����ǰ������ɳ��ȷֱ�Ϊ2��3��3�����Σ���ʱ�õ������˻���18��
 * 
 * ����һ����n����������档��2 <= n <= 60��  8
 * ��� 18
 * 
 * ˼·��
 * �����ܼ���3�ģ����ܳ���1���������1�ͺ�3�ϲ����4
 * eg 10->3 3 4
 * ������� 2->1 1    3->1 2
 * @author NSDBJ
 * @date 2020��6��22�� ����8:44:04
 */

public class Solution {
    public int cutRope(int target) {
    	if(target == 2){
    		return 1;
    	}
    	if(target == 3){
    		return 2;
    	}
    	if(target % 3 == 1){
    		return (int) (4 * Math.pow(3, target/3-1));
    	}else if(target % 3 == 0){
    		return (int) Math.pow(3, target/3);
    	}else{
    		return (int) (2 * Math.pow(3, target/3));
    	}
    }
}