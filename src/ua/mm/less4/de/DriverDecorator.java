package ua.mm.less4.de;

/**
 * Created by Maxim on 29.07.2015.
 */
public abstract class DriverDecorator extends Driver {
    protected Driver driver;

    public DriverDecorator(Driver driver){
        this.driver=driver;
    }
    public void dodo(){
        driver.dodo();
    }
}
