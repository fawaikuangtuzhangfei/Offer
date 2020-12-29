package com.sjms.ResponsibilityChain;

/**
 * @author yc
 * @date 2020-11-26 13:55
 */
public class EatBreakfast implements FilterChain{
    @Override
    public void doFilter(ToDoList toDoList, FilterChain filterChain) {
        if(toDoList.isEatBreakfast()){
            System.out.println("eatBreakfast...");
        }
        filterChain.doFilter(toDoList,filterChain);
    }
}
