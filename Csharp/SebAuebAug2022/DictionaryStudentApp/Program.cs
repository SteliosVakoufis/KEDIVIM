namespace DictionaryStudentApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Dictionary<int, Student> students = new()
            {
                { 1, new Student(1, "John", "Snow") },
                { 2, new Student(2, "Daniel", "Danielson") },
                { 3, new Student(3, "Sand", "Sanderson") },
            };

            // CRUD
            students.Add(4, new Student(4, "Jack", "Daniels"));

            students.Remove(2);

            foreach (var key in students.Keys)
            {
                Console.WriteLine(students[key]);
            }
            // Something something
        }
    }
}