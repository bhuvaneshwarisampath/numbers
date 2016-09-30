#include <stdio.h>
#include <conio.h>
int c=0;
void bin(long n);
int main()
{
long b;
int n,i,d,j,k,a[100],z[100];
clrscr();
scanf("%d",&n);
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
d=a[i];
bin(d);
z[i]=c;
c=0;
}
for(i=0;i<(n-1);i++)
{
for(j=0;j<n-i-1;j++)
{
if(z[j]<z[j+1])
{
k=a[j];
a[j]=a[j+1];
a[j+1]=k;
k=z[j];
z[j]=z[j+1];
z[j+1]=k;
}
if(z[j]==z[j+1])
{
if(a[j]<a[j+1])
{
k=a[j];
a[j]=a[j+1];
a[j+1]=k;
k=z[j];
z[j]=z[j+1];
z[j+1]=k;
}
}
}
}
for(i=0;i<n;i++)
printf("%d ",a[i]);
getch();
return 0;
}
void bin(long n)
{
int r;
long b=0,i=1;
while(n != 0)
{
r=n%2;
if(r==1)
c++;
n=n/2;
b=b+(r*i);
i=i*10;
}
}