package ua.mm.less4.de;

/**
 * Created by Maxim on 29.07.2015.
 */
public class CarDriverAndAgent extends DriverDecorator {
    public CarDriverAndAgent (Driver driver){
        super(driver);
    }
    public void dodo(){
        driver.dodo();
        addedBehaviorTwo();
    }
    public void addedBehaviorTwo(){
        System.out.println("I'm a Car Driver and an Agent");
    }
}
