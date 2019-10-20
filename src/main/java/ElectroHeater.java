public class ElectroHeater implements Heater {
    private boolean isHot = false;

    @Override
    public void on() {
        isHot = true;
        System.out.println("heater on");
    }

    @Override
    public void off() {
        isHot = false;
        System.out.println("heater off");
    }

    @Override
    public boolean isHot() {
        return isHot;
    }
}
