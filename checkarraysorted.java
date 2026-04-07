public class checkarraysorted {
    public static int sortornot(int arr[]){
        for(int i=0; i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return 0;

            }
        }
        return 1;
    } 
    public static void main(String[] args) {
        int arr[] = {8,2,9,6,7,3};
        System.out.println(sortornot(arr));
        
    }
    
}
