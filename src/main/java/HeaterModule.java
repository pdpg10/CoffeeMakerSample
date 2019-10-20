import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module(includes = {PumpModule.class})
class HeaterModule {
    @Provides
    @Singleton
    Heater provideHeater() {
        return new ElectroHeater();
    }
}
