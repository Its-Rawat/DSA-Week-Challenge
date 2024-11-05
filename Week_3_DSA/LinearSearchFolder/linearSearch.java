
import java.util.Scanner;

// Linear Search Impl
public class linearSearch{
    public int linearSearchImpl(int array[],int target){
        for(int i  = 0; i <array.length; i++){
            if(array[i] == target){
                System.out.println("Element Found at index: "+i);
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element to Search: ");
        int searchEle = sc.nextInt();
        
       linearSearch searchLinear =  new linearSearch();
       int[] array = {55,2,1,66,64,78,5,3,23,2,2};

        searchLinear.linearSearchImpl(array, searchEle);

    }
}

