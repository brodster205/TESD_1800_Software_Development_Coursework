import java.util.Scanner;
class testAccount2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account[] account = {
				new Account(0, 100.00),
				new Account(1, 100.00),
				new Account(2, 100.00),
				new Account(3, 100.00),
				new Account(4, 100.00),
				new Account(5, 100.00),
				new Account(6, 100.00),
				new Account(7, 100.00),
				new Account(8, 100.00),
				new Account(9, 100.00)
			};
		boolean loop = true;
		int id;
		int choice = 0;
		double take;
		double give;
		while (loop != false){
			System.out.print("Enter an id: ");
			id = input.nextInt();
			if (id >= 10){
				System.out.println("Id is incorrect, please enter correct Id");
				boolean inccorect = true;
				while (inccorect != true){
					if (inccorect = true){
						id = input.nextInt();
						inccorect = true;
					}
					else{
						inccorect = false;
					}
				}
			}
			else{
			while (choice != 4){
				System.out.println("Main Menu \n 1: check balance \n 2: withdraw \n 3: deposit \n 4: exit");
				System.out.print("Enter a choice: ");
				choice = input.nextInt();
				if (choice == 1){
					System.out.println("Your balance is: " + account[id].getBalance());
					loop = true;
				}
				else if (choice == 2){
					System.out.print("Enter amount to withdraw: ");
					take = input.nextDouble();
					double newWithdraw = account[id].withdraw(take);
					account[id].setBalance(newWithdraw);
					loop = true;
				}
				else if (choice == 3){
					System.out.println("Enter amount to deposit: ");
					give = input.nextDouble();
					double newDeposit = account[id].deposit(give);
					account[id].setBalance(newDeposit);
					loop = true;
				}
				else if (choice == 4){
					loop = false;
				}
				loop = false;
			}
			}
			
		}
	}
}
class Account{
	Scanner input = new Scanner(System.in);
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
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



