package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] k100_random = new int[100000];
        int[] k100_step = new int[100000];

        int[] m1_random = new int[1000000];
        int[] m1_step = new int[1000000];

        //region filling arr's
        fillSorted(k100_step);
        fillSorted(m1_step);

        fillRandom(k100_random);
        fillRandom(m1_random);
        //endregion

        System.out.println("\n"+"############"+"\n");

        //region shellsort
        System.out.println("SHELL SORT");
        int[] temp_array = k100_random.clone();
        Shellsort shellsort = new Shellsort(temp_array);
        System.out.print("100k random elements: ");
        long time = System.currentTimeMillis();
        shellsort.sort(temp_array);
        System.out.println(System.currentTimeMillis() - time);

        temp_array = m1_random.clone();
        Shellsort shellsort1 = new Shellsort(temp_array);
        System.out.print("1m random elements: ");
        time = System.currentTimeMillis();
        shellsort1.sort(temp_array);
        System.out.println(System.currentTimeMillis() - time);

        temp_array = k100_step.clone();
        Shellsort shellsort2 = new Shellsort(temp_array);
        System.out.print("100k step elements: ");
        time = System.currentTimeMillis();
        shellsort2.sort(temp_array);
        System.out.println(System.currentTimeMillis() - time);

        temp_array = m1_step.clone();
        Shellsort shellsort3 = new Shellsort(temp_array);
        System.out.print("1m step elements: ");
        time = System.currentTimeMillis();
        shellsort3.sort(temp_array);
        System.out.println(System.currentTimeMillis() - time);
        //endregion

        System.out.println("\n"+"############"+"\n");

        //region heapsort
        System.out.println("HEAP SORT");
        temp_array = k100_random.clone();
        HeapSort heapSort = new HeapSort(temp_array);
        System.out.print("100k random elements: ");
        time = System.currentTimeMillis();
        heapSort.sort(temp_array);
        System.out.println(System.currentTimeMillis() - time);

        temp_array = m1_random.clone();
        HeapSort heapSort1 = new HeapSort(temp_array);
        System.out.print("1m random elements: ");
        time = System.currentTimeMillis();
        heapSort1.sort(temp_array);
        System.out.println(System.currentTimeMillis() - time);

        temp_array = k100_step.clone();
        HeapSort heapSort2 = new HeapSort(temp_array);
        System.out.print("100k step elements: ");
        time = System.currentTimeMillis();
        heapSort2.sort(temp_array);
        System.out.println(System.currentTimeMillis() - time);

        temp_array = m1_step.clone();
        HeapSort heapSort3 = new HeapSort(temp_array);
        System.out.print("1m step elements: ");
        time = System.currentTimeMillis();
        heapSort3.sort(temp_array);
        System.out.println(System.currentTimeMillis() - time);
        //endregion

        System.out.println("\n"+"############"+"\n");

        //region mergesort
        System.out.println("MERGE SORT");
        temp_array = k100_random.clone();
        Mergesort mergesort = new Mergesort(temp_array);
        System.out.print("100k random elements: ");
        time = System.currentTimeMillis();
        mergesort.sort(temp_array, 1, 99999);
        System.out.println(System.currentTimeMillis() - time);

        temp_array = m1_random.clone();
        Mergesort mergesort1 = new Mergesort(temp_array);
        System.out.print("1m random elements: ");
        time = System.currentTimeMillis();
        mergesort1.sort(temp_array, 1, 999999);
        System.out.println(System.currentTimeMillis() - time);

        temp_array = k100_step.clone();
        Mergesort mergesort2 = new Mergesort(temp_array);
        System.out.print("100k step elements: ");
        time = System.currentTimeMillis();
        mergesort2.sort(temp_array, 1, 99999);
        System.out.println(System.currentTimeMillis() - time);

        temp_array = m1_step.clone();
        Mergesort mergesort3 = new Mergesort(temp_array);
        System.out.print("1m step elements: ");
        time = System.currentTimeMillis();
        mergesort3.sort(temp_array, 1, 999999);
        System.out.println(System.currentTimeMillis() - time);
        //endregion

        System.out.println("\n"+"############"+"\n");

        //region qiucksort
        System.out.println("QUICK SORT");
        temp_array = k100_random.clone();
        Quicksort quicksort = new Quicksort(temp_array);
        System.out.print("100k random elements: ");
        time = System.currentTimeMillis();
        quicksort.sort(temp_array, 1, 99999);
        System.out.println(System.currentTimeMillis() - time);

        temp_array = m1_random.clone();
        Quicksort quicksort1 = new Quicksort(temp_array);
        System.out.print("1m random elements: ");
        time = System.currentTimeMillis();
        quicksort1.sort(temp_array, 1, 999999);
        System.out.println(System.currentTimeMillis() - time);

        temp_array = k100_step.clone();
        Quicksort quicksort2 = new Quicksort(temp_array);
        System.out.print("100k step elements: ");
        time = System.currentTimeMillis();

        temp_array = k100_step.clone();
        quicksort2.sort(temp_array,0, 99999);

        System.out.println(System.currentTimeMillis() - time);

        temp_array = m1_step.clone();
        Quicksort quicksort3 = new Quicksort(temp_array);
        System.out.print("1m step elements: ");
        time = System.currentTimeMillis();

        quicksort3.sort(temp_array, 1, 999999);


        System.out.println(System.currentTimeMillis()-time);
        //endregion
}

    public static int[] fillRandom(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }
        return arr;
    }

    public static int[] fillSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
