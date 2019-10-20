import dagger.Binds;
import dagger.Module;

@Module
interface  PumpModule {
    @Binds
     Pump providePump(PumpImpl pump);
}
