package Stack;

public interface StackADT<T> extends Iterable<T> {
	void push(T element);

	T pop();

	T top();

	int size();

	boolean isEmpty();
}
