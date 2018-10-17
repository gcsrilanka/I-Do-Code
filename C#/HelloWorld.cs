using System;

namespace HelloWorld 
{
    class HelloWorld
    {
        static void Main()
        {
            Console.WriteLine("Enter a Grade A-D");
            char Grade = Convert.ToChar(Console.ReadLine());

            switch (Grade)
            {
                case 'A': Console.WriteLine("You got 85 ~ 100"); break;
                case 'B': Console.WriteLine("You got 70 ~ 84"); break;
                case 'C': Console.WriteLine("You got 60 ~ 69"); break;
                case 'D': Console.WriteLine("You got <60"); break;
                default: Console.WriteLine("Error.."); break;



            }
            Console.ReadKey();
        }
    }
}