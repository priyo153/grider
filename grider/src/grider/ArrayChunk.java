package grider;

import java.util.Arrays;

public class ArrayChunk {

	public static int[][] chunk(int[] arr, int size) {
		
		int newarr[][];
		if (arr.length % size == 0)
			newarr = new int[(int) ((arr.length / size))][size];

		else
			newarr = new int[(int) ((arr.length / size) + 1)][size];
			newarr[(int)(arr.length / size)]=new int[arr.length %size];

		int xpos = 0;
		int ypos = 0;
		for (int i = 0; i < arr.length; i++) {

			newarr[xpos][ypos] = arr[i];
			ypos++;

			if (ypos == size) {
				ypos = 0;
				xpos++;
			}

		}
		
		return newarr;

	}

	public static void main(String[] args) {
		int[][] x=chunk(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 5);
		System.out.println(Arrays.deepToString(x));
		}
		

	}


