package com.mycompany.TestApplication;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args)throws Exception {
        Scanner s = new Scanner(System.in);
        int numberOfStudents = s.nextInt();                 // Reading input from STDIN
        int[][] Pixels = new int[numberOfStudents][2];
        for(int i= 0; i<numberOfStudents;i++){
            Pixels[i][0] = s.nextInt();
            Pixels[i][1] = s.nextInt();
        }
        TestClass t = new TestClass();
        t.maxHeightandWidth(Pixels);
        // Write your code here

    }
	public void maxHeightandWidth(int[][] Pixels) {
	    int largest = 0, seclargest= 0, width = 0;
		for (int i=0;i<Pixels.length;i++)
		{
			if(Pixels[i][1] > largest) {
	            seclargest = largest;
	            largest = Pixels[i][1] ;
	        } else if (Pixels[i][1]  > seclargest) {
	            seclargest = Pixels[i][1] ;
	        }
        	width += Pixels[i][0];
		}
		for (int i=0;i<Pixels.length;i++) {
			int height = largest;
			if(largest == Pixels[i][1]) {
				height = seclargest;
			}
			int iwidth = width - Pixels[i][0];
			System.out.println(height*iwidth);
		}

	    }
	}
