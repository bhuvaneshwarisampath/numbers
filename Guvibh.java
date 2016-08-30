/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guvibh;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Guvibh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scr=new Scanner(System.in);
		System.out.println("Enter N value");
		int N=scr.nextInt();
		System.out.println("Enter Matrix Values");
		int[][] arr=new int[N][N];
		int[][] arr1=new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				arr[i][j]=scr.nextInt();
				arr1[i][j]=arr[i][j];
			}}
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					if(arr[i][j]==0){
						 for(int temp=0;temp<N;temp++)
				            {
				                arr1[i][temp]=0;
				               arr1[w][temp]=0;
				            }
						
					}
					
				}
				
			}
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					System.out.print(arr1[i][j]+" ");
					
				}
			System.out.println();	
			}
		}

	}


        // TODO code application logic here
    

