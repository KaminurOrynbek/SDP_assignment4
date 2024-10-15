package Composite;

public class RestaurantApp {
    public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Delicious breakfast items");
        breakfastMenu.add(new MenuItem("Pancakes", "Fluffy pancakes with syrup", 5.99));
        breakfastMenu.add(new MenuItem("Omelettes", "Cheese omelette with toast", 6.99));

        MenuComponent lunchMenu = new Menu("Lunch Menu", "Hearty lunch options");
        lunchMenu.add(new MenuItem("Burger", "Juicy beef burger", 8.99));
        lunchMenu.add(new MenuItem("Salad", "Fresh garden salad", 7.49));

        MenuComponent allMenus = new Menu("All Menus", "All available menus");
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);

        allMenus.print();
    }
}
