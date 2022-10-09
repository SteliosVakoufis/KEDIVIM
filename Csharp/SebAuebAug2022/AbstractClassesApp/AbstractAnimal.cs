using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractClassesApp
{
    internal abstract class AbstractAnimal
    {
        public int Id { get; set; }
        public string? Name { get; set; }
        public double Age { get; set; }

        public abstract void Speak();

        public virtual void Eat()
        {
            Console.WriteLine("The animal choked on the food that it was eating :-)");
        }

        public abstract override string ToString();
    }
}
