package SmartHomeSystem;

public class SmartHomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        SecuritySystem securitySystem = new SecuritySystem();
        EntertainmentSystem entertainmentSystem = new EntertainmentSystem();

        SmartHomeFacade smartHome = new SmartHomeFacade(light, thermostat, securitySystem, entertainmentSystem);

        smartHome.arriveHome();
        smartHome.movieMode();
        smartHome.nightMode();
        smartHome.leaveHome();
    }
}
