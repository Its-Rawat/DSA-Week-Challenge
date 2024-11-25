package singly;

public class LinkedList {

    Node head = null;

    // Insert at beginning
    public void insertAtBegninning(String Data) {
        Node newNode = new Node(Data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.Next = head;
        head = newNode;
    }

    // Insert at End
    public void insertAtLast(String Data){
        Node newNode = new Node(Data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.Next != null){
            temp = temp.Next;
        }
        temp.Next = newNode;
    }


    // Insert at n position.

    public void insertAtN(int position, String Data){
        if(position < 0){
            System.out.println("Invalid Position!!");
            return;
        }
        Node newNode = new Node(Data);
        if(position ==  0){
            newNode.Next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        while (position != 1) { 
            position--;
            temp = temp.Next;
        }
        newNode.Next = temp.Next;
        temp.Next = newNode;

    }
    
    // Delete from Beginning
    	public void deleteFromBeginning() {
    		if(head == null) {
    			System.out.println("Linked List is Empty!!");
    			return;
    		}
    		head = head.Next;
    	}
    
    
    // Delete from End
    	
    	public void deleteFromEnd() {
    		if(head == null) {
    			System.out.println("LinkedList is Empty!!");
    			return;
    		}
    		
    		
    		Node ptr1 = head;
    		while(ptr1.Next.Next != null) {
    			ptr1 = ptr1.Next;
    		}
    		ptr1.Next = null;
    		
    	}
    	
    // Delete from N
    	public void deleteFromN(int position) {
    		if(head == null) {
    			System.out.println("Invalid Position");
    			return;
    		}
    		
    		if(position == 0) {
    			head = head.Next;
    			return;
    		}
    		
    		Node temp = head;
    		for(int i = 0; i < position -1 && temp != null; i++) {
    			temp = temp.Next;
    		}
    			if(temp == null || temp.Next ==null) {
    				System.out.println("Position out of Bond");
    				return;
    			}
    		temp.Next = temp.Next.Next;		
    	}
    	
    // Search Element
    
    	public void searchElement(String element) {
    		if(head == null) {
    			System.out.println("LinkedList is Empty!!");
    			return;
    		}
    		if(head.Data == element) {
    			System.out.println("Element Found at Node 1: "+head.Data);
    			return;
    		}
    		Node temp = head;
    		while(temp.Data != element && temp.Next != null) {
    			temp = temp.Next;
    		}
    		if(temp.Data == element) {
    			System.out.println("Element Found at Node 1: "+temp.Data);
    			return;
    		}else {
    			System.out.println("Element Not in The LinkedList!!");
    		}
    	}
    	
    	
    

        public void printData(){
            
            Node temp = head;
            if(head == null){
                System.out.println("LinkedList is Empity!!");
                return;
            }
            while(temp != null){
            	if(temp.Next == null) {
            		System.out.print(temp.Data+" ");	
            	}else {
            		System.out.print(temp.Data+" -> ");
            	}
                
                temp = temp.Next;
            }
        }    
}
