package core;
import java.util.ArrayList;

public class Stack implements IStack {
	private ArrayList<Integer> s;
	
	public Stack() {
		s = new ArrayList<>(3);
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return s.isEmpty();
	}

	@Override
	public int getSize() {
		return s.size();
	}
	@Override
	public void push(Integer elm) {
		 if(s.size() != 3)s.add(elm);
	}
	public Integer pop() {
		if(isEmpty()) {
			return null;
		}
		return s.remove(s.size()-1);
	}
	@Override
	public Integer top() {
		if(isEmpty()) {
			return null;
		}
		return s.get(s.size()-1);
	}
	@Override
	public boolean isFull() {
		return false;
	}
}
