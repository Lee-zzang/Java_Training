public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
