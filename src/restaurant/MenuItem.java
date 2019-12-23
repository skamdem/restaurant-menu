package restaurant;

import java.util.Objects;

enum Category{
    APPETIZER, MAIN_COURSE, DESSERT;
}

enum Status{
    NEW, OLD;
}
public class MenuItem {
    private double price;
    private String description ;
    private Category category;
    private Status status;

    MenuItem(double price, String description, Category category){
        this.price = price;
        this.description = description;
        this.category = category;
        this.status = Status.NEW;
    }

    //Setters
    public void setPrice(double aPrice){
        this.price = aPrice;
    }
    public void setDescription(String aDescription){
        this.description = aDescription;
    }
    public void setCategory(Category aCategory){
        this.category = aCategory;
    }
    public void setStatus(Status aStatus){
        this.status = aStatus;
    }

    //Getters
    public double getPrice(){
        return this.price;
    }
    public String getDescription(){
        return this.description;
    }
    public  Category getCategory(){
        return this.category;
    }

    //2. tell if a menu item is new
    public Status getStatus(){
        return this.status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return getDescription().equals(menuItem.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription());
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", status=" + status +
                '}';
    }
}
