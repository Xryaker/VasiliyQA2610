package testEnum;

public class BaseClass {
    public static DriveR driveR;

    public static void init(){
        driveR=DriverConfig.createDriver(Browsers.CHROME);
    }

    public static void end(){
        if(driveR!=null){
            driveR.close();
        }
    }
}
