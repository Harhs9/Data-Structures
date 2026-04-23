// Merge Sort Implementation:

public class MergeSortImplementation {

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            combine(arr, start, mid, end);
        }
    }

    private static void combine(int[] arr, int start, int end, int mid) {
        int totalLength = end - start + 1;

        int[] c = new int[totalLength];

        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                c[k] = arr[i];
                i++;
                k++;
            } else {
                c[k] = arr[j];
                k++;
                j++;
            }
        }

        while (i <= mid) {
            c[k] = arr[i];
            i++;
            k++;
        }

        while (j <= end) {
            c[k] = arr[j];
            k++;
            j++;
        }

        for (i = 0; i < totalLength; i++) {
            arr[start + i] = c[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = {20,1,7,3,9,11,10,6};
        int n = arr.length;

        mergeSort(arr, 0, n - 1);

        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
