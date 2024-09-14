package Arrays;
//Find the second largest element in an array without sorting
public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {15,41,63,52,45};
        int largest = 0;
        int secondLargest = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest element in the array - " + secondLargest);
    }
}
