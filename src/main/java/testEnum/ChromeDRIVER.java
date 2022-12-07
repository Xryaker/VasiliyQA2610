package testEnum;

public class ChromeDRIVER implements DriveR{
    @Override
    public void get(String url) {
        System.out.println("Chrome "+url);
    }

    @Override
    public void close() {

    }

    @Override
    public String getUrl() {
        return null;
    }

    public void SomeChromeMethod(){
        System.out.println("Chrome");
    }
}
