// sort the array using the selection sort
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 2, 8, 3, 9, 4};

        for (int i = 0; i < arr.length; i++) {
            int min_index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

