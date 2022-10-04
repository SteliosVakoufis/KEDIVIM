namespace BankApp.Exceptions
{
    internal class NegativeAmountException : Exception
    {
        public NegativeAmountException(String s) : base(s) { }
    }
}
