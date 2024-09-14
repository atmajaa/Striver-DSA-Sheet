package Arrays;
import java.util.*;
public class findUnion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {4,2,5,8,7,9};
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr){
            set.add(num);
        }
        for(int num: arr2){
            set.add(num);
        }
        System.out.println(set);
    }
}
