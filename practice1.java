public class practice1 {
    public static int secondlargest(int arr[]){
        if(arr==null||arr.length==0){
            System.out.println("Not possible");
        }
        int largest = Integer.MIN_VALUE;
        int second_largest= Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }
            else if (arr[i]>second_largest && arr[i]<largest){
                second_largest =arr[i];


            }
        }
        return second_largest;

    }
    public static void main(String[] args) {
        int arr[]={6,3,9,88,77,34,4};
        int ans = secondlargest(arr);
        System.out.println(ans);
    }
    
}
