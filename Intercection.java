
import java.util.*;

public class Intercection { // Intersection of two sortd arrays
    public List<Integer> intersection(int arr1[] , int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        boolean visited[] = new boolean[m];
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                if(arr1[i]==arr2[j] && visited[j] == false){
                    ans.add(arr1[i]);
                    visited[j] = true;
                    break;

                }

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr1[] = { 1,2,3,4,4,4};
        int arr2[] = { 2,3,4,5,6,6};
        Intercection obj = new Intercection();
        List<Integer> result = obj.intersection(arr1, arr2);
        for(int val : result){
            System.out.println(val);
        }
    }
    
}
