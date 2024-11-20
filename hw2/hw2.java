package hw2;
import java.util.Random;
public class hw2 {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Array is already sorted or empty
        }

        int n = arr.length;
        int[] temp = new int[n]; // Temporary array for merging

        mergeSortRecursive(arr, temp, 0, n - 1);
}

private static void mergeSortRecursive(int[] arr, int[] temp, int left, int right) {
        if (left >= right) {
            return; // Base case: array has 0 or 1 element
        }

        int mid = left + (right - left) / 2; // Calculate the middle index

        mergeSortRecursive(arr, temp, left, mid); // Sort left half
        mergeSortRecursive(arr, temp, mid + 1, right); // Sort right half

        merge(arr, temp, left, mid, right); // Merge the two sorted halves
}
private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        // Copy elements to the temporary array
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left; // Pointer for the left half
        int j = mid + 1; // Pointer for the right half
        int k = left; // Pointer for the merged array

        // Merge the two halves by comparing the elements
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements from the left half, if any
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }

        // Copy the remaining elements from the right half, if any
        while (j <= right) {
            arr[k] = temp[j];
            j++;
            k++;
        }
 }
 public static int findMostCommonA(int[] arr) {
    mergeSort(arr); // we use mergeSort Method to find whther the array is full or not since we dont use array lists there's a limit
    int maxCount = 0, count = 1, mostCommon = arr[0];

    for (int i = 1; i < arr.length; i++) { // we check for every
        if (arr[i] == arr[i - 1]) {
            count++;
        } else {
            if (count > maxCount) {
                maxCount = count;
                mostCommon = arr[i - 1];
            }
            count = 1; 
        }
    }

    if (count > maxCount) {
        mostCommon = arr[arr.length - 1];
    }

    return mostCommon;
}

public static int findMostCommonB(int[] arr) { // we follow the same steps for array B
    int maxCount = 0, mostCommon = arr[0];

    for (int i = 0; i < arr.length; i++) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                count++;
            }
        }

        if (count > maxCount) {
            maxCount = count;
            mostCommon = arr[i];
        }
    }

    return mostCommon;
}
public static void main(String[] args) {
    Random random = new Random();
    int[] sizes = {10, 100, 1000, 10000, 100000};

    System.out.printf("%-10s %-15s %-15s%n", "", "Algorithm A", "Algorithm B");
    for (int size : sizes) {
        int[] arrayA = random.ints(size, 1, size / 10 + 1).toArray(); // we generate random integers
        // in order to avoid making changes on the same array twice we clone array A, we basically make a copy of it so we can make chages easier
        int[] arrayB = arrayA.clone();

        long start = System.nanoTime();
        findMostCommonA(arrayA);
        long finish = System.nanoTime();
        long timeA = finish - start;

        start = System.nanoTime();
        findMostCommonB(arrayB);
        finish = System.nanoTime();
        long timeB = finish - start;

        System.out.printf("%-10d %-15d %-15d%n", size, timeA, timeB);
    }
}


}
