public class Missingno2 {
    public static int findmissing(int arr[], int n){
        int total_sum = n*(n+1)/2;
        int arr_sum =0;
        for(int i =0; i<arr.length;i++){
            arr_sum += arr[i];
        }
        return total_sum-arr_sum;

    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,9,10};
        int n =10;
        System.out.println(findmissing(arr, n));
    }
    
}
