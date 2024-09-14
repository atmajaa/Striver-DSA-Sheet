package Basics;

public class PrintRecurssion {
    void print(int N){
        if(N == 0){
            return;
        }
        System.out.println("Hello");
        print(N-1);
    }
    public static void main(String[] args) {
        PrintRecurssion printRecurssion = new PrintRecurssion();
        printRecurssion.print(5);
    }
}
