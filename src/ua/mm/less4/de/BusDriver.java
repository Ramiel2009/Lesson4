package ua.mm.less4.de;

/**
 * Created by Maxim on 29.07.2015.
 */
public class BusDriver extends DriverDecorator{

    public BusDriver (Driver driver){
        super(driver);
    }
    public void dodo(){
        driver.dodo();
        addedBehaviorOne();
    }
    public void addedBehaviorOne(){
        System.out.println("I'm a Bus Driver");
    }
}
