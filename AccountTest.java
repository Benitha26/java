class Account
{
	String name;
	protected double balance;
	Account(String str,double amt){
		name= str;
		balance=amt;
	}
	String getName()
	{
		return name;
	}
	double getBalance()
	{
		return balance;
	}
	void deposit(double amt)
	{
		balance += amt;
		System.out.println("depositing"+amt);
	}
	void withdraw(double amt)
	{
		balance -= amt;
		System.out.println("withdrawing "+amt);
	}
}
class SavingsAccount extends Account
{
	double interestRate;
	SavingsAccount(String str, double amt, double rate)
	{
		super(str,amt);
	interestRate=rate;
	}
}
class CheckingAccount extends Account
{
			double overDraft;
			CheckingAccount(String str, double amt)
			{
				super(str,amt);
			}
			CheckingAccount(String str,double amt, double draft)
			{
				super(str,amt);
				overDraft=draft;
			}
			void withdraw(double amt)
			{
				System.out.println("overDraft amount"+overDraft);
				if(amt<=balance)
				{
					balance -= amt;
					System.out.println("withdrawing"+amt);
				}
				else if((amt>balance) && (amt>(balance+overDraft)))
				{
					System.out.println("sorry! you cannot withdraw");
				}
				else{
					double result =amt-balance;
					overDraft -= result;
					balance = 0;
					
					System.out.println("withdrawing"+amt);
					System.out.println("Current overDraft amount"+overDraft);
				}
			}
}

					
public class AccountTest
{
public static void main (String[] args)
{
//SavingsAccount sAobj =new SavingsAccount("john",500,4);
Account a = new SavingsAccount("john",500,4);
System.out.println("\n Savings Account details");
System.out.println("----------------------");
System.out.println(""+a.getName()+"has an initial balance of:"+a.getBalance());
a.deposit(200);
a.withdraw(200);
System.out.println(""+a.getName()+"at the end of transaction has a balance of "+a.getBalance());

System.out.println("\n checking account details");
System.out.println("----------------------");
CheckingAccount cAobj = new CheckingAccount("Stephen",200,200);
System.out.println("\n Savings Account details");
System.out.println("----------------------");
System.out.println(""+cAobj.getName()+"has an initial balance of:"+cAobj.getBalance());
cAobj.deposit(200);
cAobj.withdraw(500);
System.out.println(""+cAobj.getName()+"at the end of transaction has a balance of "+cAobj.getBalance());
}
}