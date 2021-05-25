package com.example.springin5steps;

import org.springframework.stereotype.Component;

@Component
public interface SortAlgorithm {
    int[] sort(int[] numbers);
}
