package com.sjms.ResponsibilityChain;

/**
 * ������ģʽ->ʹÿ�����󶼿���ȥִ��
 * ʹ��������л��ᴦ�����󣬴Ӷ���������ķ����ߺͽ�����֮�����Ϲ�ϵ���������������һ������
 * ���������������ݸ�����ֱ����һ����������Ϊֹ��
 *
 * ����:
 * ������һ��������С��Ҫȥ��ѧ�������С������һЩ��ѧǰ��Ҫ�����嵥��ϴͷ�����緹��ϴ������
 * С�����밴�������Ҫ�󣬰��嵥�ϴ򹳵����������˲ſ�����ѧ��
 * @author yc
 * @date 2020-11-26 13:46
 */
public class ResponsibilityChain {

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        EatBreakfast eatBreakfast = new EatBreakfast();
        WashFace washFace = new WashFace();

        Study study = new Study();
        ToDoListFilter filter = new ToDoListFilter(study);
        filter.addToDoList(eatBreakfast);
        filter.addToDoList(washFace);



    }


}
