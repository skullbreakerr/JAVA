public class quickSort {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 3 };
        int n = arr.length;

        quk_sort(arr, 0, n - 1);
        System.out.println("Sorted Array =>");
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }

    public static void quk_sort(int arr[], int low, int high) {
        if (low < high) {
            int index = divide(arr, low, high);

            quk_sort(arr, low, index - 1);
            quk_sort(arr, index + 1, high);
        }
    }

    public static int divide(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        pivot = arr[high];
        arr[i] = temp;
        return i;
    }
}