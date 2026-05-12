public class practice2 {
    public static boolean sortedornot(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
           
        }
         return true;

    }
    public static void main(String[] args){
        int arr[] = {3,2,3,3,2,1};
        boolean ans = sortedornot(arr);
        System.out.println(ans);

    }
    
}
