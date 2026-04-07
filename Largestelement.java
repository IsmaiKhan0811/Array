public class Largestelement {
    public static int largest(int arr[]){
        if(arr==null || arr.length==0){
            System.out.println("Not array exist");
        }
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        return max;

    }
    public static void main(String[] args){
        int arr[] = {5,1,2,9,0};
        System.out.println(largest(arr));
    }
    
}
