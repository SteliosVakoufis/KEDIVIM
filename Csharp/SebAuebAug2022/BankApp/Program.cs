using BankApp.Model;

namespace BankApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var account = new Account()
            {
                Id = 1,
                Iban = "GR123",
                FirstName = "Alice",
                LastName = "Wadabanka",
                Ssn = "A1267",
                Balance = 1000M
            };
            Console.WriteLine(account);

            try
            {
                account.Withdraw(10000M);
                Console.WriteLine(account);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
                throw;
            }
        }
    }
}