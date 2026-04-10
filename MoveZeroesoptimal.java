public class MoveZeroesoptimal {
    public static void movezeroes(int arr[]){
        int j=-1;
        for(int i =0; i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j == -1) return;
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;

            }
        }
    }
    public static void main(String[] args){
        int arr[] = {1,0,2,3,0,0,4,8,8,0};
        MoveZeroesoptimal obj = new MoveZeroesoptimal();
        obj.movezeroes(arr);
        System.out.println("After shifting zeroes");
        for(int n : arr){
            System.out.print(n);
        }

    }
    
}
