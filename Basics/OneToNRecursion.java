package Basics;

public class OneToNRecursion {
    void print(int N){
        if(N == 0){
            return;
        }
        print(N-1);
        System.out.println(N);
    }
    public static void main(String[] args) {
        OneToNRecursion oneToNRecursion = new OneToNRecursion();
        oneToNRecursion.print(5);
    }
}
