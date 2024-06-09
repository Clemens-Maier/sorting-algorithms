package de.jkgweil.informatik;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingAlgorithmComparison {

    private static final String TEST_DATA_FILE_NAME = "testdata.csv";

    private static SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
    private static Integer[] originalTestArray;

    public static void main(String[] args) {
        // load test data
        loadTestArrayData();

        // compare the sorting algorithms
        compareAlgorithms();
    }

    
    public static void compareAlgorithms() {
        // test array which is a new deep copy of the original test array for every algorithm time test
        Integer[] testArray;

        // bubble sort
        testArray = Arrays.copyOf(originalTestArray, originalTestArray.length);
        Long timeBubbleSort = timeForBubbleSort(testArray);
        System.out.println("Sorting with bubble sort took "+ timeBubbleSort + " milliseconds.");
        
        // TODO - print the time of the other sorting algorithms similiar to bubble sort example
        
        // insertion sort
        // TODO

        // quick sort
        // TODO

        // selection sort
        // TODO
    }

    private static Long timeForBubbleSort(Integer[] arrayToSort) {
        Long tStart = System.currentTimeMillis();
        sortingAlgorithms.bubbleSort(arrayToSort);
        Long tStop = System.currentTimeMillis();
        return tStop - tStart;
    }

    private static Long timeForInsertionSort(Integer[] arrayToSort) {
        Long tStart = System.currentTimeMillis();
        sortingAlgorithms.insertionSort(arrayToSort);
        Long tStop = System.currentTimeMillis();
        return tStop - tStart;
    }

    private static Long timeForQuickSort(Integer[] arrayToSort) {
        Long tStart = System.currentTimeMillis();
        sortingAlgorithms.quickSort(arrayToSort, 0, arrayToSort.length - 1);
        Long tStop = System.currentTimeMillis();
        return tStop - tStart;
    }

    private static Long timeForSelectionSort(Integer[] arrayToSort) {
        Long tStart = System.currentTimeMillis();
        sortingAlgorithms.selectionSort(arrayToSort);
        Long tStop = System.currentTimeMillis();
        return tStop - tStart;
    }

    private static void loadTestArrayData() {
        // use string builder for file path
        StringBuilder stringBuilder = new StringBuilder()
            .append("src")
            .append(File.separator)
            .append("main")
            .append(File.separator)
            .append("resources")
            .append(File.separator)
            .append(TEST_DATA_FILE_NAME);

        List<String> listOfStrings = new ArrayList<>();
        try {
            Path filePath = Paths.get(stringBuilder.toString());
            //System.out.println(filePath.toAbsolutePath());
            listOfStrings = Files.readAllLines(filePath);
        } catch (IOException e) {
            // error while loading, print information
            System.out.println("Error: Something went wrong while trying to read the test data file!");
            e.printStackTrace();
        }
        // convert list to array
        originalTestArray = new Integer[listOfStrings.size()];
        originalTestArray = listOfStrings.stream()
        .map(Integer::valueOf)
        .collect(Collectors.toList())
        .toArray(originalTestArray);
    }
}
