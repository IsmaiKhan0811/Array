public class practice5 {// Rotate by k brute force
    public static void rotatebyk(int arr[],int k){
        int n=arr.length;
        k=k%n;
        int temp[] = new int[n];
        for(int i=0;i<k;i++){// Store first k element in temp
           temp[i]=arr[i];
        }
        for(int i =k;i<n;i++){// shift element to towards front
            arr[i-k]=arr[i];

        }
        for(int i=0; i<k;i++){ // Store temp in the last
            arr[n-k+i]=temp[i];

        }
        for(int i=0;i<n;i++){ // Print whole array
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9};
        int k=4;
        rotatebyk(arr,k);
    }
    
}
