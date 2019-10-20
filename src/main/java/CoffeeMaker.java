import dagger.Lazy;

import javax.inject.Inject;

public class CoffeeMaker {
    private final Lazy<Heater> heater;
    private final Pump pump;

    @Inject
    public CoffeeMaker(Lazy<Heater> heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    void brew() {
        heater.get().on();
        pump.pump();
        System.out.print("coffee is done");
        heater.get().off();
    }
}
