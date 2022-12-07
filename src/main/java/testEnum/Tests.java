package testEnum;

import lesson7.BigDog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests extends BaseClass{
    static {
        init();
    }
    public static void main(String[] args) {
//        String[] mass=new String[5];
//
////        driveR.get("ggg");
//        Object o=new Object();
//        BigDog dog=new BigDog("sss");
//        BigDog do1=new BigDog("sss");
//        System.out.println(do1.equals(dog));
//        System.out.println(dog);
        List<String> list=new ArrayList<>();
        list.add("Vasiliy");
        list.add("Ivan");
        list.add("Nikita");
        System.out.println(list.get(2));
        list.add("Igor");
        System.out.println(list.size());
        System.out.println(list.contains("Vasiliy"));
        list.remove("Vasiliy");
        System.out.println(list.contains("Vasiliy"));
        System.out.println(list.get(0));
        list.set(0,"Lena");
        System.out.println(list.get(0));
        System.out.println("=======");
        for(String l:list){

            if(l.equals("Nikita"))
                break;
            System.out.println(l);
        }
        System.out.println(list);
        ArrayList<DriveR> list1 =new ArrayList();
        list1.add(new FirefoxDRIVER());
        list1.add(new ChromeDRIVER());
        list1.add(new Adge());


    }

}
