package Arrays;

public class leftRotate {
    void rotateLeft(int[] arr){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        leftRotate lr = new leftRotate();
        int[] arr = {1,4,5,6,8};
        lr.rotateLeft(arr);
    }
}
