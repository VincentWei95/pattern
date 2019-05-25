package iterator;

public class DinerMenuIterator implements Iterator {
	
	private MenuItem[] menuItems;
	private int position;
	
	public DinerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		if (position >= menuItems.length || menuItems[position] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		return menuItems[position++];
	}

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalArgumentException("You can't remove an item until you've done at least one next()");
		}
		
		if (menuItems[position - 1] != null) {
			for (int i = position - 1; i < (menuItems.length-1); i++) {
				menuItems[i] = menuItems[i+1];
			}
			menuItems[menuItems.length-1] = null;
		}
	}

}
