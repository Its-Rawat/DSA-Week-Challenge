A **LinkedList** in Java is a data structure that consists of a sequence of nodes, where each node contains two parts:

1. **Data**: The value stored in the node.
2. **Reference**: A pointer to the next node in the sequence (and possibly the previous node, in the case of a doubly-linked list).

The LinkedList provides dynamic memory allocation, making it useful for scenarios where the size of the data structure may change frequently during runtime.

### Types of Linked Lists:

1. **Singly Linked List**:  
    Each node contains data and a reference to the next node.
    
    rust
    
    Copy code
    
    `Node1 -> Node2 -> Node3 -> null`
    
2. **Doubly Linked List**:  
    Each node contains data, a reference to the next node, and a reference to the previous node.
    
    rust
    
    Copy code
    
    `null <- Node1 <-> Node2 <-> Node3 -> null`
    
3. **Circular Linked List**:  
    Similar to a singly or doubly linked list but the last node points back to the first node, forming a circle.
4. **Doubly Circular Linked List**
		Combine Circular + Doubly Linked List.


## Why we need LinkedList when we have Arrays.
> We need a **LinkedList** when we require a data structure that offers efficient insertion and deletion of elements, especially in dynamic scenarios where the size of the data changes frequently. Unlike arrays, which have a fixed size or require resizing, LinkedLists are more flexible in such situations.



 