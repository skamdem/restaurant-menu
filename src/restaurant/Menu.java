package restaurant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
public class Menu {
    private ArrayList<MenuItem> itemsInMenu;
    private Date lastUpdated;

    //Create an empty Menu
    Menu (){
        this.itemsInMenu = new ArrayList<>();
        this.lastUpdated = Calendar.getInstance().getTime();;
    }

    //Create a Menu with one Item
    Menu (MenuItem item){
        this();
        this.addMenuItem(item);
    }

    public void addMenuItem(MenuItem item){
        this.itemsInMenu.add(item);
    }

    //Getters
    public Date getLastUpdated(){
        return this.lastUpdated;
    }

    //Setters
    public void setLastUpdated(Date currentDate){
        this.lastUpdated = currentDate;
    }

}
