using System.Collections;

namespace StudentLikeJavaApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var students = new List<Student>()
            {
                new Student(0, "Alice", "Bangers"),
                new Student(1, "John", "Snow"),
                new Student(2, "Jack", "Daniels"),
                new Student(3, "George", "Giorgio")
            };

            students.ForEach(s => Console.WriteLine(s.ToString()));
        }
    }
}
