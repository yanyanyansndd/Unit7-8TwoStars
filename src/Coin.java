//8.11

import java.util.*;
import java.io.*;

public class Coin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int ass;
        System.out.print("Enter a number between 0 and 511: ");
        ass = input.nextInt();
        int[] dick = new int[9];
        for(int i=9-1;i>=0;i--) {
        	dick[i] = ass%2;
        	ass = ass/2;
        }
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++) {
        		if(dick[3*i+j]==0)
        			System.out.print("H");
        		else
        			System.out.print("T");
        		if(j<2)
        			System.out.print(" ");
        		else
        			System.out.print("\n");
        	}
        }
	}

}
