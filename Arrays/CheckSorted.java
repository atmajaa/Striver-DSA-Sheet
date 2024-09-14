package Arrays;

public class CheckSorted {
    public static void main(String[] args) {
        int arr[] = {45,46,7,48,49};
        boolean sorted = true;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] > arr[i]){
                System.out.println("The given array is not sorted");
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("The given array is sorted");
        }
    }
}
