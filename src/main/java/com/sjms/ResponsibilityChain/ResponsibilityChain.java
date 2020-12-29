package com.sjms.ResponsibilityChain;

/**
 * 责任链模式->使每个对象都可以去执行
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系，将这个对象连成一条链，
 * 并沿着这条链传递该请求，直到有一个对象处理他为止。
 *
 * 场景:
 * 现在有一个场景：小明要去上学，妈妈给小明列了一些上学前需要做的清单（洗头、吃早饭、洗脸），
 * 小明必须按照妈妈的要求，把清单上打钩的事情做完了才可以上学。
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
