package Facade;

public class SmartHomeFacade {
    private Light light;
    private AirConditioner airConditioner;
    private SecuritySystem securitySystem;

    public SmartHomeFacade() {
        light = new Light();
        airConditioner = new AirConditioner();
        securitySystem = new SecuritySystem();
    }

    public void arriveHome() {
        light.turnOn();
        airConditioner.turnOn();
        securitySystem.deactivate();
        System.out.println("Welcome home!");
    }

    public void leaveHome() {
        light.turnOff();
        airConditioner.turnOff();
        securitySystem.activate();
        System.out.println("Goodbye!");
    }

}
