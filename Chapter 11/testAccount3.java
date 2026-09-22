import java.util.Scanner;
import java.time.LocalDateTime;
class testAccount3 {
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  Account account = new Account(1122, 20000);
  System.out.println("The account details for this account.");
  System.out.print("What is the annual interest rate. ");
  double interestRate = input.nextDouble();
  double findInterestRate = account.setAnnualInterestRate(interestRate);
  String accountDetails = account.toString();
  System.out.println(accountDetails);
  System.out.println("The account details for this checking account.");
  CheckingAccount checkingAccount = new CheckingAccount(-500);
  String checkingAccountDetails = checkingAccount.checkingToString(-500);
  System.out.println(checkingAccountDetails);
  System.out.println("The account details for this savings account.");
  SavingsAccount savingsAccount = new SavingsAccount(0);
  String SavingsAccountDetails = savingsAccount.savingsToString(0);
  System.out.println(SavingsAccountDetails);
 }
}
class Account{
 private int id = 0;
 private double balance = 0;
 private double annualInterestRate = 0;
 private final LocalDateTime dateCreated = LocalDateTime.now();
 Account(){

 }
 Account(int id, double balance){
     this.id = id;
     this.balance = balance;
 }
 public int getId(){
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
 public double getAnnualInterestRate(double annualInterestRate){
     return this.annualInterestRate;
 }
 public double setAnnualInterestRate(double annualInterestRate){
    this.annualInterestRate = annualInterestRate;
    return annualInterestRate;
 }
 public LocalDateTime dateCreated(){
     return this.dateCreated;
 }
 public double getMonthlyInterestRate(){
     return annualInterestRate / 12;
 }
 public double getMonthlyInterest(){
     return balance * (getMonthlyInterestRate() / 100);
 }
 public double getWithdraw(double take){
     return balance - take;
 }
 public double getDeposit(double give){
     return balance + give;
 }
 public String toString(){
     return "The account id is " + getId() + ", balance is " + getBalance() + ", annual interest rate is " + getAnnualInterestRate(annualInterestRate) + ", and the date of creation is " + dateCreated();
 }
}
class CheckingAccount extends Account{
private double overdraftLimit;
public CheckingAccount(){

}
public CheckingAccount(double overdraftLimit){
    this.overdraftLimit = overdraftLimit;
}
public double getOverdraftLimit() {
    return this.overdraftLimit;
}
public void setOverdraftLimit(double overdraftLimit){
    
}
public String checkingToString(double overdraftLimit){
  return "The id of this checking account is " + 1123 + ", the balance is " + 20000 + ", and the overdraft limit is " + overdraftLimit;
}
}
class SavingsAccount extends Account{
private double limit = 0;
public SavingsAccount(){

}
public SavingsAccount(double limit){
  this.limit = limit;
}
public double getLimit(){
    return this.limit;
}
public void setLimit(){

}
public String savingsToString(double limit){
  return "The id of this Savings account is " + 1124 + ", the balance is " + 20000 + ", and the limit is " + limit;
}
}