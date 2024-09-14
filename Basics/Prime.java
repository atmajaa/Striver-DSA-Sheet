package Basics;

public class Prime {
    int count = 2;
    String result = "Is Prime";
    String isPrime(int N){
        if(N == 2 || N == 1){
            result = "Is Prime";
            System.out.println(result);
            return result;
        }
        for(int i=2; i<=Math.sqrt(N); i++){
            if(N%i == 0){
                count++;
                result="Not prime";
                System.out.println(result);
                return result;
            }
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        Prime prime = new Prime();
        prime.isPrime(13);
        
    }
}
