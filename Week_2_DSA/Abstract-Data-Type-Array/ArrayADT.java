public class ArrayADT{
    // current index of Array
    private int arrayIndex;
    // array length
    private int arrayLength;
    // array
    private int[] array;

// constructor for init array fields
    public ArrayADT(int arrayLength) {
        this.arrayLength = arrayLength;
        this.arrayIndex = 0;
        this.array = new int[arrayLength];
    }

// insert
    public void insert(int valueToInsert){
        if(arrayIndex == this.arrayLength){
            System.out.println("Array is Full: ");
            return;
        }
        array[arrayIndex] = valueToInsert;
        arrayIndex++;
    }

// delete

    public void delete(int index){
        if(arrayIndex > arrayLength || arrayIndex < 0){
            System.out.println("Index Out of Bounds");
            return;
        }
        array[arrayIndex] = 0;
    }

    

}