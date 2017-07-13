package com.preparation.sorting;
/**
 * Steps:
Quick sort works by partitioning a given array A[p . . r] into two non-empty sub array A[p . . q] and A[q+1 . . r] such that every key in A[p . . q] is less than or equal to every key in A[q+1 . . r].
 Then the two subarrays are sorted by recursive calls to Quick sort. The exact position of the partition depends on the given array and index q is computed as a part of the partitioning procedure.
 
 1. The running time of quick sort depends on whether partition is balanced or unbalanced, which in turn depends on which elements of an array to be sorted are used for partitioning.
 2. A very good partition splits an array up into two equal sized arrays. A bad partition, on other hand, splits an array up into two arrays of very different sizes. The worst partition puts
  only one element in one array and all other elements in the other array. If the partitioning is balanced, the Quick sort runs asymptotically as fast as merge sort. On the other hand, if partitioning is unbalanced,
   the Quick sort runs asymptotically as slow as insertion sort
 3. Quick sort is not a stable sorting technique
   
Complexity:
1. Worst Case Time Complexity : O(n2) (The worst-case occurs if given array A[1 . . n] is already sorted. The PARTITION (A, p, r) call always return p so successive calls to partition will split arrays of length
 n, n-1, n-2, . . . , 2 and running time proportional to n + (n-1) + (n-2) + . . . + 2 = [(n+2)(n-1)]/2 =  (n2). The worst-case also occurs if A[1 . . n] starts out in reverse order)
2. Best Case Time Complexity : O(n log n)
3. Average Time Complexity : O(n log n)
4. Space Complexity : O(n log n)
 * @author hug46010
 *
 */
public class QuickSort {
	
	private int[] numbers;
    private int number;
	
	public static void main(String[] args) 
	{
		QuickSort sorter = new QuickSort();
		int[] test = { 51, 52, 60, 67, 460, 450, 500, 502};
        sorter.sort(test);
        printResult(test);
	}

    private static void printResult(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
    }
    public void sort(int[] values) {
        if (values ==null || values.length==0){
            return;
        }
        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) 
    {
        int i = low, j = high;
        int pivot = numbers[low + (high-low)/2];
        while (i <= j) 
        {
            while (numbers[i] < pivot) 
            {
                i++;
            }
            while (numbers[j] > pivot)
            {
                j--;
            }
            if (i <= j) 
            {
                exchange(i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) 
    {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}
