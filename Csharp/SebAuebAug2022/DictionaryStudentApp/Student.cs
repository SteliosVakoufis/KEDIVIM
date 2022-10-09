namespace DictionaryStudentApp
{
    internal class Student : IComparable<Student>
    {
        public int Id { get; set; }
        public string? FirstName { get; set; }
        public string? LastName { get; set; }

        public Student() { }

        public Student(int id, string? firstName, string? lastName)
        {
            Id = id;
            FirstName = firstName;
            LastName = lastName;
        }
        public int CompareTo(Student? other)
        {
            if (other is null || this.LastName is null || other.LastName is null)
                throw new ArgumentNullException(nameof(other));

            return this.LastName!.CompareTo(other!.LastName);
        }

        public override string? ToString()
            => $"{this.FirstName} {this.LastName} {this.Id}";

        public override bool Equals(object? obj)
        {
            if (obj is null || obj is not Student) return false;
            Student other = (Student)obj;
            return
                this.Id.Equals(other.Id) &&
                this.LastName!.Equals(other.LastName) &&
                this.FirstName!.Equals(other.FirstName);
        }

        public override int GetHashCode()
        {
            return HashCode.Combine(this.Id, this.FirstName, this.LastName);
        }

    }
}
