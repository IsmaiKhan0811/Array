
public class practice {
    public static int largestel(int arr[]){
        if(arr==null || arr.length==0){
            System.out.println("Not Possible");
        }
        int max=arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,2,4,6,2};
        int ans = largestel(arr);
        System.out.println(ans);

        
    }
    
}
