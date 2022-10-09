using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StackApp
{
    internal class PoorMansStack
    {
        public int?[]? Stack { get; set; }
        public int Top { get; set; }
        public int Size { get; set; }

        // Static Factory Method
        public static PoorMansStack getTheStack(int n)
        {
            return new PoorMansStack()
            {
                Stack = new int?[n],
                Top = 0,
                Size = n,
            };
        }

        public void Push(int num)
        {
            if (Top == Size)
            {
                throw new StackOverflowException();
            }
            else
            {
                Stack![Top++] = num;
            }
        }

        public int? Pop()
        {
            if (Top == 0) throw new Exception();

            return Stack![--Top];
        }
    }
}
