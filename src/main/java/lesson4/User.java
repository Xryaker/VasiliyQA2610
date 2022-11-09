package lesson4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class User {
    static int params;
    static {
        Calendar calendar=new GregorianCalendar();
        params=calendar.get(Calendar.YEAR);
    }
    int age;
    String name;
    int birthday;

    public User(String name, int birthday) {
        this.name = name;
        this.birthday = birthday;
        this.age=params-birthday;
    }

}
