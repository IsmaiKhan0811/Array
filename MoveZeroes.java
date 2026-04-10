public class MoveZeroes {
    public static int[] movezero(int arr[]){

        int temp[] = new int[arr.length];// Initialze temp arr with zero of size arr.length
        int index=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i =0;i<arr.length;i++){
            arr[i]=temp[i];
        }
        return arr;

    }
    public static void main(String[] args ){
        int arr[] = { 1,2,0,5,0,4,6};
        MoveZeroes  obj = new MoveZeroes();
        int res[] = obj.movezero(arr);
        System.out.println(res);
        System.out.println("After storing Array will look like");
        for(int nums: arr){
            System.out.print(nums);
        }
    }
    
}
