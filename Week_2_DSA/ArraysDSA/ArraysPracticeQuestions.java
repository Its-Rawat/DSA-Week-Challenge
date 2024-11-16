
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



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









// Find the minium Element of Array.

int[] minArr = {3,4,1,2};


    int minElement = Integer.MAX_VALUE;
    for(int i  = 0; i < minArr.length; i++){
        if(minArr[i] < minElement){
            minElement = minArr[i];
        }
    }
    System.out.println("Minimum Element of Array is: "+minElement);








    

//Count the number of even and odd elements in an array.

int[] oddEvenArr = {1,1,1,1,1,1,1,1};

    int oddCount = 0;
    int evenCount = 0;
    for(int i = 0; i < oddEvenArr.length; i++){
        if(oddEvenArr[i]%2 == 0){
            evenCount++;
        }
        else if(oddEvenArr[i]%2 != 0){
            oddCount++;
        }
    }
    System.out.println("ODD: "+oddCount+" EVEN: "+evenCount);




//Print the elements of an array in alternate positions.

int[] alternateArr = {1,2,3,4,5,6,7,8,9};

    for(int i  =0; i< alternateArr.length; i++){
        System.out.println(alternateArr[i]);
        i++;
    }


//Find the second smallest element in an array

int[] secondSmallestArr = {5,6,1,8,9,4,3};

    int smallestVal = Integer.MAX_VALUE;
    int secondSmallestVal = Integer.MAX_VALUE;
    for(int i  =0 ; i< secondSmallestArr.length; i++){
        if(secondSmallestArr[i] < smallestVal){
                secondSmallestVal = smallestVal;
                smallestVal = secondSmallestArr[i];
            }
        else if (secondSmallestArr[i] < secondSmallestVal && secondSmallestArr[i] != smallestVal) {
        secondSmallestVal = secondSmallestArr[i];
    }
    }

    System.out.println("Second Smallest Value is : "+ secondSmallestVal);












//Merge two sorted arrays

int[] mergeSortedArr1 = {55, 200, 400, 500, 600};
int[] mergeSortedArr2 = {350, 450, 550};

int[] mergedSortedArray = new int[mergeSortedArr1.length + mergeSortedArr2.length];
int p1 = 0, p2 = 0, p3 = 0;
// Step 1: run loop until one Array Exhausts 
while(p1 < mergeSortedArr1.length && p2 < mergeSortedArr2.length){
    if(mergeSortedArr1[p1] < mergeSortedArr2[p2]){
        mergedSortedArray[p3++] = mergeSortedArr1[p1++];
    }else{
        mergedSortedArray[p3++] = mergeSortedArr2[p2++];
    }
}
// add all elements from non-exhausted Array to mergedSortedArray.
while(p1 < mergeSortedArr1.length){
    mergedSortedArray[p3++] = mergeSortedArr1[p1++]; 
}
while(p2 < mergeSortedArr2.length){
    mergedSortedArray[p3++] = mergeSortedArr1[p2++]; 
}

for(int mergedArr : mergedSortedArray){
    System.out.print(mergedArr+" ");
}








//Find the largest sum contiguous subarray Kadaneʼs Algorithm

    int[] kadaneAlgoArr  = {-1,1,-3,6,2,-1};

    int currVal = 0;
    int maxVal = Integer.MIN_VALUE;

    for(int i = 0; i < kadaneAlgoArr.length; i++){
        currVal  = currVal + kadaneAlgoArr[i]; // currentOldValue + currentNewValue 
        if(currVal > maxVal){
            maxVal = currVal;
        }
        if(currVal < 0){
            currVal = 0;
        }
        
    }

    System.out.println("\nMax sub contiguous Sub Array: "+maxVal);






// Implement binary search on a sorted array.

    int[] binarySearchArray = {1,2,3,4,5,6,78,87};

        int ElementToSearch = 87;
        int left = 0;
        int right = binarySearchArray.length - 1;

        while(left <= right){

            int mid = (right + left) / 2;

            if(ElementToSearch < binarySearchArray[mid]){
                right = mid - 1;
            }else{
                left = mid+1;
            }
            if(ElementToSearch == binarySearchArray[mid]){
                System.out.println("\nElement found at Index: "+mid);
            }
        }


//Right rotate an array by one position.

    int[] leftRotateArr = {1,2,31,4,25,6};
        int lastVal = leftRotateArr[leftRotateArr.length -1];
        
        for(int i = leftRotateArr.length-2; i >= 0; i--){
            leftRotateArr[i+1] = leftRotateArr[i];
            if(i == 0){
                leftRotateArr[i] = lastVal;
            }
        }
        for(int lastElementTraverse : leftRotateArr){
            System.out.print(lastElementTraverse+" ");
        }





