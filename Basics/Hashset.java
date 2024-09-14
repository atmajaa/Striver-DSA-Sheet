package Basics;
import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("Fish");
        h.add("Soup");
        h.add("Spring Onion bread");
        System.out.println(h);
        //Returns true or falseh
        System.out.println(h.contains("orange"));
        Iterator<String> i = h.iterator();
        while(i.hasNext()){
            System.out.println(i.next() + " ");
        }

    }
}
