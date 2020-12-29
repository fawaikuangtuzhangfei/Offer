package com.sjms.ResponsibilityChain;

/**
 * @author yc
 * @date 2020-11-26 13:56
 */
public class WashFace implements FilterChain{
    @Override
    public void doFilter(ToDoList toDoList, FilterChain filterChain) {
        if(toDoList.isWashface()){
            System.out.println("washface...");
        }
        filterChain.doFilter(toDoList,filterChain);
    }
}
