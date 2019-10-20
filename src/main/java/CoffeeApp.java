import dagger.Component;

import javax.inject.Singleton;

class CoffeeApp {

    @Component(modules = {MainModule.class})
    @Singleton
    interface CoffeeShop {
        CoffeeMaker maker();
    }
}
