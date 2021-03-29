package com.company;

public class Quicksort {
    int[] arr = new int[]{};

    int partition(int arr[], int low, int high) {
        int pivot = arr[(low+high)/2];
        int i = low;
        for( int j = low; j < high; j++){
            if(arr[j] < pivot){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[(low+high)/2];
        arr[(low+high)/2] = temp;
        return i;
    }

    void sort(int arr[], int l, int h) {

        int[] stack = new int[h - l + 1];


        int top = -1;


        stack[++top] = l;
        stack[++top] = h;


        while (top >= 0) {
            // Pop h and l
            h = stack[top--];
            l = stack[top--];


            int p = partition(arr, l, h);


            if (p - 1 > l) {
                stack[++top] = l;
                stack[++top] = p - 1;
            }


            if (p + 1 < h) {
                stack[++top] = p + 1;
                stack[++top] = h;
            }
        }
    }

    public Quicksort(int[] arr) {
        this.arr = arr;
    }
}
