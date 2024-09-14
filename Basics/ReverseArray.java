package Basics;

public class ReverseArray {
    static void reverseArray(int arr[], int start, int end) {
        if(start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1};
        reverseArray(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
}
