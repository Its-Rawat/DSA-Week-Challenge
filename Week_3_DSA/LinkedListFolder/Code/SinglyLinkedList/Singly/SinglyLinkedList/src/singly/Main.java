package singly;

public class Main {
	public static void main(String[] args) {
		LinkedList linklist = new LinkedList();
		
		linklist.insertAtBegninning("Ronit");
		linklist.insertAtBegninning("Deewanshi");
		linklist.insertAtBegninning("Aayush");
		linklist.insertAtBegninning("Isha");
		
//		linklist.insertAtLast("Tingu");
		
//		linklist.insertAtN(5, "Nigga");
		
//		linklist.deleteFromBeginning();
		
//		linklist.deleteFromEnd();
		
//		linklist.deleteFromN(1);
		
		linklist.searchElement("Aayush");
		
		linklist.printData();
	}
}
