using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercise1
{
    internal class BootlegStack
    {
        private int?[] bStack;
        private int max_size;
        private int top;

        public BootlegStack(int max_size)
        {
            this.top = 0;
            this.max_size = max_size;
            this.bStack = new int?[max_size];
            InitBStack();
        }

        public void Push(int num)
        {
            if (!this.IsFull())
            {
                this.bStack[top] = num;
                this.top++;
                return;
            }
            Console.WriteLine("The stack is full!");
        }

        public int? Pop()
        {
            if (!this.IsEmpty())
            {
                this.top--;
                int? num = this.bStack[top];
                this.bStack[top] = null;
                return num;
            }

            return null;
        }

        public bool IsEmpty()
        {
            return this.bStack[0] == null;
        }

        public bool IsFull()
        {
            return this.top == this.max_size - 1;
        }

        public void PrintStack()
        {
            foreach (var num in this.bStack)
            {
                Console.Write($"{num} ");
            }
            Console.WriteLine();
        }

        // Helper Function
        private void InitBStack()
        {
            for (int i = 0; i < this.bStack.Length; i++)
            {
                this.bStack[i] = null;
            }
        }
    }
}
