package Basics;

public class Patterns {
    /*
     *****
     *****
     *****
     *****
     *****  */
    void printPattern(){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void printPattern1(){
        for(int i=0; i<=5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void printPattern2(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void printPattern3(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    void printPattern4(){
       for(int i=5; i>0; i--){
        for(int j=i-1; j>0; j--){
            System.out.print(" ");
        }
        int numOfStars = 11-2*i;
        for(int j=1; j<=numOfStars; j++){
            System.out.print("* ");
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
        Patterns p1 = new Patterns();
        p1.printPattern();
        System.out.println("-------------------------");
        p1.printPattern1();
        System.out.println("-------------------------");
        p1.printPattern2();
        System.out.println("-------------------------");
        p1.printPattern3();
        System.out.println("-------------------------");
        p1.printPattern4();
    }
}
