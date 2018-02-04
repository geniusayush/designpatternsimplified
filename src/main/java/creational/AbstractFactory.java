package creational;

public class AbstractFactory {
    /*
    this class is for factory of factories ie we have a group of factroeries that we want tp use together

    * */
    public static void main(String[] args) {
        WoodenDoorFixer wdf = new WoodenDoorFixer();
    wdf.factory.getDoor(2,2);
    wdf.workerFactory.getWorder();
    }
}

abstract class  totaFactory {
    DoorFactory factory;
    Workerfactory workerFactory;

}
 class WoodenDoorFixer extends totaFactory{
     public WoodenDoorFixer() {
         factory=new WoodenDoorFactory();
         workerFactory=new CarpenterFactory();
     }

 }



