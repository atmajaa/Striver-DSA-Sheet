package Arrays;

public class moveZerosToEnd {
    void moveZeros(){
        int[] arr = {1,0,1,0,0,1,1,1};
        int temp = 0, count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                //Swap
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        moveZerosToEnd mv = new moveZerosToEnd();
        mv.moveZeros();
    }
}
