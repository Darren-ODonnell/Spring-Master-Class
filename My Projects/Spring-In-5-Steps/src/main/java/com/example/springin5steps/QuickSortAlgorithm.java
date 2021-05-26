package com.example.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
    public QuickSortAlgorithm() {
        super();

    }

    public int[] sort(int[] numbers){
        //Logic for Bubble Sort
        return numbers;
    }
}