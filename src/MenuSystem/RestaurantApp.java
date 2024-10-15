package MenuSystem;

public class RestaurantApp {
    public static void main(String[] args) {
        MenuComponent pasta = new MenuItem("Pasta", "Spaghetti with Sauce", 300);
        MenuComponent pizza = new MenuItem("Pizza", "Margherita pizza", 1650);
        MenuComponent coffee = new MenuItem("Coffee", "Black coffee", 980);
        MenuComponent dessert = new MenuItem("Cake", "Chocolate cake slice", 1100);

        MenuComponent lunchMenu = new Menu("Lunch Menu", "Lunch items");
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Dinner items");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Sweet items");

        lunchMenu.add(pasta);
        lunchMenu.add(pizza);

        dinnerMenu.add(pasta);
        dinnerMenu.add(pizza);

        dessertMenu.add(dessert);
        lunchMenu.add(dessertMenu);
        dinnerMenu.add(dessertMenu);

        MenuComponent allMenus = new Menu("All Menus", "All available menus");
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);

        allMenus.print();
    }
}
