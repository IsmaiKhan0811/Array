public class Longestsubarray1 {
    public int findlongsubarr(int arr[] , int k){
        int left=0;
        int right=0;
        int n = arr.length;
        int sum=arr[0];
        int max_length = 0;
        while(right<n){
        while(left<=right && sum>k){
            sum -= arr[left];
            left++;
        }
    if(sum==k){
        max_length = Math.max(max_length,right-left+1);
    }
right++;
if (right<n){
    sum += arr[right];
}
}
return max_length;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,1,5};
        int k =5;
        Longestsubarray obj = new Longestsubarray();
        int ans = obj.findlongestsubarray(arr, k);
        System.out.println(ans);

    }
    
}
