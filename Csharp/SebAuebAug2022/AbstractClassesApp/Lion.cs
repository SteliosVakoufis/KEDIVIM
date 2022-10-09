using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractClassesApp
{
    internal class Lion : AbstractAnimal
    {
        public override void Speak()
            => Console.WriteLine("Rawr I am a cat, trust me!");

        public override void Eat()
            => Console.WriteLine($"Yum, nice food!");

        public override string ToString()
            => $"This is a cat\nID {base.Id}\nNAME {base.Name}\nAGE {base.Age}";
    }
}
