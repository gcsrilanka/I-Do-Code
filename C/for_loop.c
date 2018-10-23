#include<stdio.h>

int main(){
	int i,j,k=100;
	for ( i = 0; i < 10; ++i)
	{  if (i<5)
		{
			for(j=0;j<k; j++)
			{
				printf("*");
			}
			printf("\n");
			k = k-2;
		}else{
			for(j=0;j<k; j++)
			{
				printf("*");
			}
			printf("\n");
			k = k-2;

		}
		
	}
}