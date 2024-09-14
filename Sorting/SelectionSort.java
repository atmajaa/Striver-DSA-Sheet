package Sorting;
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {32,15,20,10,4};
        //Before
        System.out.println("Before sorting");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i=0; i<=arr.length-1; i++){
            int min = arr[i];
            int minPosition = i;
            for(int j=i; j<=arr.length-1; j++){
                if(min>arr[j]){
                    min = arr[j];
                    minPosition = j;
                }
            }
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
            //System.out.println(arr[i]);
        }
        //After
        System.out.println();
        System.out.println("------------------");
        System.out.println("After sorting");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
