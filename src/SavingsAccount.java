
public class SavingsAccount {

	//data fields to store data
	private double balance;
	private double interestrate;
	public int totalWithdrawl;
	public int totalDeposit;
	
	//a constructor that takes the Annual Interest Rate and the starting Balance
	public SavingsAccount(double balance, double interestrate){this.balance = balance; this.interestrate = interestrate;}
	
	//a method that returns the balance
	public double getBalance() {return balance;}
	//a method that subtracts the withdrawal amount and returns the balance
	public double withdrawal(double ammount) {balance -= ammount; if(ammount > 0) {totalWithdrawl+= 1;} return balance;}
	
	//a method that adds the deposit amount and returns the balance
	public double deposit(double ammount) {balance += ammount; if(ammount > 0){totalDeposit +=1;} return balance;}
	
	//a method that adds the monthly interest to the balance and returns the balance
	public double addMonthInterest() {
		double monthlyinterestrate = interestrate/12; 
		double ammounttoadd = balance * monthlyinterestrate;
		balance += ammounttoadd;
		return balance;}
	
}
