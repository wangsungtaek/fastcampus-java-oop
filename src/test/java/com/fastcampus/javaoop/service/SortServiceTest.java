package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sut = new SortService(new BubbleSort<String>());

    @Test
    void test() {

        // When
        List<String> testData = new ArrayList<>();
        testData.add("3");
        testData.add("2");
        testData.add("1");
        List<String> actual = sut.doSort(testData);

        // Then
        List<String> resultData = new ArrayList<>();
        resultData.add("1");
        resultData.add("2");
        resultData.add("3");
        assertEquals(resultData, actual);

    }
}