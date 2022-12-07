package configuration;

public class DriverConfig {
   static Object driver;
   public static Object createDriver(BROWSERS browser){
       switch (browser){
           case FIREFOX -> initFireFox();
           case CHROMEINCOGNITO -> initIncognitoChrome();
           case CHROMEPROXY -> initChromeProxy();
           case CHROMEHEADLEESMODE -> initChromeHeadlesMode();
       }
        return driver;
    }

    private static void initChromeHeadlesMode() {
    }

    private static void initIncognitoChrome() {

    }

    private static void initChromeProxy() {
    }

    private static void initIncognitoFireFox() {
    }

    private static void initFireFox() {
       driver=new Object();
    }
}
