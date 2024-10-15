package SmartHomeSystem;

public class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(Light light, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem) {
        this.light = light;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void leaveHome() {
        System.out.println("\nLeaving home...");
        light.turnOff();
        thermostat.setTemperature(18);
        securitySystem.arm();
        entertainmentSystem.stopMovie();
    }

    public void arriveHome() {
        System.out.println("\nArriving home...");
        light.turnOn();
        thermostat.setTemperature(22);
        securitySystem.disarm();
    }

    public void nightMode() {
        System.out.println("\nActivating night mode...");
        light.turnOff();
        thermostat.setTemperature(16);
        securitySystem.arm();
    }

    public void movieMode() {
        System.out.println("\nActivating movie mode...");
        light.turnOff();
        thermostat.setTemperature(21);
        entertainmentSystem.playMovie("Inception");
    }
}
