public class SumOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 5, 6};

        int n = arr1.length;
        int result[] = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        // Print result array
        System.out.println("Sum of two arrays:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}