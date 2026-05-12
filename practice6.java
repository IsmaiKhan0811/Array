public class practice6 {
    public static void movezeroes(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];
        int j=0;
        for(int i=0; i<n;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }
        }
        while(j < n) {

            temp[j] = 0;
            j++;
        }
        
        for(int i=0; i<n;i++){
            System.out.print(temp[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,21,1,3,0,0,6,7,0};
        movezeroes(arr);
    }
    
}
