package testEnum;

public class DriverConfig {
   private static DriveR driver;
    public static DriveR createDriver(Browsers browser){

        if(driver == null) {
            switch (browser) {
                case FIREFOX -> createFireFox();
                case CHROME -> createChrome();
                case AGDE -> createAdge();
            }
        }
        return driver;
    }

    private static void createAdge() {
        driver=new Adge();
    }

    private static void createChrome() {
        driver=new ChromeDRIVER();
    }

    private static void createFireFox() {
        driver=new FirefoxDRIVER();
    }
}
