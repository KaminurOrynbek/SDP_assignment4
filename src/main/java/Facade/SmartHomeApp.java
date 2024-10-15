package Facade;

public class SmartHomeApp {
    public static void main(String[] args) {
        SmartHomeFacade smartHome = new SmartHomeFacade();
        smartHome.leaveHome();
        System.out.println("----------------------");
        smartHome.arriveHome();
    }
}
