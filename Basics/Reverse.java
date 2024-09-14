package Basics;

/**
 * Reverse
 */
public class Reverse {

    int reverseNumber(int n){
        int reverse = 0;
        int lastDigit = 0;
        int temp = n;
        while(temp%10 != 0){
            lastDigit = temp%10;
            reverse = reverse*10 + lastDigit;
            temp = temp/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverseNumber(147));
        
    }
}