package lesson7;

public interface Pet {
  public final static int type=10;
   default int  getNumber(int p){
      return type*p;
   }
   String  feed();
   void play();
   void walk();
}
