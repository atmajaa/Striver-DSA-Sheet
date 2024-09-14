package Arrays;
import java.util.*;
public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {78,45,74,85,54};
        Arrays.sort(arr);
        System.out.println("Largest Element in the array is - "+ arr[arr.length-1]);
    }
}
