package app.utils;

public class ArrayUtils {

    public static void mergeSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);

        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = (array[i] <= array[j]) ? array[i++] : array[j++];
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= right) {
            temp[k++] = array[j++];
        }

        System.arraycopy(temp, 0, array, left, temp.length);
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) return mid;
            if (array[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
