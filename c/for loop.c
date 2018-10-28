#include <stdio.h>
#include <stdlib.h>

int main()
{
     int no,c,fact=1;
    printf("Enter a number to calculate its factorial:");
    scanf("%d",&no);
    for(c=1;c<=no;c++)
        fact=fact*c;
    printf("Factorial of %d = %d\n",no,fact);
    return 0;
}
