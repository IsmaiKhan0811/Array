
import java.util.ArrayList;

public class Rearrangearr1 {
    public int[] rearrangearray(int A[], int n){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i =0; i<n; i++){
            if(A[i]>0){
                pos.add(A[i]);
            }
            else{
                neg.add(A[i]);
            }
        }
        int index =0;
        int i =0;
        while(i<pos.size() && i<neg.size()){
            A[index++] = pos.get(i);
            A[index++] = neg.get(i);
            i++;
        }
        while(i<pos.size()){
            A[index++]=pos.get(i);
            i++;
        }
         while(i<neg.size()){
            A[index++]=neg.get(i);
            i++;
        }
        return A;

    }
    public static void main(String[] args) {
        int A[] = { 1,2,-1,3,3,-2};
        int n = A.length;
        Rearrangearr1 obj = new Rearrangearr1();
        int ans[] = obj.rearrangearray(A, n);
        for(int nums: ans){
            System.out.print(nums + " ");
        }
    }
    
}
