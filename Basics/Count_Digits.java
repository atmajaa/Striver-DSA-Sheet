package Basics;

/**
 * Count_Digits
 */
public class Count_Digits {
    int noOfDigits(int n){
        int temp = n;
        int count = 0;
        while(temp % 10 != 0){
            count++;
            temp = temp/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Count_Digits count_Digits = new Count_Digits();
        System.out.println(count_Digits.noOfDigits(54785));
        
    }
}