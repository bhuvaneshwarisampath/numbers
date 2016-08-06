package com.shree.matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {
	static int n,k=0;
	static int[][] input;
	static Scanner s = new Scanner(System.in);
	static ArrayList<String> al = new ArrayList<String>();

	public static void getUserInput() {
		input = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				input[i][j] = s.nextInt();
			}
		}
	}

	public static void displayInput() {


		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void findIndex() {
		for (Integer i = 0; i < n; i++) {
			for (Integer j = 0; j < n; j++) {
				if (input[i][j] == 0) {
					al.add(i.toString()+j.toString());
				}
			}
		}
	}

	public static void doChange(Integer i1,Integer j1)
	{
		for(Integer j=0;j<n;j++)
		{
			input[i1][j]=0;
		}
		for(Integer i=0;i<n;i++)
		{
			input[i][j1]=0;
		}
	}

	public static void changeRowsAndCols() {
		for(Integer i=0;i<n;i++)
		{
			for(Integer j=0;j<n;j++)
			{
				if(al.contains(i.toString()+j.toString()))
				{
					doChange(i,j);
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter the order of the square matrix :");
		n = s.nextInt();
		getUserInput();
		findIndex();
		System.out.println("Before change: ");
		displayInput();
		changeRowsAndCols();
		System.out.println("After change: ");
		displayInput();
	}
}