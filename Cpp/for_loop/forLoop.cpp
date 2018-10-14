#include <iostream>

int main()
{
    //Print all even numbers between 0 and 100
    for(int i = 1; i < 100; i++)
    {
        if((i%2) == 0)
            std::cout << i << "  ";
    }
}
