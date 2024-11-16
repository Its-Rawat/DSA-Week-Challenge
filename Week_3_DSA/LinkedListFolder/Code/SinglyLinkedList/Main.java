class Main{
    public static void main(String[] args) {
        Node node1 = new Node(12);
        System.out.println("Node1 Data: "+node1.data);
        System.out.println("Node1 Next: "+node1.next);

        Node node2 = new Node(52);    

        node1.next = node2;
        // System.out.println("Node2 Data: "+node2.data);
        System.out.println("Node2 Next: "+node1.next.data);

    }
}