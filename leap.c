#include<stdio.h>
int main()
{
int n;
scanf("%d",&n);
if((n%4==0)&&(n%100==0))
printf("\n%d is leap year",n);
else
printf("\n%d is not a leap year",n);
}
