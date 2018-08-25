package com.crackingthecode.Sorting;

public class SelectionSort {
	
	public void selectionSort(int arr[]){
		int min;
		
		for (int i = 0; i<arr.length ; i++){
			min = i;
			
			for (int j = i+1; j<arr.length; j++)
			{
				System.out.println("-----"+arr[j]);
				if (arr[j] < arr[min]){
					min = j;
					
				}
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SelectionSort s = new SelectionSort();
		int a[] = {5, 4, 3, 2, 1};
		s.selectionSort(a);
		
		for (int i=0; i <5; i++){
			System.out.println(a[i]);
		}

	}

}
