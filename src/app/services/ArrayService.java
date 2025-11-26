package app.services;

import app.repository.DataRepository;

import java.util.Arrays;

import static app.utils.ArrayUtils.binarySearch;
import static app.utils.ArrayUtils.mergeSort;
import static app.view.ResultView.getOutput;

public class ArrayService {
    DataRepository dataRepository = new DataRepository();
    int[] arr = dataRepository.getData();

    public void sort() {
        getOutput("Original array:");
        getOutput(Arrays.toString(arr));

        mergeSort(arr);
        getOutput("Sorted array:");
        getOutput(Arrays.toString(arr));
    }

    public void searchNumber(int target) {
        getOutput("\nSearching for: " + target);

        int index = binarySearch(arr, target);
        if (index != -1) {
            getOutput("Found at index: " + index);
        } else {
            getOutput("Value NOT found");
        }
    }
}
