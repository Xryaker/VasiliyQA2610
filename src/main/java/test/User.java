package test;

public class User {
   private String name;
   private  String family;
   private String mail;
   private String tel;

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getMail() {
        return mail;
    }

    public String getTel() {
        return tel;
    }

    public User(String name, String family, String mail, String tel) {
        this.name = name;
        this.family = family;
        this.mail = mail;
        this.tel = tel;
    }

    public User() {
        this.name="vasiliy";
        this.family="shevchenko";
        this.mail="vasiok@mail.ri";
        this.tel="74849892";
    }
}
