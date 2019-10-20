public class Main {
    public static void main(String[] args) {
        CoffeeApp.CoffeeShop shop = DaggerCoffeeApp_CoffeeShop.create();
        CoffeeMaker maker = shop.maker();
        maker.brew();
    }
}
