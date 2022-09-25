using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercise2
{
    internal class BootlegQueue
    {
        private int?[] bQueue;
        private int max_size;
        private int entrance;

        public BootlegQueue(int max_size)
        {
            this.entrance = 0;
            this.max_size = max_size;
            this.bQueue = new int?[max_size];
            InitBStack();
        }

        public void EnQueue(int num)
        {
            if (!this.IsFull())
            {
                bQueue[entrance] = num;
                this.entrance++;
            }
        }

        public int? DeQueue()
        {
            if (!this.IsEmpty())
            {
                this.entrance--;
                int? num = this.bQueue[0];
                this.ShiftQueue();
                this.bQueue[entrance] = null;
                return num;
            }

            return null;
        }

        public bool IsEmpty()
        {
            return this.bQueue[0] == null;
        }

        public bool IsFull()
        {
            return this.entrance == this.max_size - 1;
        }

        public void PrintStack()
        {
            foreach (var num in this.bQueue)
            {
                Console.Write($"{num} ");
            }
            Console.WriteLine();
        }

        // Helper Functions
        private void InitBStack()
        {
            for (int i = 0; i < this.bQueue.Length; i++)
            {
                this.bQueue[i] = null;
            }
        }

        private void ShiftQueue()
        {
            int?[] newBQueue = new int?[max_size];
            for (int i = 1; i < this.bQueue.Length; i++)
            {
                newBQueue[i - 1] = this.bQueue[i];
            }
            this.bQueue = newBQueue;
        }
    }
}
