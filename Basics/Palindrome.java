package Basics;

public class Palindrome {
    public boolean isPalindrome(int x) {
        boolean isPalindrome = false;
        int reverse = 0;
        int temp = x;
        if(x<0){
            return isPalindrome;
        }
        while(temp!=0){
            //initialize each time
            int lastDigit = temp%10;
            reverse = reverse * 10 + lastDigit;
            temp = temp/10;
        }
        if(reverse == x){
            isPalindrome = true;
        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(1001));
    }
}
