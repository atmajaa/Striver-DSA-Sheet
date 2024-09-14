package Basics;

public class LCMGCD {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long lcmAndGcd[] = new Long[2];
        //GCD using optimized Euclidean method
        //Unoptimized
        Long num1 = A;
        Long num2 = B;
        //while(num1 != num2){
          //  if(num1>num2){
            //    num1 = num1-num2;
              //  lcamAndGcd[1] = num1;
            //}
            //else{
              //  num2 = num2 - num1;
                //lcamAndGcd[1] = num2;
            //}
        //}
        while(B!=0){
            Long temp = B;
            B = A%B;
            A =temp;
        }
        lcmAndGcd[1] = A;
        //LCM 
       //By using formula
       lcmAndGcd[0] = (num1*num2)/lcmAndGcd[1];
       return lcmAndGcd;
    }
    public static void main(String[] args) {
        lcmAndGcd(4L,48L);
    }
}
