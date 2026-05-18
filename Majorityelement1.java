public class Majorityelement1 { // Moore's Voting algo
    public static int findmajority(int arr[]){
        int n = arr.length;
        int count=0;
        int element = 0;
        
        for(int i =0; i<n; i++){
            
            if(count==0){
                element = arr[i];
        
                count =1;

            }else if(arr[i]==element){// If match increase count
                count++;
            }
            else{
                count--;// Decrease count               
            }

        }
        return element;
        
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,5,1,1,2,2};
        System.out.println(findmajority(arr));

    }
    
}
