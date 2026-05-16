public class Twosum {
    public String twosumexists(int arr[], int target){
        int n = arr.length;
        for(int i =0; i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return "Yes";
                }
                
            }
        }
        return "No";
    }
    public int[] twosumexists2(int arr[], int target){
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j=i+1; j<n;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};

                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,2,5};
        int target = 7;
        Twosum obj = new Twosum();
        System.out.println(obj.twosumexists(arr, target));
        int ans[] = obj.twosumexists2(arr, target);
         System.out.println(ans[0] + " " + ans[1]);
    }
    
}   
