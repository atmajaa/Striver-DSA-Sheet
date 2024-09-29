package Arrays;

public class RearrangeBySign {
    void rearrange(int[] arr){
        int[] rearranged_array = new int[arr.length];
        int positive_counter = 0;
        int negative_counter = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 0){
                rearranged_array[positive_counter] = arr[i];
                positive_counter += 2;
            }
            else{
                rearranged_array[negative_counter] = arr[i];
                negative_counter += 2;
            }
        }
        for(int i=0; i<rearranged_array.length; i++){
            System.out.print(rearranged_array[i] + " ");
        }
    }
    public static void main(String[] args) {
        RearrangeBySign rearrangeBySign = new RearrangeBySign();
        int[] arr = {1,-2,-4,30,-9,34,-6,7};
        rearrangeBySign.rearrange(arr);
    }
}
