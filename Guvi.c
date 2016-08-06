#include <stdio.h>
int main()
{
    int i,j,arr[50],t,temp;
    for(i=1;i<=50;i++)
        scanf("%d",&arr[i]);
    scanf("%d",&t);
    for(i=1;i<=50;i++)
    {
    	for(j=i+1;j<=50;j++)
    	{
    		if(arr[j]>arr[i])
    		{
    			temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    		}
    	}
    }
	printf("%d",arr[t]);
  return 0;
}