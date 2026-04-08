public class Leftrotatebyone1 {
    public static void rotatebyone(int arr[]){
        int temp = arr[0];
        int n = arr.length;
        for(int i =1; i<n;i++){
            arr[i-1]=arr[i];
           
        }
         arr[n-1] = temp;
         for(int x : arr){
            System.out.print(x + " ");
        }
        
    }
    public static void main(String[] args ){
        int arr[] = {2,3,4,5,6};
         rotatebyone(arr    );
    }
}
