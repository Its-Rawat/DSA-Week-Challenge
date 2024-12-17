package mainPackage;

import impl.StackImpl;

public class InitMain {

	public static void main(String[] args) {
		StackImpl stackImpl = new StackImpl(5); // Creating the stack of size 4
		
		stackImpl.push(0);
		stackImpl.push(1);
		stackImpl.push(2);
		stackImpl.push(3);
		stackImpl.push(4); // extra element will give stack full message.
		stackImpl.display();
		stackImpl.pop();
		stackImpl.display();
		System.out.println("Peeking on Stack: "+stackImpl.peek());

	}

}
