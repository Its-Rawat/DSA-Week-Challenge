
// This Program is Dependent on input Size
        // So this is O(1) + O(n) => O(n)

class Exmaple2_{

    static int sumArray(int[] arr){
        int sum = 0;                            // O(1) 
        for(int i = 0; i< arr.length; i++){     // O(n)
            sum += arr[i];
        }    
        return sum;
    } 

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(sumArray(array));
    }
}