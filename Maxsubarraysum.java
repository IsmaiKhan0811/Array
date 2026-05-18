public class Maxsubarraysum {

    public static int findmaxsubarray(int arr[]) {

        int n = arr.length;

        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {

            int sum = 0;

            for(int j = i; j < n; j++) {

                sum += arr[j];

                maxi = Math.max(maxi, sum);
            }
        }

        return maxi;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,-1,-1,-2,3,2};

        System.out.println(findmaxsubarray(arr));
    }
}