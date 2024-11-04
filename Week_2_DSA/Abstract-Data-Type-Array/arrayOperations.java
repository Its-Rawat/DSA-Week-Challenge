public class arrayOperations{
    public static void main(String[] args) {
        ArrayADT arrays  = new ArrayADT(5);
        arrays.insert(1);
        arrays.insert(2);
        arrays.insert(3);
        arrays.insert(4);
        arrays.insert(5);
        // arrays.insert(6); // array will be full


// getAll
        System.out.println("All Elements: ");
        arrays.getAll();
        arrays.delete(0);
        arrays.delete(1);
        arrays.getAll();
        System.out.println("\n"+arrays.get(1));

        // search
        System.out.println("\nElement 5 found at Index: "+arrays.search(5));

        arrays.update(2, 120);
        arrays.getAll();
    }
}
