using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Abstract
{
    abstract class absClass
    {
        public abstract int MultiplyNumbers(int x, int y);

        public int AddTwoNumbers(int x, int y)
        {
            return x + y;
        }

        public absClass()
        {
            Console.WriteLine("Hello world");
        }
    }
    
    class Program : absClass
    {
        static void Main(string[] args)
        {
            Program pm = new Program();
            int sum = pm.AddTwoNumbers(10, 20);
            int mul = pm.MultiplyNumbers(10,20);
            Console.WriteLine("Summation = " + sum);
            Console.WriteLine("Multiplication = " + mul);
            Console.ReadKey();

        }
        public override int MultiplyNumbers(int x, int y)
        {
            return x * y;
        }
    }
}
