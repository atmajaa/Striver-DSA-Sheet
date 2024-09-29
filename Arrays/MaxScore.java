package Arrays;

import java.util.List;

public class MaxScore {
     // Function to find pair with maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
       int pairSum = arr.get(0);
       int maxSum = arr.get(0);
        for(int i=1; i<arr.size(); i++){
            pairSum = arr.get(i) + arr.get(i+1);
            maxSum = Math.min(maxSum, pairSum);
        }
        return maxSum;
    }
}
