namespace ComparerApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Product> products = new()
            {
                new Product("Milk", 2.2D, 50),
                new Product("Honey", 12.5D, 30),
                new Product("Honey", 12.5D, 12),
                new Product("Eggs", 4.5D, 50),
            };
            //products.ForEach(p => Console.WriteLine(p));
            //Console.WriteLine();

            //products.Sort();
            //products.ForEach(p => Console.WriteLine(p));
            //Console.WriteLine();

            //products.Sort((p1, p2) => (int)(p1.Price - p2.Price));
            //products.ForEach(p => Console.WriteLine(p));
            //Console.WriteLine();

            //products.Sort((p1, p2) => (int)(p1.Quantity - p2.Quantity));
            //products.ForEach(p => Console.WriteLine(p));
            //Console.WriteLine();

            //var sortedProducts =
            //    from Product in products
            //    orderby Product.Quantity
            //    select Product;

            //foreach (var item in sortedProducts)
            //{
            //    Console.WriteLine(item);
            //}

            //var honeyProducts =
            //    from Product in products
            //    where Product.Description!.Equals("Honey")
            //    select Product;

            //foreach (var item in honeyProducts)
            //{
            //    Console.WriteLine(item);
            //}

            //// Method Syntax
            //var milkProducts = products
            //    .Where(p => p.Description!.Equals("Milk"))
            //    .Select(p => p.Price);

            //foreach (var item in milkProducts)
            //{
            //    Console.WriteLine(item);
            //}

            //var sortedProductList = products
            //    .OrderBy(p => p.Price)
            //    .ThenBy(p => p.Description)
            //    .ThenByDescending(p => p.Quantity)
            //    .ToList();

            //foreach (var item in sortedProductList)
            //{
            //    Console.WriteLine(item);
            //}

            var sum = products
                .Where(p => p.Description!.Equals("Milk"))
                .Select(p => p.Quantity)
                .Sum();

            Console.WriteLine(sum);

        }
    }
}