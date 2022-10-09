using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ComparerApp
{
    internal class Product : IComparable<Product>
    {
        public string? Description { get; set; }
        public double Price { get; set; }
        public int Quantity { get; set; }

        public Product() { }

        public Product(string? description, double price, int quantity)
        {
            Description = description;
            Price = price;
            Quantity = quantity;
        }

        public int CompareTo(Product? other)
            => this.Description!.CompareTo(other!.Description);

        public override string? ToString()
            => $"{this.Description} {this.Price} {this.Quantity}";

    }
}
