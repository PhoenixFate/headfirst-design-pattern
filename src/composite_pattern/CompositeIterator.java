package composite_pattern;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<Object> {
	Stack<Iterator<?>> stack=new Stack<Iterator<?>>();
	public CompositeIterator(Iterator<?> iterator){
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		if(stack.empty()){
			return false;
		}else{
			Iterator<?> iterator=stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else{
				return true;
			}
		}
	}

	@Override
	public Object next() {
		if(hasNext()){
			Iterator<?> iterator=stack.peek();
			MenuComponent component=(MenuComponent)iterator.next();
			if(component instanceof Menu){
				stack.push(component.createIterator());
			}
		}
		return null;
	}
	
	public void remove(){
		throw new UnsupportedOperationException();
	}
}
