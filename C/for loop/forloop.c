#include <stdio.h>

int main ()

{
  int x,numbers[5];
  
  for(x=1;x<=5;x++)
  {
   printf("Enter Value %d into Array",x+1);
   scanf("%d",&numbers[x]);
  }
  
  return 0;
}
