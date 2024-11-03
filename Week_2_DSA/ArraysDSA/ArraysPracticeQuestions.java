class ArraysPracticeQuestions{
    public static void main(String[] args) {
       
       
       
       
        /*
        Q1. Find the Largest Element in an Array.
        */
        int[] largest = {7,6,3,9,5};
        
        int max = largest[0];

        for(int ele : largest){
            if(ele > max){
                max = ele;
            }
        }
        System.out.println("Largest number: "+max);
    
    
    
    
    
    
        /*
        Reverse an array
        */
       int[] reverseArray = {1,2,3,4,5,6};

        for(int i = 0; i < reverseArray.length / 2; i++){
            int temp = reverseArray[i];
            reverseArray[i] = reverseArray[reverseArray.length -1 -i];
            reverseArray[reverseArray.length - 1 -i] = temp;
        }

        for(int ele : reverseArray){
            System.out.println(ele);
        }


       
       
       
       
       



// Sum of Elements in an Array.

    int[] sumTheseArray = {1,1};
    int sum = 0;
        for(int ele : sumTheseArray){
            sum += ele;            
        }
        System.out.println("Sum of Array Elements: "+sum);



// Count the Ouccerence of the Elements

int[] countOccurrences = {11,2,5,6,66,6,66,6,7,7,7,7,7,7,7};

int ele = 7;
    int count = 0;
    for(int element : countOccurrences){
        if(element == ele){
            count++;
        }
    }
    System.out.println("Number "+ele+" Occurred "+count+" times.");
    



// Find the Second Largest Element

    int[] arr = {1,5,2,3,9};
    int largestEle = Integer.MIN_VALUE;
    int secondLargestEle = Integer.MIN_VALUE;

       for(int i = 0; i < arr.length; i++){
        if(largestEle < arr[i]){
            secondLargestEle = largestEle;
            largestEle = arr[i];
        }else if(secondLargestEle < arr[i] && arr[i] != largestEle){
            secondLargestEle  =  arr[i];
        }
       }
            System.out.println("Second Largest: "+secondLargestEle);






       
// Check if array is sorted or not

int[] sortedArr = {0,1,2,3,4,5,7};
    boolean check = true;
    int smallest = Integer.MIN_VALUE;
    for(int sEle : sortedArr){
        if(smallest > sEle){
            check = false;
        }
        smallest = sEle;
    }
    System.out.println("Sorted? "+check);
       
       
       
       
       
       
       








// Move Zeros to end
int[] newArr = {1,0,0,3,0,6,8};

    int[] secondArr = new int[newArr.length];

    int countArr = 0;
    for(int k = 0; k < newArr.length; k++){
        if(newArr[k] != 0){
            secondArr[countArr] = newArr[k];
            countArr++;            
        }
    }

    for(int i = countArr; i < newArr.length; i++){
        secondArr[i] = 0;
    }

        System.out.println("\n Zero at end: ");
        for(int zeroElement : secondArr){
            System.out.print(zeroElement+" ");
        }


















// Move Zeros to end {more Efficient}

int[] oneArr = {1,0,5,6,0,0,0,9,6,3};

    int countOneArr = 0;


    for(int i = 0;  i < oneArr.length; i++){
        if(oneArr[i] != 0){
            oneArr[countOneArr] = oneArr[i];
            countOneArr++;
        }
    }
    while(countOneArr< oneArr.length){
        oneArr[countOneArr] = 0;
        countOneArr++;
    }
    System.out.println("\n");
    for(int oneArrElement: oneArr){
        System.out.print(oneArrElement+" ");
    }














// find the largest number in an array

int[]  largestNumberElement = {1,2,3,4,5,6,8,44,22};
    int largestNum = Integer.MIN_VALUE;
    for(int i = 0; i < largestNumberElement.length - 1; i++){
        if(largestNumberElement[i] > largestNum ){
            largestNum = largestNumberElement[i];
        }
    }

    System.out.println("\nLargest Number: "+ largestNum);


    








// Check if Array Contains a Specific Element

    int[] getSpecificEle = {2,4,56,787,22,34,78,87,32};

        int thisEle = 56;
        for(int i  = 0; i < getSpecificEle.length; i++){
            if(getSpecificEle[i] == thisEle){
                System.out.println("At Index "+(i+1)+" "+thisEle+" Found");
            }
        }



// Check if an Array is Sorted

    int[] checkSorted = {1,2,3,4,5,6,7};
        boolean flag = true;
        for(int i = 0 ; i < checkSorted.length -1; i++){
            if(checkSorted[i] > checkSorted[i+1]){
                flag = false;
                break;  
            }
        }
        System.out.println("Sorted Array? "+flag);













// Remove Duplicate from a sorted array.

    int[] DuplicateArray = {1,1,1,3,4,5,6,7,7,8,8,9,10,9};

        int[] nonDuplicateArray = new int[DuplicateArray.length];
        int StoredEle = 0;
        int indexVal = 0;
        for(int i  = 0; i < DuplicateArray.length; i++){
            
            if(StoredEle != DuplicateArray[i]){
                StoredEle = DuplicateArray[i];
                nonDuplicateArray[indexVal] = StoredEle;
                indexVal++;
            }
        }

        for(int nonDEle : nonDuplicateArray){
            System.out.print(nonDEle+" ");
        }













// Find Missing Numbers

    int[] findMissing = {1,2,4,5,6};

        int missingSum = 0;
        for(int i = 0; i < findMissing.length; i++){
            missingSum += findMissing[i];
        }
        
        int missingTotalRange = 0;

        for(int i = findMissing[0]; i <= findMissing[findMissing.length-1]; i++){
            missingTotalRange += i;
        }

        System.out.println("\n"+(missingTotalRange-missingSum));













       
       }
    }




























