package iterator;

public class Waitress {

	private Menu dinerMenu;
	private Menu pancakeMenu;
	
	public Waitress(Menu dinerMenu, Menu pancakeMenu) {
		this.dinerMenu = dinerMenu;
		this.pancakeMenu = pancakeMenu;
	}
	
	public void printMenu() {
		Iterator dinerIterator = dinerMenu.createIterator();
		Iterator pancakeIterator = pancakeMenu.createIterator();
		System.out.println("Menu\n-------\nBreakfast");
		print(dinerIterator);
		System.out.println("\nLaunch");
		print(pancakeIterator);
	}
	
	private void print(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print(menuItem.getName() + ",");
			System.out.print(menuItem.getPrice() + "--");
			System.out.println(menuItem.getDescription());
		}
	}
	
}
