package Strings;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String reversed_string = "";
        for(int i=words.length-1; i>=0; i--){
            reversed_string += words[i];
             if (i != 0) {
                reversed_string += " ";
            }
        }
        return reversed_string;
    }
}
