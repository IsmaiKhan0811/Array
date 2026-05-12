import java.util.ArrayList;
import java.util.List;

public class practice10 {
    public List<Integer> findunion(int arr1[] , int arr2[], int n, int m){
        List<Integer> union = new ArrayList<>();
        int i=0; int j=0;
        while(i<n  && j<m  ){
            if(arr1[i] < arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                }
                 i++;
            }
            else if (arr2[j]<arr1[i]){
                if(union.isEmpty() || union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
            }
            j++;
        }
        else{
            if(union.isEmpty()|| union.get(union.size()-1) != arr1[i]){
                union.add(arr1[i]);
            }
             i++; j++;
        }
    }
     return union;
}
    public static void main(String[] args) {
        int arr1[] = { 2,2,3,3,3,3,3,4,5,6};
        int arr2[] = {0,0,1,2,3,3,3};
        int n = arr1.length;
        int m = arr2.length;
        practice10 obj = new practice10();
        List<Integer> result = obj.findunion(arr1, arr2, n, m);
        for( int val : result){
            System.out.println(val+ " ");
        }

    }
    
}
