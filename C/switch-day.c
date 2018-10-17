/*
Name: switch.c
Desc: Switch case to print day in words.
*/

#include <stdio.h>

int main(void)
{
    //variables
    int day;
    //input
    printf("Enter a day in integers (1-7): ");
    scanf("%1d", &day);
    switch(day)
    {
        case 1:
            printf("Sunday.\n");
            break;
        case 2:
            printf("Monday.\n");
            break;
        case 3:
            printf("Tuesday.\n");
            break;
        case 4:
            printf("Wednesday.\n");
            break;
        case 5:
            printf("Thursday.\n");
            break;
        case 6:
            printf("Friday.\n");
            break;
        case 7:
            printf("Saturday.\n");
            break;
        default:
            printf("Invalid day.\n");
            break;
    }
    return 0;
}