package Strings;

public class LargestOdd {
    public String largestOddNumber(String num) {
        int index = -1;
        for(int i=num.length()-1; i>=0; i--){
            int current_num = num.charAt(i) - '0';
            if(current_num % 2 != 0){
                index = i;
                break;
            }
        }
        String max_odd = "";
        if(index == -1){
            return max_odd;
        }
        for(int i=0; i<=index; i++){
            max_odd += num.charAt(i);
        }
        return max_odd;
    }
}
