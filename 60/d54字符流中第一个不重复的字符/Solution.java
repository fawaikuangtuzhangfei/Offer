package d54�ַ����е�һ�����ظ����ַ�;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * �ַ����е�һ�����ظ����ַ�
 *
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
 * ���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"��
 * ���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
 *
 * �����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ�
 */
public class Solution {
    private Set<Character> set = new HashSet<>();
    private List<Character> list = new ArrayList<>();
    //Insert one char from stringstream
    public void Insert(char ch) {
        if(set.contains(ch)){
            int i = list.indexOf(ch);
            if(i != -1){
                list.remove(i);
            }
        }else{
            set.add(ch);
            list.add(ch);
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        if(list.size() > 0){
            return list.get(0);
        }
        return '#';
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.Insert('g');
        s.Insert('g');
        s.Insert('g');
        s.Insert('g');
        s.Insert('g');
        System.out.println(s.FirstAppearingOnce());
    }
}
