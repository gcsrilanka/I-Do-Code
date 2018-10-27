8#include<stdio.h>
int main()
{
    float price[10],average,sum;
    int i,max=0;
    for(i=0;i<5;i++)
    {
       printf("Enter price of item %d ",i+1);
       scanf("%f",& price[i]);
    }
     for(i=0;i<5;i++)
     {
         sum=sum+price[i];
         if(price[i]>max)
            max=price [i];

     }
printf("Average is %.2f ",sum/5);
printf("Highest is %d ",max);



}




