using BankApp.Exceptions;

namespace BankApp.Model
{
    internal class Account
    {
        public long Id { get; set; }
        public String? Iban { get; set; }
        public String? FirstName { get; set; }
        public String? LastName { get; set; }
        public String? Ssn { get; set; }
        public decimal Balance { get; set; }

        public override string ToString() =>
            $"ID: {this.Id} " +
            $"Iban: {this.Iban} " +
            $"First Name: {this.FirstName} " +
            $"Last Name: {this.LastName} " +
            $"SSN: {this.Ssn} " +
            $"Balance: {this.Balance}";

        public Account() { }

        public Account(long id, string? iban, string? firstName, string? ssn, decimal balance)
        {
            Id = id;
            Iban = iban;
            FirstName = firstName;
            Ssn = ssn;
            Balance = balance;
        }
        public void Deposit(decimal amount)
        {
            try
            {
                if (amount > 0)
                {
                    this.Balance += amount;
                }
                else
                {
                    throw new NegativeAmountException("OOPS!");
                }
            }
            catch (Exception e)
            {
                Logger(e);
                throw;
            }
        }
        public void Withdraw(decimal amount)
        {
            try
            {
                if (amount <= this.Balance)
                {
                    this.Balance -= amount;
                }
                else
                {
                    throw new InsufficienBalanceException("WOOPS!!!");
                }
            }
            catch (Exception e)
            {
                Logger(e);
                throw;
            }
        }

        private static void Logger(Exception e)
        {
            const String PATH = "./../../../Logs/";
            FileStream fs = new FileStream(PATH + "logs.txt", FileMode.Append);
            StreamWriter sw = new(fs);

            sw.AutoFlush = true;
            sw.WriteLine($"{DateTime.Now:dd/MM/yyyy HH:mm:ss} {e}");
        }
    }
}
