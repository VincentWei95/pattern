package iterator;

import java.util.List;

public class PancakeMenuIterator implements Iterator {

	private List<MenuItem> menuItems;
	private int position;
	
	public PancakeMenuIterator(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		if (position >= menuItems.size() || menuItems.get(position) == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		return menuItems.get(position++);
	}

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalArgumentException("You can't remove an item until you've done at least one next()");
		}
		menuItems.remove(position);
	}

}
