package restaurant;

import static restaurant.Category.*;

public class Restaurant {

    public static void main(String[] args){
        //a. Create several items and add them to a menu.
        //MenuItem(double price, String description, Category category)
        MenuItem item_1 = new MenuItem(5, "Tropical lemonade", APPETIZER);
        MenuItem item_2 = new MenuItem(9.5, "Alaskan desserts", DESSERT);
        MenuItem item_3 = new MenuItem(18, "Pacific Sea Foods", MAIN_COURSE);

        Menu afternoonDishes = new Menu(item_1);
        afternoonDishes.addMenuItem(item_2);
        afternoonDishes.addMenuItem(item_3);

        System.out.println("Question b.");
        //b. Print the entire, updated menu to the screen.
        afternoonDishes.printMenu();

        System.out.println("\nQuestion c.");
        //c. Print an individual menu item to the screen.
        Menu.printMenu(item_1);

        System.out.println("\nQuestion d.");
        //d. Delete an item from a menu, then reprint the menu;
        afternoonDishes.removeMenuItem(item_3);
        afternoonDishes.addMenuItem(item_1);
        afternoonDishes.printMenu();
    }
}
