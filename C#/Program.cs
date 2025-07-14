using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class BankAccount
    {
        //account balance
        private double accountBalance;
        //deposit method
        public void deposit(double amount)
        {
            if (amount > 0)
            {
                accountBalance += amount;
                Console.WriteLine($"{amount}: Deposited successfully.\n New Account Balance: {accountBalance}");

            }
            else
            {
                Console.WriteLine("Amount too small for deposit");
            }
        }
        //getter for account balance
        
        public double getBalance()
        {
            return accountBalance;
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            BankAccount account = new BankAccount();
            account.deposit(14000.00);
            account.getBalance();
        }
    }
}
