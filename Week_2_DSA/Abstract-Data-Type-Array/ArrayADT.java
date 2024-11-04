public class ArrayADT{
    // current index of Array
    private int arrayIndex;
    // array total length
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
        array[this.arrayIndex] = valueToInsert;
        arrayIndex++;
    }

// delete

    public void delete(int index){
        if(index > arrayLength || index < 0){
            System.out.println("Index Out of Bounds");
            return;
        }
        for(int i = index; i < arrayLength - 1; i++){
            array[i] = array[i + 1];
        }
        arrayLength--;
        
    }


// Search and return the index
    public int search(int ele){
        int eleIndexFlag = -1;
        for(int i = 0; i < arrayLength; i++){
            if(array[i] == ele){
                eleIndexFlag = i;
            }
        }
        if(eleIndexFlag == -1){
            System.out.println("Element not found");
            return -1;
        }
        return eleIndexFlag;
    }
    

    // get

    public int get(int index){
        int eleGet = -1;

        for(int i =0; i<array.length; i++){
            if(index >= array.length || index < 0){
                System.out.println("Index is Invalid");
                return -1;
            }else{
                eleGet = array[index];
            }            
        }
        return eleGet;
    }

    public void getAll(){
        System.out.println("\n");
        for(int i = 0; i < this.arrayLength; i++){
            System.out.print(array[i]+" ");
        }
    }

    public void update(int index, int val){
        for(int i = 0; i < arrayLength; i++){
            if(index < 0 || index > arrayLength){
                System.out.println("Invalid Index");
                return;
            }
            else if(index == i){
                array[index] = val;
            }
        }
    }

    

}