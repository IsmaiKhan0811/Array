public class SecondLargest {
    public static int findsecondlargest(int arr[]){
        if(arr==null || arr.length<2){
            System.out.println("Can't possible");
        }
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                second_largest = largest;
                largest = arr[i];
            }
            else if ( arr[i]>second_largest && arr[i]!=largest){
                second_largest=arr[i];
            }
            
        }
        return second_largest;
    }
    public static void main(String[] args ){
        int arr[] = {7,9,2,8,0};
        System.out.println("Second largest no is : " + findsecondlargest(arr));
    }
    
}
