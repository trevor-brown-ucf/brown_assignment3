
public class SavingsAccountTest 
{
	public static void main(String[] args) 
	{
		SavingsAccount saver1, saver2; 							// "Instantiate two SavingsAccount objects, saver1 and saver2"
		saver1 = new SavingsAccount (2000.0);					// "with balances of $2000.00"
		saver2 = new SavingsAccount (3000.0);					// "and $3000.00"

		System.out.println("Rate of 4%\n");
		SavingsAccount.modifyInterestRate (0.04);				// "Set annualInterestRate to 4%"
		
		System.out.println("\tSaver 1");
		for(int i=0; i<12; i++) 								// "then calculate the monthly interest for each of 12 months and print the monthly balances for both savers"
		{
			saver1.calculateMonthlyInterest();       
			System.out.println("Month " + (i+1)+": \t$"+ String.format("%.2f",saver1.getSavingBalance()));
		}
		
		System.out.println("\n\tSaver 2");
		for(int i=0; i<12; i++) 
		{
			saver2.calculateMonthlyInterest();
			System.out.println("Month " + (i+1)+": \t$"+ String.format("%.2f",saver2.getSavingBalance()));
		}

		System.out.println("\n\nChanging rate to 5%\n");
		SavingsAccount.modifyInterestRate(0.05);				// "Next, set the annualInterestRate to 5%"
		
		System.out.println("\tSaver 1");
		for(int i=0; i<12; i++) 								// "calculate the next month’s interest and print the new balances for both savers."
		{
			saver1.calculateMonthlyInterest();            
			System.out.println("Month " + (i+1)+": \t$"+ String.format("%.2f",saver1.getSavingBalance()));
		}
		
		System.out.println("\n\tSaver 2");
		for(int i=0; i<12; i++) 
		{
			saver2.calculateMonthlyInterest();
			System.out.println("Month " + (i+1)+": \t$"+ String.format("%.2f",saver2.getSavingBalance()));
		}
	}
}
