package impl;

public class StackImpl implements Stack{
	
	private int[] array;
	private int maxSize;
	private int top = 0;

	public StackImpl(int size) {
		this.maxSize = size;
		array = new int[maxSize];
		top = -1; 
	}

	
	// Push Operation
	@Override
	public void push(int element) {
		if(maxSize -1 == top) {
			System.out.println("Stack is Full");
			return;
		}else {
			top++;
			array[top] = element;
		}
	}
	
	@Override
	public void pop() {
		if(top == -1) {
			System.out.println("Stack is Empty");
			return;
		}else {
			top--;
		}
		
	}
	
	@Override
	public int peek() {
		if(top == -1) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return array[top];
	}


	@Override
	public void display() {
		if(top == -1) {
			System.out.println("Stack is Empty!!");
		}else {
			for(int i = 0; i <= top; i++) {
				System.out.print(array[i]+"\t");
			}System.out.println("");
		}
		
	}

}
