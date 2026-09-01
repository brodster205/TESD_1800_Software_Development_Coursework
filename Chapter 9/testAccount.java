import java.util.Scanner;
import java.time.LocalDateTime;
class testAccount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account account = new Account(1122, 20000);
		System.out.println("The initial balance of the account is $20,000");
		System.out.print("How much would you like to withdraw? ");
		double take = input.nextDouble();
		double newWithdraw = account.withdraw(take);
		System.out.println("You are withdrawing: $" +newWithdraw);
		System.out.print("How much would you like to deposit ");
		double give = input.nextDouble();
		double newDeposit = account.deposit(give);
		System.out.println("you are depositing: $" +newDeposit);
		double initialBalance = account.getBalance();
		System.out.println("\tThe new balance is " +account.getBalance()+ "the monthly interest is " +account.getMonthlyInterest()+ "the date the account was created " + account.dateCreated());
	}
}
class Account{
	Scanner input = new Scanner(System.in);
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private final LocalDateTime dateCreated = LocalDateTime.now();
	Account(){
		
	}
	Account(int newId, double initialBalance){
		id = newId;
		balance = initialBalance;
	}
	
	public double getId(){
		return this.id;
	}
	public void setId(double id){
		
	}
	public double getBalance(){
		return this.balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getAnnualInterestRate(){
		annualInterestRate = input.nextDouble();
		return this.annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		
	}
	public LocalDateTime dateCreated(){
		return this.dateCreated;
	}
	double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	double getMonthlyInterest(){
		return balance * (getMonthlyInterestRate() / 100);
	}
	double withdraw(double take){
		return balance - take;
	}
	double deposit(double give){
		return balance + give;
	}
}

