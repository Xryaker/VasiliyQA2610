package lesson9;

import java.util.Locale;

public class lesson92 {
    public static void main(String[] args) {
        text( "масл,jbjgcjgyf");
    }
    private static void text(String str){
        System.out.println(str.substring(0, str.length() - 1) + str.substring(str.length() - 1).toUpperCase());
    }

}
