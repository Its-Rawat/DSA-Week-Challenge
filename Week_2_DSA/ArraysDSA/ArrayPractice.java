
import java.util.Arrays;

class ArrayPractice{
    public static void main(String[] args) {


// // Find Maximum Element in an Array in UnSorted Array.
//     int[] arr1 = {1,5,12,121,111,3,4,7};
//     int max = Integer.MIN_VALUE;

//     for(int i = 0; i < arr1.length; i++){
//         if(arr1[i] > max){
//             max = arr1[i];
//         }
//     }
//     System.out.println("MAX: "+max);




// //Reverse the elements of an array.

// // taking arr1 1,5,12,121,111,3,4,7

//     int lastPtr = arr1.length - 1;

//     for(int i = 0; i < lastPtr; i++){
//         int temp = arr1[i];
//         arr1[i] = arr1[lastPtr];
//         arr1[lastPtr] = temp;
//         lastPtr--;
//     }

//     for(int ele : arr1){
//         System.out.print(ele+" ");
//     }



// // Find the sum of all element of array.
//     int sum = 0;
//     for(int i = 0; i < arr1.length; i++){
//         sum += arr1[i];    
//     }
//     System.out.println("\nSUM of all the elements: "+sum);




// // Count the numbers of all the even and odd elements of the array.

//     int even = 0;
//     int odd = 0;
//     for(int i = 0; i < arr1.length; i++){
//         if(arr1[i] % 2 == 0){
//             even++;
//         }else{odd++;}
//     }
//     System.out.println("ODD: "+odd+" Even: "+even);



// // Print the array elements in alternate positions.

//     for(int i = 0; i < arr1.length; i = i + 2){
//         System.out.print(arr1[i]+   " ");
//     }

// // Find the second largest element of array.

//     int[] arr2 = {1,22,4,65,99,72};

//         int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;

//         for(int i = 0; i < arr2.length; i++){
//             if(largest < arr2[i]){
//                 secondLargest = largest;
//                 largest = arr2[i];
//             }
//             if(arr2[i] > secondLargest && arr2[i] < largest){
//                 secondLargest = arr2[i];
//             }
//         }

//         System.out.println("\nSecond largest Number is : "+secondLargest);




// // Find the second smallest element in an array


// //arr2  = 1,22,4,65,99,72

//     int smallest = Integer.MAX_VALUE;
//     int secondSmallest = Integer.MAX_VALUE;

//     for(int i = 0; i < arr2.length; i++){   
//         if(arr2[i] < smallest){
//             secondSmallest = smallest;
//             smallest = arr2[i];
//         }
//         else if(smallest < arr2[i] && secondSmallest > arr2[i]){
//             secondSmallest = arr2[i];
//         }
//     }
// System.out.println("Second Smallest: "+ secondSmallest);



// // Merge two sorted Array

//     int[] a1 ={1,3,5};
//     int[] a2 ={2,4,6};

//         int[] mergeArr = new int[(a1.length+a2.length)];
//         int i = 0; int k = 0; int j =0;
//         while(i < a1.length && j < a2.length){
//             if(a1[i] < a2[j]){
//                 mergeArr[k++] = a1[i++];
//             }else{
//                 mergeArr[k++] = a2[j++];
//             }
//         }
//         while(a1.length > i){
//             mergeArr[k++] = a1[i++];
//         }
//         while(a2.length > j){
//             mergeArr[k++] = a2[j++];
//         }

//         for(int ele : mergeArr){
//             System.out.print(ele+" ");
//         }




//Check if an array is sorted 


    int[] isSorted = {12,45,55,11};

    int ptr1 = Integer.MIN_VALUE;
    int ptr2 = Integer.MIN_VALUE;
    boolean flag = false;
    for(int i = 0; i < isSorted.length; i++){
            ptr2 = ptr1;
            ptr1 = isSorted[i];
        if(ptr1 < ptr2){
            flag = true;
            break;
        }
    }
    if(flag  == true){
    System.out.println("Not Sorted");
    }else{
        System.out.println("Sorted Array");
    }



//Find the largest sum contiguous subarray (Kadaneʼs Algorithm)

    int[] ar4 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int sum = 0;
    int maxTillNow = 0;
    int start = 0;
    int end = 0;
    int s = 0;

    for(int i = 0; i < ar4.length; i++){
        sum += ar4[i];
        if(maxTillNow < sum){
            maxTillNow = sum;
            start  = s;
            end = i;
        }

        if(sum < 0){
            sum = 0;
            start = i;
            s = i + 1;
        }
    }
    System.out.println(maxTillNow);
    




// Left rotate an array by one position.

    
// {-2, 1, -3, 4, -1, 2, 1, -5, 4};

    int temp = ar4[0];
    for(int l  = 0; l< ar4.length - 1; l++){
        
        ar4[l] = ar4[l+1];
        
        if(l+2 == ar4.length){
            ar4[l+1] = temp;
        }
    }

    for(int elementss : ar4){
        System.out.print(elementss+" ");
    }


// Left Rotate the array by K position

    int[] ar6  = {1,2,3,4,5,6,7};
    int k = 2;

    System.out.println("\nOriginal Array: "+ Arrays.toString(ar6));
    
    // Check if k isn't greater than ar6.lenght
    k = k % ar6.length;

    // Reverse the Array till k -1 position

    int starts = 0;
    int ends = k - 1;

    while(starts < ends){
        int temps = ar6[starts];
        ar6[starts] = ar6[ends];
        ar6[ends]  = temps;
        starts++;ends--;    
    }

    // Reverse the remaining Array Elements

    starts = k;
    ends = ar6.length - 1;
    while(starts < ends){
        int temps = ar6[starts];
        ar6[starts] = ar6[ends];
        ar6[ends] = temps;
        starts++;
        ends--;
    }

    // reverse the entire array
    starts = 0;
    ends = ar6.length - 1;
    while(starts < ends){
        int temps = ar6[starts];
        ar6[starts] = ar6[ends];
        ar6[ends] = temps;
        starts++;
        ends--;
    }

    System.out.println("Left rotated array: "+Arrays.toString(ar6));












































































































    }
}
