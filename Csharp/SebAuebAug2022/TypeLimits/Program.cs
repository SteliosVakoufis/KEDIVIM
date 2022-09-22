namespace TypeLimits
{
    internal class Program
    {
        /// <summary>
        /// Prints the limits of primitive types!!
        /// int, byte, short, long, bool, float, double, decimal
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {
            Console.WriteLine($"int: {sizeof(int) * 8} bits\t{int.MinValue} {int.MaxValue}");
            Console.WriteLine($"byte: {sizeof(byte) * 8} bits\t{byte.MinValue} {byte.MaxValue}");
            Console.WriteLine($"sbyte: {sizeof(sbyte) * 8} bits\t{sbyte.MinValue} {sbyte.MaxValue}");
            Console.WriteLine($"short: {sizeof(short) * 8} bits\t{short.MinValue} {short.MaxValue}");
            Console.WriteLine($"ushort: {sizeof(ushort) * 8} bits\t{ushort.MinValue} {ushort.MaxValue}");
            Console.WriteLine($"long: {sizeof(long) * 8} bits\t{long.MinValue} {long.MaxValue}");
            Console.WriteLine($"ulong: {sizeof(ulong) * 8} bits\t{ulong.MinValue} {ulong.MaxValue}");
            Console.WriteLine($"float: {sizeof(float) * 8} bits\t{float.MinValue} {float.MaxValue}");
            Console.WriteLine($"double: {sizeof(double) * 8} bits\t{double.MinValue} {double.MaxValue}");
            Console.WriteLine($"decimal: {sizeof(decimal) * 8} bits\t{decimal.MinValue} {decimal.MaxValue}");
            Console.WriteLine($"char: {sizeof(char) * 8}");
            Console.WriteLine($"bool: {sizeof(bool) * 8}");
        }
    }
}
