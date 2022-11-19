package test;

public class TEstMainScreen extends AbstractClasTest  {


    @Override
    String getbuttonName(String locator) {
        return null;
    }

    @Override
    String getCurenUrl() {
        return null;
    }

    @Override
    boolean setForm(User user) {
        String name=user.getName();
        return false;
    }


    @Override
    void sclorDown(String locator) {

    }
}
