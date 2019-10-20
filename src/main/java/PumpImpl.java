import javax.inject.Inject;

public class PumpImpl implements Pump {
    private final Heater heater;

    @Inject
    public PumpImpl(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater.isHot()) {
            System.out.println("start pumping");
        }
    }
}
