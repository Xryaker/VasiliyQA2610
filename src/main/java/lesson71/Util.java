package lesson71;

public class Util {
    public static int print(Country country){
        int result=0;
      switch (country){
          case UKRAINE :
              result=15;
              System.out.println(country.getValuta());
              break;
          case CHINA:
              result=10;
              break;
          case USA:
              result=8;
              break;
          case GB:
              result=2;
              break;
          case FRANCE:
              result=20;
              break;

      }
      return result;
    }
}
