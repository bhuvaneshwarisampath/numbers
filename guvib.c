#include<stdio.h>
int main()
{
	int rows,cols,i,j,temp;
	scanf("%d",&rows);
	scanf("%d",&cols);
	int *row_list=new int[rows];
	int *cols_list=new int[cols];
	for(i=0;i<rows;i++)
	row_list[i]=1;
	for(j=0;j<cols;j++)
	cols_list[j]=1;
	for(i=0;i<rows;i++)
	{
	for(j=0;j<cols;j++)
		{
		scanf("%d",&temp);
		if(temp==0)
		{
			  row_list[i]=0;
			  cols_list[j]=0;	
		}			
		}
	}
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{
	     if(row_list[i]==1 &&cols_list[j]==1)	
	     printf("1 ");
	     else
	     printf("0 ");
	    }
	    printf("\n");
    }	 
	return 0;
}