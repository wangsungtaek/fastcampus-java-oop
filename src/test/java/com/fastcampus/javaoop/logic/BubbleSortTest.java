package com.fastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        // Given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        // When
        List<Integer> testData = new ArrayList<>();
        testData.add(3);
        testData.add(2);
        testData.add(4);
        testData.add(5);
        testData.add(1);
        List<Integer> actual = bubbleSort.sort(testData);

        // Then
        List<Integer> resultData = new ArrayList<>();
        resultData.add(1);
        resultData.add(2);
        resultData.add(3);
        resultData.add(4);
        resultData.add(5);
        assertEquals(resultData, actual);
    }

}