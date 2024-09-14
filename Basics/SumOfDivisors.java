package Basics;

public class SumOfDivisors {
    static long sumOfDivisors(int N){
        // code here
        long sum = 0;
        for(int i=1; i<=N; i++){
           sum+=(N/i)*i;
        }
        return sum;
    }
    public static void main(String[] args) {
        sumOfDivisors(4);
    }
}
