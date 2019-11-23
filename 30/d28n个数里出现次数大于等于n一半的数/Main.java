package d28n个数里出现次数大于等于n一半的数;

import java.util.*;

/**
 * n个数里出现次数大于等于n/2的数
 * 输入n个整数，输出出现次数大于等于数组长度一半的数。
 * 
 * 每个测试输入包含 n个空格分割的n个整数，n不超过100，其中有一个整数出现次数大于等于n/2。
 * 
 * 输出出现次数大于等于n/2的数。
 * 
 * 再次回顾时:
 * 1.oj的输入不会处理->利用字符串进行接收，然后按照预定规则进行拆分
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
