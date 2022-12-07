package lesson9;

import java.util.*;

public class lesson91 {
    public static void main(String[] args) {
        System.out.println("Allow "+someMethodJson(lesson9.json).contains("\"Вона\""));


        String str="Cal ifor niannn Cal";

        Set<String> stlist=new HashSet<>(Arrays.stream(str.split(" ")).toList());
        for (String s:stlist){
            System.out.println(s.replace("i", ""));
        }
        System.out.println(stlist);
        StringBuilder builder=new StringBuilder();
        builder.append("shjsdjss");


List<String> lis=new ArrayList<>(Arrays.stream(str.split("a")).toList());








        System.out.println(lis);


        String str1="Dream team";
        String str2="dream team";
        String st="dream";
//        System.out.println(str1.contains(st));
//        System.out.println(str1.toLowerCase().contains(st.toLowerCase()));
//        System.out.println(str1.equalsIgnoreCase(str2));

        String newStr;


     //   System.out.println(listss);

        newStr=str.substring(str.indexOf('a'),3).toUpperCase();
        System.out.println(newStr);
    }
    static private List<String> someMethodJson(String str){
        List<String> temp=new ArrayList<>();
        List<String> listss=new ArrayList<>(List.of(str.split(",\\{")));
        for(String s:listss){
            String[] massstr=s.replace("}","").split(",\"");
            temp.add(massstr[1].replace("txt\":",""));

        }
        return temp;
    }
}
