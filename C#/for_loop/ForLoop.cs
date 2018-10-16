using System;

namespace ForLoop 
{
    class ForLoop
    {
        static void Main()
        {
            int N = 100;
            for(int i = 0 ; i < N; i++){
                if(i % 2 == 0){
                    Console.Write("*");
                }
                else{
                    Console.Write("~");
                }
            }
        }
    }
}