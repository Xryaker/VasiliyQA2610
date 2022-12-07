package lesson9;

import lesson7.Animal;
import lesson7.BigDog;
import lesson7.Dog;

import java.util.*;

public class lesson9 {
    static public String json = "{ \n" +
            "\"r030\":36,\"txt\":\"Австралійський долар\",\"rate\":24.6418,\"cc\":\"AUD\",\"exchangedate\":\"07.12.2022\"\n" +
            " }\n" +
            ",{ \n" +
            "\"r030\":124,\"txt\":\"Канадський долар\",\"rate\":26.8482,\"cc\":\"CAD\",\"exchangedate\":\"07.12.2022\"\n" +
            " }\n" +
            ",{ \n" +
            "\"r030\":156,\"txt\":\"Юань Женьміньбі\",\"rate\":5.2318,\"cc\":\"CNY\",\"exchangedate\":\"07.12.2022\"\n" +
            " }\n" +
            ",{ \n" +
            "\"r030\":191,\"txt\":\"Куна\",\"rate\":5.0948,\"cc\":\"HRK\",\"exchangedate\":\"07.12.2022\"\n" +
            " }\n" +
            ",{ \n" +
            "\"r030\":203,\"txt\":\"Чеська крона\",\"rate\":1.5828,\"cc\":\"CZK\",\"exchangedate\":\"07.12.2022\"\n" +
            " }\n" +
            ",{ \n" +
            "\"r030\":208,\"txt\":\"Данська крона\",\"rate\":5.1743,\"cc\":\"DKK\",\"exchangedate\":\"07.12.2022\"\n" +
            " }\n" +
            ",{ \n" +
            "\"r030\":344,\"txt\":\"Гонконгівський долар\",\"rate\":4.7009,\"cc\":\"HKD\",\"exchangedate\":\"07.12.2022\"\n" +
            " }\n" +
            ",{ \n" +
            "\"r030\":348,\"txt\":\"Форинт\",\"rate\":0.092727,\"cc\":\"HUF\",\"exchangedate\":\"07.12.2022\"\n" +
            " }";

    public static void main(String[] args) {
        List objects = new ArrayList();
        objects.add(new Dog("Sparky"));
        objects.add("Vasiliy");
        objects.add(true);
        objects.add(new BigDog("Sharik"));


        System.out.println(printSimeText(objects));

        int i = 0;
//        for(Object o:objects){
//            i++;
//            System.out.println(i);
//            if(o instanceof String){
//                System.out.println((String) o);
//            }
//            if(o instanceof BigDog){
//                System.out.println(((BigDog) o).getName());
//            }
//        }
        List<Integer> integers = new ArrayList<>(createNEWArray(20));
//        integers.add(45);
//        integers.add(67);
//        integers.add(67);
//        integers.add(55);

        System.out.println(integers);

        Set<Integer> setList = new HashSet<>(integers);
//        setList.add(55);
//        setList.add(66);
//        setList.add(55);
//        setList.add(88);
        System.out.println(setList);
        Set<Integer> sett = new TreeSet<>(setList);
        System.out.println(sett);
        sett.add(21);
        System.out.println(sett);
//        System.out.println(setList.add(55));
        nameMethod(sett);

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Vasiliy");
        listOfStrings.add("Vasiliy");
        listOfStrings.add("Nikolay");
        listOfStrings.add("Valentina");
        Set<String> setlist = new TreeSet<>(listOfStrings);
        System.out.println(setlist);


    }

    private static void nameMethod(Collection collection) {
        System.out.println("size " + collection.size());
        System.out.println(collection.getClass());
        for (Object c : collection) {
            System.out.println(c);
        }
    }

    private static Collection<Integer> createNEWArray(int k) {
        int[] mas = new int[k];
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(50);
        }
        return Arrays.stream(mas).boxed().toList();
    }

    private static String printSimeText(List list) {
        StringBuilder builder=new StringBuilder();
        for (Object o : list) {
            if (o instanceof Animal) {
                builder.append(((Animal) o).getName()).append(" ");
            }
            if (o instanceof String) {
                System.out.println(o);
            }
        }
        builder.append(" END");
        return builder.toString();
    }


}
