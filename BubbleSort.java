package com.kn.Arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		//array creation
		int[] arr=new int[scan.nextInt()];
		//array initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the elements for element"+(i+1)+":");
			arr[i]=scan.nextInt();
		}
		BubbleSortTask b1=new BubbleSortTask();
		int[] crr=b1.sort(arr);
		System.out.println("After sorting: ");
		for(int i:crr)
		{
			System.out.println(i);
		}

	}

}
