public class practice4 { // Rotate by one
    public static void rotatebyone(int arr[]){
        int n=arr.length;
        int temp[] = new int[n];
        for(int i=1;i<n;i++){
            temp[i-1]=arr[i];
        }
        temp[n-1]=arr[0];
        for(int i=0;i<n;i++){
            System.out.print(temp[i] + " ");
        }
       
        
    }
    
    public static void main(String[] args){
        int arr[]={7,4,3,6,8,1,3,4};
        
        rotatebyone(arr);

    }
    
}
