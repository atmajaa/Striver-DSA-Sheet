package Arrays;

public class KadanesAlgorithm {
    int maxSubArray(int arr[]){
        int max_so_far = arr[0];
        int current_max = arr[0];
        for(int i=1; i<arr.length; i++){
            current_max = Math.max(arr[i], current_max+arr[i]);
            max_so_far = Math.max(current_max, max_so_far);

        }
    return max_so_far;
    }
    public static void main(String[] args) {
        KadanesAlgorithm kadanesAlgorithm = new KadanesAlgorithm();
        int arr[] = {-2,3,4,-5,9,-5};
        System.out.println(kadanesAlgorithm.maxSubArray(arr));
    }
}
