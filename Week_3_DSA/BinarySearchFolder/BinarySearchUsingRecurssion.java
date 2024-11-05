import java.util.Scanner;

public class BinarySearchUsingRecurssion{

    public int initBinarySearch(int target, int[] arr, int left, int right){
        
        // check for invalid right-left index
        if(right< left){
            return -1;
        }
        
        // formula 
        int mid = left + (right - left) / 2;

        // check if target is present at mid

        if(arr[mid] == target){
            return mid; //target found at mid
        }
        
        // if target is smaller then mid
        if(target < arr[mid]){
            return initBinarySearch(target,arr,left,mid-1);
        }

        // if target is greater then mid
        return initBinarySearch(target, arr, mid + 1,right);
    }


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[] userInputArr = new int[5];
        
        for(int i  =0; i < 5; i++){
            System.out.println("Enter Element for index "+i+" ");
            userInputArr[i] = userInput.nextInt();
        }

        System.out.print("\nEnter target: ");
        int userTarget = userInput.nextInt();

        BinarySearchUsingRecurssion bs = new BinarySearchUsingRecurssion();

        int result = bs.initBinarySearch(userTarget, userInputArr,0, userInputArr.length-1);
        if(result != -1){
            System.out.println("Index Found at "+result);
        }else{
            System.out.println("Invalid Index");
        }


    }
}