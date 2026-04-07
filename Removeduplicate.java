public class Removeduplicate {
    public static int removeduplicate(int arr[]){
        int i=0;
        for(int j =1; j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        Removeduplicate obj = new Removeduplicate();
        int k = obj.removeduplicate(arr);
        System.err.print("Unique element are " + k);
        System.err.print("After removing array will look like : ");
        for(int x =0; x<k; x++){
            System.out.print(arr[x] + "");
        }
        
        

    
    }
    
}
