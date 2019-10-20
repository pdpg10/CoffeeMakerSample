import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
class MainModule {
    @Provides
    @Singleton
    Heater provideHeater() {
        return new AnotherHeater();
    }

    @Provides
    @Singleton
    Pump providePump(Heater heater) {
        return new PumpImpl(heater);
    }

    //google dagger graph
}
