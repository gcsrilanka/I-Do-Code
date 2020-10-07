#include <stdio.h>
int main()
{
  int a,b;
  printf("enter two integer values to add:");
  scanf("%d %d",&a,&b);
  
  int c,d;
  printf("enter two integer values to add:");
  scanf("%d %d",&c,&d);

  printf("%d + %d =%d",a,b,(a+b));
  
  printf("%d + %d =%d",c,d,(c+d));
}
