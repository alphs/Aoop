package Oop_a1.nococ;

import java.util.Arrays;

public class Assignment1_12 {

    public interface Filter{
        boolean accept(String x);
    }

    public static String[] filter(String[] a, Filter f){
     String[] temp = new String[a.length];
        int n = -1;
        for (String s : a) {                                 //go through given String[]
            if (f.accept(s)) {                               // and add elements to temp[] according
                temp[++n] = s;                               // to Filter f specification
            }
        }
        String[] result = new String[n+1];                      //
        n = -1;                                                 // Remove null spaces
        for (String s : temp) if (s != null) result[++n] = s;   //
        return result;
    }

    public static void main(String[] args){
        String[] aTest = {"aaaa", "bb", "c", "ddd"};
         //Filter f = x -> { return x.length() <= 3;};

       String[] result = filter(aTest, (x -> x.length() <= 3)); //filter(aTest, f);
        System.out.println(Arrays.toString(result));

    }
}