//Right rotate an array by K position.


    int[] rotateArr  ={1,2,3,4,5,6};

    int t = 3;
    t= t % rotateArr.length; //normalize
    for(int i= 0; i < t; i++){
        int tempValStore = rotateArr[rotateArr.length - 1];
            for(int j = rotateArr.length-1; j > 0; j--){
                rotateArr[j] = rotateArr[j-1];
            }
            rotateArr[0] = tempValStore;
    }
System.out.println("\n");
for(int all : rotateArr){
    System.out.print(all+" ");
}













//Find the frequency of each element in an array

    int[] frequencyOfArray = {1,1,1,4,4,7,7,7,7,8};

    int countFreq  = 0;

    for(int i = 0; i < frequencyOfArray.length; i++){
        countFreq = 1;
        while(i < frequencyOfArray.length -1 && frequencyOfArray[i] == frequencyOfArray[i+1]){
            countFreq++;
            i++;
        }
        System.out.println("\nElement: "+frequencyOfArray[i]+", Frequency: "+countFreq);
    }










// Find the intersection of two arrays


    int[] intersectArr1 = {4,51,76,54,3};
    int[] intersectArr2 = {2,59,3};

        for(int i = 0; i < intersectArr1.length; i++){
            for(int j = 0; j < intersectArr2.length; j++){
                if(intersectArr1[i] == intersectArr2[j] ){
                System.out.print("\n"+intersectArr1[i]+" ");
                break;
            }
            }
        }














/*
Find the missing number in an array of size  n  containing elements from  1  to n+1 .
*/
        
    int[] findMissingNumber = {1,2,4,5,7,3,8,9};
    int arrSizeN  =findMissingNumber.length;

        Arrays.sort(findMissingNumber);
        int someNum = 1;
        for(int i = findMissingNumber[0]; i < findMissingNumber[findMissingNumber.length-1]; i++){
            if(i+1 !=  findMissingNumber[someNum]){
                System.out.println("\nMissing Element is: "+(i+1));
                break;
            }
            someNum++;
        }
    







//Implement a function to perform a binary search on a sorted array.
    
    int[] binarySearchPerform = {1,2,3,4,5,7,8,9,10};

        int leftPtr = 0;
        int rightPtr = binarySearchPerform.length - 1;
        int searchNum = 7;

        while(leftPtr <= rightPtr){
            int mid = (leftPtr + rightPtr) / 2;
            if(binarySearchPerform[mid] == searchNum){
                System.out.println("\nAt Index "+mid+" we got: "+binarySearchPerform[mid]);
            }
            
            if(searchNum < binarySearchPerform[mid]){
                rightPtr = mid - 1;    
            }else{
                leftPtr = mid + 1;
            }
        }


        // Find the common elements in three sorted arrays.
        int[] a = {1,2,3,7};
        int[] b = {3,7,8};
        int[] c = {3,5,7,6,9};

        List<Integer> common = new ArrayList<>();
        int i=0,j=0,k=0;
        while(i < a.length && j < b.length && k < c.length){
            // base case. when all conditions met
            if(a[i] == b[j] && b[j] == c[k]){
                common.add(a[i]);
                i++;j++;k++;
            } // if value in a[i] is smaller then b[j] then increment i, do same with.
            else if(a[i] < b[j]){ 
                i++;
            }else if(b[j] < c[k]){
                j++;
            }else{
                k++;
            }
        }
        System.out.println("\nCommon Elements in a,b,c arrays are: "+common);
        







// Rotate a square matrix 90 degrees clockwise

    /*
    {
    0,1,2
    3,4,5
    6,7,8
    } -> {
    6,3,0
    7,4,1
    8,5,2
    }
    */
        int[][] matrixArr = {
            {0,1,2},
            {3,4,5},
            {6,7,8}
        };
            // transpose
        for(int l = 0; l < matrixArr.length; l++){
            for(int p = l; p < matrixArr.length; p++){
                int temps = matrixArr[l][p];
                matrixArr[l][p] = matrixArr[p][l];
                matrixArr[p][l] = temps;
            }
        }
            // reverse
        for(int l = 0; l < matrixArr.length; l++){
            for(int p = 0; p < matrixArr.length / 2; p++){
                int temps = matrixArr[l][p];
                matrixArr[l][p] = matrixArr[p][matrixArr.length - l - 1];
                matrixArr[l][matrixArr.length - p -1]  = temps;
            }
        }
        // print
        for(int o = 0; o < matrixArr.length; o++){
            for(int r = 0; r < matrixArr.length; r++){
                System.out.print(matrixArr[o][r]+" ");
            }
            System.out.println("");
        }






// Find the longest consecutive sequence in an array.
// Input: [100, 4, 200, 1, 3, 2]
// Output: 4 (sequence: 1, 2, 3, 4)
























       }
    }





























