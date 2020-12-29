package com.sjms.ResponsibilityChain;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yc
 * @date 2020-11-26 14:03
 */
public class ToDoListFilter implements FilterChain{

    private AtomicInteger number = new AtomicInteger(0);

    private List<FilterChain> filterChains = new ArrayList<>();

    private Study study;

    public ToDoListFilter(Study study){
        this.study = study;
    }

    public void addToDoList(FilterChain filterChain){
        filterChains.add(filterChain);
    }

    @Override
    public void doFilter(ToDoList toDoList, FilterChain filterChain) {
        if(filterChains.size() == number.get()){
            study.goToSchool();
        }
        filterChains.get(number.getAndIncrement()).doFilter(toDoList, filterChain);
    }
}
