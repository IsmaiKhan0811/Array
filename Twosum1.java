public class Twosum1 {
    public int[]findtwosum(int arr[], int target){
        int n =arr.length;
        int left=0;
        int right =arr.length-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                return new int[]{left,right};

            }
            else if(sum<target){
                left++;
            }
            else{
                right++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[] ={1,1,3,4,5,6};
        int target = 11;
        Twosum1 obj = new Twosum1();
        int ans[] = obj.findtwosum(arr, target);
       System.out.println(ans[0] + " " + ans[1]);

    }
    
}
