package entities;

public class Client {
	private int account;
	private String name;
	private double money;

	public Client(int account, String name) {
		this.account = account;
		this.name = name;
	}
	public Client(int account, String name, double initialDeposit) {
		this.account = account;
		this.name = name;
		addValue(initialDeposit);
	}
	public int getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void addValue(double money) {
		 this.money += money;
	}

	public void removeValue(double money) {
		 this.money -= money + 5;
	}

	public String ToString() {
		return "Account " 
				+ getAccount() 
				+ ", Holder: " 
				+ getName() 
				+ ", Balance: $ "
				+ String.format("%.2f", getMoney()) 
				+ "\n";

	}
}
