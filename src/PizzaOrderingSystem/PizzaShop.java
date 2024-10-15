package PizzaOrderingSystem;

public class PizzaShop {
    public static void main(String[] args) {
        //Margherita pizza with cheese and mushrooms
        Pizza margherita = new MargheritaPizza();
        Pizza margheritaWithCheese = new CheeseTopping(margherita);
        Pizza margheritaWithCheeseAndMushrooms = new MushroomTopping(margheritaWithCheese);

        System.out.println(margheritaWithCheeseAndMushrooms.getDescription() + " costs " + margheritaWithCheeseAndMushrooms.getCost() + " tenge");

        //meat pizza with also with additional goodies
        Pizza meat = new MeatPizza();
        Pizza meatWithCheese = new CheeseTopping(meat);
        Pizza meatWithCheeseAndMushrooms = new MushroomTopping(meatWithCheese);

        System.out.println(meatWithCheeseAndMushrooms.getDescription() + " costs " + meatWithCheeseAndMushrooms.getCost() + " tenge");
    }
}
