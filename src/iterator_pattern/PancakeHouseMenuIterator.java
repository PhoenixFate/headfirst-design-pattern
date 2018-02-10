package iterator_pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator<Object>{
	ArrayList<MenuItem> menuItems;
	int position;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems){
		this.menuItems=menuItems;
	}
	
	@Override
	public boolean hasNext() {
		if(position>=menuItems.size()){
			return false;
		}else{
			return true;
		}
		
	}

	@Override
	public Object next() {
		MenuItem menuItem=menuItems.get(position);
		position++;
		return menuItem;
	}

}
