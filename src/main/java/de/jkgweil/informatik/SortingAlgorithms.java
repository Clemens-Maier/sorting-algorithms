package de.jkgweil.informatik;

/**
 * The class SortingAlgorithms implements several different sorting algorithms.
 * This class is for teaching purposes, the implementations are missing on purpose. If all tests
 * are passed, the implementations are correct.
 *
 * @author C. Maier
 *
 */
public class SortingAlgorithms {

    /**
     * The method bubbleSort sorts a given array using the bubble sort algorithm.
     *
     * @param array: the (unsorted) given array to sort
     * @return the sorted array
     */
    public Integer[] bubbleSort(Integer[] arrayToSort) {
        //TODO: implement

        return arrayToSort;
    }

    /**
     * The method insertionSort sorts a given array using the insertion sort algorithm.
     *
     * @param array: the (unsorted) given array to sort
     * @return the sorted array
     */
    public Integer[] insertionSort(Integer[] arrayToSort) {
        //TODO: implement

        return arrayToSort;
    }

    /**
     * The method quickSort sorts a given array using the recursive quicksort algorithm.
     *
     * @param array: the (unsorted) given array to sort
     * @param left: the left starting index
     * @param right: the right ending index
     * @return the sorted array
     */
    public Integer[] quickSort(Integer[] arrayToSort, int left, int right) {
        //TODO: implement

        return arrayToSort;
    }


    /**
     * The method selectionSort sorts a given array using the selection sort algorithm.
     *
     * @param array: the (unsorted) given array to sort
     * @return the sorted array
     */
    public Integer[] selectionSort(Integer[] arrayToSort) {
        //TODO: implement

        return arrayToSort;
    }

    /**
     * The method partition is used inside the quicksort algortihm to partition the array 
     * using the pivot element into two partitions - all element smaller than the pivot in
     * the left partition and alle elements greater than the pivot in the right.
     *
     * @param array: the given array to partition
     * @param left: the left (lower) boundary used for partitioning
     * @param right: the right (higher) boundary used for partitioning
     * @return the index of the pivot element in its final position
     */
    private Integer partition(Integer array[], int left, int right) 
    { 
        // take right element as pivot
        int pivot = array[right]; 
        // index of smaller element 
        int indexSmaller = left - 1; 

        // iterate from left to right element
        for (int j = left; j <= right - 1; j++) { 
            if (array[j] <= pivot) { 
                indexSmaller++; 
                // swap array[indexSmaller] and array[j] 
                Integer tmp = array[indexSmaller]; 
                array[indexSmaller] = array[j]; 
                array[j] = tmp; 
            } 
        } 
  
        // put pivot in right place by swaping array[indexSmaller+1] and array[right] (which is pivot)
        int temp = array[indexSmaller + 1]; 
        array[indexSmaller + 1] = array[right]; 
        array[right] = temp; 
  
        return indexSmaller + 1; 
    } 

}
