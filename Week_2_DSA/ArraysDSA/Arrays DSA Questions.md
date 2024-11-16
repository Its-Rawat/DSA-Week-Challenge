```
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
```
#### Time Complexity
![[Pasted image 20241026114043.png]]


```
        /*
        Reverse an array
        */
       int[] reverseArray = {1,2,3,4,5,6};

       int[] newArray = new int[reverseArray.length];

       for(int i = 0; i< reverseArray.length; i++){

        newArray[i] = reverseArray[reverseArray.length -1  -i];

        }

        System.out.println("||||||Reversed Array||||||");

        for(int i = 0; i < newArray.length; i++){

            System.out.println(newArray[i]);

        }
```
### Time Complexity
![[Pasted image 20241026121010.png]]

```
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
```

### Time Complexity
![[Pasted image 20241026122755.png]]

```
// Sum of Elements in an Array.

    int[] sumTheseArray = {1,1};

    int sum = 0;

        for(int ele : sumTheseArray){

            sum += ele;            

        }

        System.out.println("Sum of Array Elements: "+sum);
```
### Time Complexity
![[Pasted image 20241026155152.png]]


```
// Find the Second Largest Element

    int[] arr = {1,5,2,3,9};

    int largestEle = Integer.MIN_VALUE;

    int secondLargestEle = Integer.MIN_VALUE;

       for(int i = 0; i < arr.length; i++){

        if(largestEle < arr[i]){

            secondLargestEle = largestEle;

            largestEle = arr[i];

        }else if(secondLargestEle < arr[i] && arr[i] != largestEle){

            secondLargestEle  =  arr[i];

        }

       }

            System.out.println("Second Largest: "+secondLargestEle);
```
### Time Complexity
![[Pasted image 20241026164940.png]]

```
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
```
### Time Complexity
![[Pasted image 20241026171106.png]]


```
// Move Zeros to end

int[] arrs  = {0,0,2,3,4,0,9,3};

int index =0;

for(int i = 0; i < arrs.length; i++){

    if(arrs[i] != 0){

        arrs[index] = arrs[i];

        index++;
    }
}

while(index < arrs.length){

    arrs[index] = 0;

    index++;

}

for(int newEle : arrs){

    System.out.print(newEle+" ");
}
```
### Time Complexity
![[Pasted image 20241026182908.png]]


```
  

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
```
![[Pasted image 20241108161401.png]]


![[Pasted image 20241109121149.png]]