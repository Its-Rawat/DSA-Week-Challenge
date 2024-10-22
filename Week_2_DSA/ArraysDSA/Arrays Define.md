## Define 

1. *It Allows storing multiple values in a single variable.*
2. . *An array is a collection of elements of the same type stored in a contiguous memory location.*

## Key Characteristics

1. Fixed Size
2. Index Based
3. Homogeneous Elements
4. Contiguous Memory Location

## Types of Array's

1. 1D arrays
2. 2D arrays

## Declare Array

```
Type refrenceVariable[]
```

`// declaring and initializing at same time.`
```
int temp[] = {1,3,4,6,7,23,22};
```

// declare array
```
int size = 20;
String[] names = new String[size];
```

#### Implementation
![[Pasted image 20241023014330.png]]

### Access the array

```
names[0] = "Aditya";
names[1] = "Aayush";
names[2] = "Deewanshi";

sout(names[2]);
```

### Access using for-loop
 ```
for(int i = 0; i < 3; i++){
	System.out.println("Index["+i+"] have Name: "+names[i]);
}
```

### Internal Working of Array
> Reference variable will point to the base address of Array.

> Address of the i th element = Base Address + (i th * size of block)
> example-->address of first element 1000 + ( 1 * 4) => 1004

* One Block in an Array is made up of 4bytes (32bits).

## Advantages of Arrays

1. Efficient index based access. O(1)
2. Optimized for Cache Performance.

























