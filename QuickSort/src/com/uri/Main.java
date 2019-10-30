package com.uri;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        int[] data = {10,80,30,90,40,50,70};
        System.out.println(Arrays.toString(data));
        quicksort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }
    public static void quicksort(int[] data, int start, int end){
        if(start<end)
        {
            int newPosOfPivot = partition(data,end);
            quicksort(data,start,newPosOfPivot-1);
            quicksort(data,newPosOfPivot+1,end);
        }
    }
    public static int partition(int[] data, int pivot){
        int i = -1;
        for(int j=0; j < pivot; j++)
        {
            if(data[j] <= data[pivot]){
                i++;
                swap(data,i,j);
            }
        }
        swap(data,i+1,pivot);
        return i+1;
    }

    public static void swap(int[] data, int posI, int posJ){
        int temp = data[posI];
        data[posI] = data[posJ];
        data[posJ] = temp;
    }

}
