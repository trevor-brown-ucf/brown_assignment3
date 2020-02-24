
public class SavingsAccount								// "Create class SavingsAccount"
{
        static private double annualInterestRate;		// "Use a static variable annualInterestRate to store the annual interest rate for all account holders"
        private double savingsBalance;					// "Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently has on deposit"

        public void calculateMonthlyInterest()									// "Provide method calculateMonthlyInterest to calculate the monthly interest... "
        {
                double monthlyI;
                monthlyI= (double)(this.savingsBalance*annualInterestRate/12);	// "... by multiplying the savingsBalance by annualInterestRate divided by 12"
                this.savingsBalance+=monthlyI;									// "this interest should be added to savingsBalance"
        }
        
        public static void modifyInterestRate(double newInterestRate)			// "Provide a static method modifyInterestRate that sets the annualInterestRate to a new value."
        {
                annualInterestRate=newInterestRate;
        }
        
        public SavingsAccount(double savingBalance)		// Account constructor
        {
                this.savingsBalance=savingBalance;
        }

        public double getSavingBalance()				// method to read the balance
        {
                return this.savingsBalance;
        }
}
