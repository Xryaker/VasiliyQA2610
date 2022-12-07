package testEnum;

public class FirefoxDRIVER implements DriveR {

    @Override
    public void get(String url) {
        System.out.println("FireFox "+url);
    }

    @Override
    public void close() {

    }

    @Override
    public String getUrl() {
        return null;
    }
    public void fireFoxMethod(){
        System.out.println("FireFox");
    }
}
