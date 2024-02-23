package sorting;

public class SelectionSort1 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 0, -9, -9, -4, 8, 98, 1};

        display(arr);
        //selectionSort(arr);
        insertionSort(arr);
        display(arr);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j-1]) {
                arr[j] = arr[j-1];
                j--;
            }

            arr[j] = temp;
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]< arr[smallestIndex])
                    smallestIndex = j;
            }

            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    private static void display(int[] arr) {
        for (int i : arr) {
           System.out.print(i + " ");
        }

        System.out.println();
    }
}
