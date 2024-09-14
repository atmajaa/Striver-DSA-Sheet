package Sorting;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,7,9,5,3};
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] >key){
                //swap
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
