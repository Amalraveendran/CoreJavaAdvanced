package com.study.chapter.six;

import java.util.Arrays;

public class TwoDimensionalArrays {

    /*In a 2D array arr, the length of array will always be the no of rows, therefore
    arr.length is the no of rows. Similarly each column length is arr[0].length*/


    public static int[] rowSum(int[][] arr){
       int[] res = new int[arr.length];
       for(int r=0;r<arr.length;r++){  /*Row is constant and column is variable
                                        and we are iterating through all the columns of that row*/
           int sum = 0;
          for(int c=0;c<arr[r].length;c++){
              sum = sum + arr[r][c];
          }
          res[r] = sum;
       }
       return res;
    }

    public static int[] colSum(int[][] arr){
        int[] res = new int[arr[0].length];
        for(int c=0;c< arr[0].length;c++){ /*Column is constant and row is variable and we are
                                             iterating through all the rows of that column*/
            int sum = 0;
            for(int r=0;r<arr.length;r++){
                sum += arr[r][c];
            }
            res[c] = sum;
        }
        return res;
    }

    public static void display(int[][] arr){
        for (int[] row : arr) {  /* Since a multidimensional array is just an
                                array in an array, From 2D array, we are taking
                                 each row and storing it in a 1D array */
            for (int element : row) { // From 1D array, we are taking each element and storing it in a variable
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        int[][] mat = {
            {1, 2, 3 ,8},
            {4, 5, 6,4},
            {7, 8, 9,0}
        };
        display(mat);
        int sum[] = rowSum(mat);
        System.out.println("Sum of all row-wise sum in the 2D array: " + Arrays.toString(sum));
        int colSum[] = colSum(mat);
        System.out.println("Sum of all colum-wise in the 2D array: " + Arrays.toString(colSum));

        //In built method of Array
        /* 1. toString() method of Arrays class is used to convert the array
        into a string representation which can be invaluable for debugging and logging purposes.
        This method can be used only for 1D arrays.*/
        int[] arr = {1, 7, 9, 4, 5};
        String res = Arrays.toString(arr);
        System.out.println("String representation of the array: " + res);

        //2. sort() method of Arrays class is used to sort the elements of an array in ascending order.
       Arrays.sort(arr);

       System.out.println("After sorting: " + Arrays.toString(arr));


       /*3. binarySearch() method of Arrays class is used to search
       for a specific element in a sorted array. It also search in the unsorted
       arrays but the result may not be always accurate*/
       System.out.println("binarySearch() method : "+ Arrays.binarySearch(arr , 7));

       /*4. fill() method of Arrays class is used to fill the entire array
       with a specific value.It takes two arguments, the first is the array
        to be filled and the second is the value to fill the array with.*/
        Arrays.fill(arr , 4);
        System.out.println("fill() method : "+ Arrays.toString(arr));

        /*5. copyOf() method of Arrays class is used to copy the elements of an array
        into a new array of the same type.
        We cant dirrectly use fill() and copyOf() in 2D array.*/
        int[] na = arr;
        na[1] = 6;
        System.out.println("New array "+ Arrays.toString(na));
        System.out.println("Old array "+ Arrays.toString(arr));

        int[] newarr = Arrays.copyOf(arr, arr.length);
        newarr[0] = 100;
        System.out.println("New array "+ Arrays.toString(newarr));
        System.out.println("Old array "+ Arrays.toString(arr));

       /* int[] newArr = Arrays.copyOf(arr, arr.length);*/
        System.out.println(newarr + " : " + arr);

       /* Resizing using copyOf() method , we increase or decrease the size of the
        array by specifying the new length as the second argument to the copyOf() method.*/
        int[] newArr = Arrays.copyOf(arr, 3);
        System.out.println("Resizing using copyOf() method: "+ Arrays.toString(newArr));

        //6. equals() method of Arrays class is used to compare two arrays for equality element-wise.
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 6};
        System.out.println("equals() method: "+ Arrays.equals(arr1, arr2)); //returns false

    }
}
