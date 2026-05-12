public class Missingno {
    public static int findmissingno(int arr[] , int n){
        for(int i=1; i<n; i++){
            boolean found = false;
            for(int j =0; j<arr.length; j++){
                if(arr[j]==i){
                    found = true;
                    break;
                }
            }
            if(found==false){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8};
        int n=8;
        int ans = findmissingno(arr, n);
        System.out.println(ans);
    }
    
}
