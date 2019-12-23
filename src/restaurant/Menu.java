package restaurant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
public class Menu {
    private ArrayList<MenuItem> itemsInMenu;
    private Date lastUpdateDate;

    //Create an empty Menu
    Menu (){
        this.itemsInMenu = new ArrayList<>();
        this.lastUpdateDate = Calendar.getInstance().getTime();;
    }

    //Create a Menu with one Item
    Menu (MenuItem item){
        this();
        this.addMenuItem(item);
    }

    //1. add menu items.
    public void addMenuItem(MenuItem item){
        //Bonus Mission:
        //If a user tries to add an item that is already on the menu,
        // print a message that warns the user about the duplicate.
        // Also, prevent the duplicate from being added to the menu.
        if (this.itemsInMenu.contains(item)){
            System.out.println("Item won't be added because it is already on the menu");
        } else {
            this.itemsInMenu.add(item);
        }
    }

    //1.remove menu items.
    void removeMenuItem(MenuItem item){
        this.itemsInMenu.remove(item);
    }

    //Getters
    // Tell when the menu was last updated.
    public Date getLastUpdateDate(){
        return this.lastUpdateDate;
    }

    //Setters
    public void setLastUpdateDate(Date currentDate){
        this.lastUpdateDate = currentDate;
    }

    //4. print out a single menu item
    public static void printMenu(MenuItem item){
        System.out.println(item);
    }
    //4. print out the entire menu.
    public void printMenu(){
        for (MenuItem item : this.itemsInMenu){
            printMenu(item);
        }
    }

}
