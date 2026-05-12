public class practice8 {
    public static int linearsearch(int arr[], int target){
        for(int i =0; i<arr.length;i++){
            if(arr[i]== target){
                return i;
            }
           
        }
         return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,2,1,3};
        int target = 4;
        int ans = linearsearch(arr,target);
        System.out.println(ans);
    }
    
}
