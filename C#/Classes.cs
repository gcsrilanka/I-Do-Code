using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace classes_and_abstract
{
    abstract class absclass
    {
        public abstract int MultiplyNumbers(int x, int y);

        public int AddTwoNumbers(int x, int y)
        {
            return x + y;
        }
        public absclass()
        {
            Console.WriteLine("Hello World");
        }
    }

        class Program :absclass 
        {
            static void Main(string[] args)
            {
                Program PM = new Program();
                    int sum = PM.AddTwoNumbers(10, 20);
                int mul = PM.MultiplyNumbers(10, 20);
                Console.WriteLine("sum :" + sum);
                Console.WriteLine("multiplication : " + mul);
                Console.ReadKey();
            }
        public override int MultiplyNumbers(int x, int y)
        {
            return x * y;
        }
    }
     
    
        
    
}
