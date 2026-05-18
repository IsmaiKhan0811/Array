public class Maxsubarraysum1 {
    public static int findmaxsubarr(int arr[]){
        int n=arr.length;
        int maxi = Integer.MIN_VALUE;
        int sum =0;
        for(int i =0; i<n; i++){
            sum += arr[i];
            if(sum>maxi){
                maxi = sum;
            }
            if(sum<0){
                sum=0;
            }
            
        }
        return (int) maxi;
    }
    public static void main(String[] args) {
        int arr[] = {-1,2,1,3,-1,0,1,1};
        System.out.println(findmaxsubarr(arr));

    }
    
}
