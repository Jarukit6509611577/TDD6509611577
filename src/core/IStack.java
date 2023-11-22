package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	void push(Integer elm);
	boolean isFull();
	Integer top();
	Integer pop();
}
