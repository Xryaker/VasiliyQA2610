package configuration;

public class BaseClass {
    static public Object driver;

    static void create(){
        driver=DriverConfig.createDriver(BROWSERS.CHROMEHEADLEESMODE);


    }
    static void close(){

    }
}
