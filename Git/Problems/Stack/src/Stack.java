
public class Stack {
	int capacity = 3;
	int stack[] = new int[capacity];
	int top = 0;
	
	public void push(int data) {
		if(size() == 3) {
			System.out.println("Sorry..Stack is Full..U can't push the element.."+data);
		}
		else {
			stack[top] = data;
			top++;
		}
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
			System.out.println("Stack element>"+data +" ");
		}
	}
}
