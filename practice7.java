public class practice7 {
    public static void movezeroes(int arr[]){
        int j=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                j=i;//Holds the position of first zero
                break;
            }
        }
        for(int i=j+1; i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;

            }
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
    public static void main(String[] args){
        int arr[] = {1,2,3,9,0,3,5,0,0,4,5};
        movezeroes(arr);

    }
    
}
