public class Longestsubarray {

    public int findlongestsubarray(int arr[], int k) {

        int n = arr.length;

        int maxLength = 0;

        for(int i = 0; i < n; i++) {

            for(int j = i; j < n; j++) {

                int currentsum = 0;

                for(int m = i; m <= j; m++) {

                    currentsum += arr[m];
                }

                if(currentsum == k) {

                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,1,1,1,1,7};

        int k = 4;

        Longestsubarray obj = new Longestsubarray();

        int ans = obj.findlongestsubarray(arr, k);

        System.out.println(ans);
    }
}