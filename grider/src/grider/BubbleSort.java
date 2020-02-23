package grider;

import java.util.Arrays;

public class BubbleSort {
	
	static int[] sort(int[] arr ) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				
				//System.out.println(Arrays.toString(arr));
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr=new int[]{6,5,7,1,2,9,8,4};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sort(arr)));
		

	}

}
