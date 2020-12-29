package com.sjms.ResponsibilityChain;

/**
 * @author yc
 * @date 2020-11-26 13:54
 */
public interface FilterChain {

    public void doFilter(ToDoList toDoList, FilterChain filterChain);

}
