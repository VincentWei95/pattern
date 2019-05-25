package iterator;

public class DinerMenu implements Menu {

	private static final int MAX_ITEMS = 6;
	
	private MenuItem[] menuItems;
	private int numberOfItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLt", "(Fankin') Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("BLT", "Bacon whth lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
		addItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", false, 3.99);
		addItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", false, 3.89);
		
		System.out.println("diner menu item size " + menuItems.length);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry, menu is full!Can't add item to menu");
		} else {
			menuItems[numberOfItems++] = menuItem;
		}
	}
	
	@Override
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}

}
