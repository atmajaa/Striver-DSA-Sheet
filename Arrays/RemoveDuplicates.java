package Arrays;

import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,2,3,3};
        Set <Integer> removeDups = new HashSet<Integer>();
        for(int i=0; i<arr.length; i++){
            removeDups.add(arr[i]);
        }
        Integer[] newArr = removeDups.toArray(new Integer[arr.length]);
        for(int i=0; i< newArr.length; i++){
            System.out.println(newArr[i]);
        }
    }
}
