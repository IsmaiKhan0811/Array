public class Rotatebykoptimal { // Optimal Approach
    public static void reverse(int arr[], int start, int end ){
        while(start<end){ // Method for reversing the array
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }}
        public int[] rotateArray(int arr[], int k, String direction){
            int n=arr.length;
            if(n==0||k==0) return arr;
            k=k%n;
            if(direction.equals("right")){//Rotation is to the right
                reverse(arr,0,n-1);
                reverse(arr,0,k-1);
                reverse(arr,k,n-1);
            }
            else if(direction.equals("left")){//Rptation is to the left
                reverse(arr,0,k-1);
                reverse(arr,k,n-1);
                reverse(arr, 0, n-1);
            }
            return arr;

        }
    
    public static void main(String[] args ){
        Rotatebykoptimal obj = new Rotatebykoptimal();
        int arr[] ={1,2,3,4,5,6,7};
        int k=2;
        String direction ="right";
       
        int result[] = obj.rotateArray(arr,k,direction);
         for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
}
