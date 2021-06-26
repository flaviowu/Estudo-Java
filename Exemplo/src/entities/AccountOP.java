package entities;

public class AccountOP {
	
	private int number;
	private String name;
	private double balance;
	
	public AccountOP(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public AccountOP(int number, String name, double deposit) {
		this.number = number;
		this.name = name;
		addBalance(deposit);
	}
	
	public void addBalance(double deposit) {
		balance += deposit;
	}
	
	public void subBalance(double withdraw) {
		balance = balance - withdraw - 5.0;	
		}
	
	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ name
				+", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
