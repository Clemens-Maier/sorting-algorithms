package de.jkgweil.informatik;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for SortingAlgorithms class.
 */
public class SortingAlgorithmsTest  {
    static final Integer[] testArray1 = {9,8,7,6,5,4,3,2,1};
    static final Integer[] testArray1Result = {1,2,3,4,5,6,7,8,9};

    static final Integer[] testArray2 = {746, -42, 1337, 11, 78, -298, 331, 999};
    static final Integer[] testArray2Result = {-298, -42, 11, 78, 331, 746, 999, 1337};

    static final Integer[] testArray3 = {-1, -354, -92, -43257, -200 , -45, -999};
    static final Integer[] testArray3Result = {-43257, -999, -354, -200, -92, -45, -1};

    static final Integer[] testArray4 = {0};
    static final Integer[] testArray4Result = {0};

 
    SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();


    @Test
    void bubbleSortTest()
    {
        Integer[] testResult1 = sortingAlgorithms.bubbleSort(testArray1);
        assertArrayEquals(testArray1Result, testResult1);

        Integer[] testResult2 = sortingAlgorithms.bubbleSort(testArray2);
        assertArrayEquals(testArray2Result, testResult2);

        Integer[] testResult3 = sortingAlgorithms.bubbleSort(testArray3);
        assertArrayEquals(testArray3Result, testResult3);

        Integer[] testResult4 = sortingAlgorithms.bubbleSort(testArray4);
        assertArrayEquals(testArray4Result, testResult4);
    }

    @Test
    void insetionSortTest()
    {
        Integer[] testResult1 = sortingAlgorithms.insertionSort(testArray1);
        assertArrayEquals(testArray1Result, testResult1);

        Integer[] testResult2 = sortingAlgorithms.insertionSort(testArray2);
        assertArrayEquals(testArray2Result, testResult2);

        Integer[] testResult3 = sortingAlgorithms.insertionSort(testArray3);
        assertArrayEquals(testArray3Result, testResult3);

        Integer[] testResult4 = sortingAlgorithms.insertionSort(testArray4);
        assertArrayEquals(testArray4Result, testResult4);
    }

    @Test
    void quickSortTest()
    {
        Integer[] testResult1 = sortingAlgorithms.quickSort(testArray1,0 , testArray1.length - 1);
        assertArrayEquals(testArray1Result, testResult1);

        Integer[] testResult2 = sortingAlgorithms.quickSort(testArray2, 0, testArray2.length - 1);
        assertArrayEquals(testArray2Result, testResult2);

        Integer[] testResult3 = sortingAlgorithms.quickSort(testArray3, 0, testArray3.length - 1);
        assertArrayEquals(testArray3Result, testResult3);

        Integer[] testResult4 = sortingAlgorithms.quickSort(testArray4, 0, testArray4.length - 1);
        assertArrayEquals(testArray4Result, testResult4);
    }

    @Test
    void selectionSortTest()
    {
        Integer[] testResult1 = sortingAlgorithms.selectionSort(testArray1);
        assertArrayEquals(testArray1Result, testResult1);

        Integer[] testResult2 = sortingAlgorithms.selectionSort(testArray2);
        assertArrayEquals(testArray2Result, testResult2);

        Integer[] testResult3 = sortingAlgorithms.selectionSort(testArray3);
        assertArrayEquals(testArray3Result, testResult3);

        Integer[] testResult4 = sortingAlgorithms.selectionSort(testArray4);
        assertArrayEquals(testArray4Result, testResult4);
    }
}
