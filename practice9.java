import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class practice9 {
    public List<Integer> findunion(int arr1[], int arr2[]){
        Set<Integer> st = new TreeSet<>();
        for(int num : arr1){
            st.add(num);
        }
        for(int num : arr2){
            st.add(num);
        }
        return new ArrayList<>(st);

    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7};
        int arr2[] = {1,3,5,7,9};
         practice9 obj =new practice9();
         List<Integer> result = obj.findunion(arr1, arr2);
         for(int val : result){
            System.out.print(val+" ");
         }
        
    }
    
}
