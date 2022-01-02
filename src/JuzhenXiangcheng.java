//8.6

import java.util.*;
import java.io.*;

public class JuzhenXiangcheng {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        double[][] m1 = new double[3][3];
        double[][] m2 = new double[3][3];
        System.out.print("Enter matrix1: ");
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++)
        		m1[i][j] = input.nextDouble();
        }
        
        System.out.print("Enter matrix2: ");
        for(int i=0;i<3;i++)
        	for(int j=0;j<3;j++)
        		m2[i][j] = input.nextDouble();
        double[][] ass = multiMatrix(m1,m2);
        System.out.println("The multiplication of the matrices is");
        System.out.println(m1[0][0]+" "+m1[0][1]+" "+m1[0][2]+"     "+m2[0][0]+" "+m2[0][1]+" "+m2[0][2]+"     "+String.format("%.1f", ass[0][0])+" "+String.format("%.1f", ass[0][1])+" "+String.format("%.1f", ass[0][2]));
        System.out.println(m1[1][0]+" "+m1[1][1]+" "+m1[1][2]+"  *  "+m2[1][0]+" "+m2[1][1]+" "+m2[1][2]+"  =  "+String.format("%.1f", ass[1][0])+" "+String.format("%.1f", ass[1][1])+" "+String.format("%.1f", ass[1][2]));
        System.out.println(m1[2][0]+" "+m1[2][1]+" "+m1[2][2]+"     "+m2[2][0]+" "+m2[2][1]+" "+m2[2][2]+"     "+String.format("%.1f", ass[2][0])+" "+String.format("%.1f", ass[2][1])+" "+String.format("%.1f", ass[2][2]));
        
	}

	public static double[][] multiMatrix(double[][] a,double[][] b){
    	int rows = a.length;
    	int columns = b[0].length;
    	double[][] res = new double[rows][columns];
    	for(int i=0;i<rows;i++) {
    		for(int j=0;j<rows;j++) {
    			for(int k=0;k<a[0].length;k++)
    				res[i][j] += a[i][k] * b[k][j];
    		}
    	}
    	return res;
    }
}
