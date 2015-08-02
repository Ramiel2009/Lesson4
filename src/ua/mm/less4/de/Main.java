package ua.mm.less4.de;

/**
 * Created by Maxim on 29.07.2015.
 */
public class Main {
    public static void main (String args[]){
        Driver carDriver = new CarDriver();
        Main runner = new Main();
        runner.dodoDrive(new BusDriver(carDriver));
        runner.dodoDrive(new CarDriverAndAgent(carDriver));
    }
    public void dodoDrive(Driver driver){
        driver.dodo();
    }
}
