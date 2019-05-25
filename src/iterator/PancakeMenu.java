package iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeMenu implements Menu {

	private List<MenuItem> menuItems;
	
	public PancakeMenu() {
		menuItems = new ArrayList<>();
		
		// ��Ӳ˵�
		addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", false, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
		addItem("Blueberry Pancakes", "Pancakes made with fresh buleberries", false, 3.49);
		addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", false, 3.59);
		
		System.out.println("diner menu item size " + menuItems.size());
	}
	
	public void addItem(String name, String description, boolean vegeratian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegeratian, price);
		menuItems.add(menuItem);
	}
	
	public List<MenuItem> getMenuItems() {
		return menuItems;
	}
	
	@Override
	public Iterator createIterator() {
		return new PancakeMenuIterator(menuItems);
	}

}
