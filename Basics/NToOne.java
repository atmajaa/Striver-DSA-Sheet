package Basics;

public class NToOne {
    void print(int N){
        if(N == 0){
            return;
        }
        System.out.println(N);
        print(N-1);
    }
    public static void main(String[] args) {
        
        NToOne NToOne = new NToOne();
        NToOne.print(5);
    }
}
