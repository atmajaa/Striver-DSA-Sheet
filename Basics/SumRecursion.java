package Basics;

public class SumRecursion {
    int sum(int N){
        if(N == 0){
            return 0;
        }
        return N + sum(N-1);
    }
    public static void main(String[] args) {
        SumRecursion sumRecursion = new SumRecursion();
        System.out.println(sumRecursion.sum(10));
        
    }
}
