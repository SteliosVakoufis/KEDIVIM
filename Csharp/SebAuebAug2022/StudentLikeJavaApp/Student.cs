using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudentLikeJavaApp
{
    internal class Student
    {
        public int Id { get; set; }
        public String? FirstName { get; set; }
        public String? LastName { get; set; }

        public Student(){}

        public Student(int id, string? firstName, string? lastName)
        {
            this.Id = id;
            this.FirstName = firstName;
            this.LastName = lastName;
        }

        public override bool Equals(object? obj)
        {
            return obj is Student student &&
                   Id == student.Id &&
                   FirstName == student.FirstName &&
                   LastName == student.LastName;
        }

        public override int GetHashCode()
        {
            return HashCode.Combine(Id, FirstName, LastName);
        }

        public override string? ToString()
        {
            return $"ID: {this.Id}, First Name: {this.FirstName}, Last Name: {this.LastName}";
        }
    }
}
