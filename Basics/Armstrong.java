package Basics;

public class Armstrong {
    static String armstrongNumber(int n) {
        // code here
        int temp = n;
        int lastDigit = 0;
        int check = 0;
        while(temp!=0){
            lastDigit = temp%10;
            int isArmstrong = lastDigit*lastDigit*lastDigit;
            check+=isArmstrong;
            temp= temp/10;
        }
        if(check == n){
            return "true";
        }
        else{
            return "false";
        }
    }
    public static void main(String[] args) {
        armstrongNumber(458);
    }
}
