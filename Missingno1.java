public class Missingno1 {
    public static int findmissing(int arr[], int n){
        int hash[] = new int[n+1];
        for(int i=0; i<arr.length;i++){
            hash[arr[i]]++;
        }
        for(int i =1; i<=n; i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;


    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,5,6};
        int n = 8;
        System.out.println(findmissing(arr, n));
    }
    
}
