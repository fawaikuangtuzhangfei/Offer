package d28n��������ִ������ڵ���nһ�����;

import java.util.*;

/**
 * n��������ִ������ڵ���n/2����
 * ����n��������������ִ������ڵ������鳤��һ�������
 * 
 * ÿ������������� n���ո�ָ��n��������n������100��������һ���������ִ������ڵ���n/2��
 * 
 * ������ִ������ڵ���n/2������
 * 
 * �ٴλع�ʱ:
 * 1.oj�����벻�ᴦ��->�����ַ������н��գ�Ȼ����Ԥ��������в��
 * @author nanshoudabaojian
 *
 */
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        String str = sc.nextLine();
        String[] split = str.split(" ");
        for(int i=0; i<split.length; i++){
        	list.add(Integer.valueOf(split[i]));
        }
        System.out.println(find(list));
    }
    
    public static int find(ArrayList<Integer> list){
        if(list.size() == 1){
            return list.get(0);
        }
        int now = list.get(0);
        int count = 1;
        for(int i=1; i<list.size(); i++){
            if(now == list.get(i)){
                count++;
            }else{
                count--;
                if(count == 0){
                    now = list.get(i);
                    count = 1;
                }
            }
        }
        if(count > 0){
            count = 0;
            for(int i=0; i<list.size(); i++){
                if(now == list.get(i)){
                    count++;
                }
            }
            if(count >= list.size()/2){
                return now;
            }
        }
        
        return 0;
    }
}
