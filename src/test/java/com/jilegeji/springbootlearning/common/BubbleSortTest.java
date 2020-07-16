package com.jilegeji.springbootlearning.common;

import java.util.Arrays;

public class BubbleSortTest {

	public static void main(String[] args) {
		Integer[] arr = new Integer[]{2,56,43,36,27,85,1,68,32};
		bubbleSort(arr);
		System.out.println(Arrays.asList(arr));
	}

	public static void bubbleSort(Integer[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
