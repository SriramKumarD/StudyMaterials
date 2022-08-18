//This class is using Dynamic Array implemention.
//So it is expandable and Shrinkable
public class DStack {

	int capacity = 3;
	int stack[] = new int[capacity];
	int top = 0;
	
	public void push(int data) {
		if(size() == capacity) {
			expandArray();
		}
			stack[top] = data;
			top++;
   }
	private void expandArray() {
		int length = size();
		int dStack[] = new int[capacity*2];
		System.arraycopy(stack, 0, dStack, 0, length);
		stack = dStack;
		capacity *=2;
	}
	public int pop() {
		int data;
		top--;
		data = stack[top];
		stack[top] = 0;
		return data;
	}
	
	public int peek() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("Sorry...Stack is Empty...U can't perform peek operation..");
		}
		else {
			data = stack[top-1];
		}
		return data;
	}
	public boolean isEmpty() {
		return top <= 0;
	}
	public int size() {
		return top;
	}
	void show() {
		for(int data : stack) {
			System.out.print(data +" ");
		}
		System.out.println();
	}


}
