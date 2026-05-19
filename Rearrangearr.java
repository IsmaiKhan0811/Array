import java.util.ArrayList;

public class Rearrangearr {
    public int[] rearrangearray(int A[], int n){
        ArrayList<Integer> pos = new ArrayList<>();
         ArrayList<Integer> neg = new ArrayList<>();
         for(int i=0; i<n; i++){
            if(A[i]>0){
                pos.add(A[i]);
            }
            else{
                neg.add(A[i]);
            }
         }
         for(int i=0; i<n/2;i++){
                A[2*i]=pos.get(i);
                A[2*i+1]=neg.get(i);

            }
        return A;
    }
    public static void main(String[] args) {
        int A[] = {1,-1,2,-3,-2,9};
        int n =A.length;
        Rearrangearr obj = new Rearrangearr();
        int ans[] = obj.rearrangearray(A, n);
        for(int nums : ans){
            System.out.print(nums+ " ");
        }
    }
    
    
}
