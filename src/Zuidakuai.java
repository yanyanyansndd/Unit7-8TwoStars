//8.35

import java.util.*;
import java.io.*;

public class Zuidakuai {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int ass = input.nextInt();
        int[][] test = new int[ass][ass];
        System.out.println("Enter the matrix row by row:");
        for(int i=0;i<ass;i++)
        	for(int j=0;j<ass;j++)
        		test[i][j] = input.nextInt();
        int[] jesus = findLargestBlock(test);
        System.out.printf("The maxinum square submatrix is at (%d,%d) with size %d\n", jesus[0],jesus[1],jesus[2]);
	}

	public static int[] findLargestBlock(int[][] m) {
		int[] res = new int[3];
		int n = m.length;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++) {
				for(int r=1;r<=Math.min(n-i, n-j);r++) {
					if(allOne(i,j,r,m)) {
						res[0] = i;
						res[1] = j;
						res[2] = r;
					}
				}
			}
		return res;
	}
	
	public static boolean allOne(int pinr,int pinc,int range,int[][] m) {
		boolean all1 = true;
		for(int i=0;i<range;i++)
			for(int j=0;j<range;j++) {
				if(m[pinr+i][pinc+j]==0) {
					all1 = false;
					break;
				}
			}
		return all1;
	}
}
