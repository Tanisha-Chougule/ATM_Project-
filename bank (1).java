class bank 
{
	String name;
	long acNo;
	private double balance;
	private int pin;
	bank(String name,long acNo, double balance,int pin){
		this.name=name;
		this.acNo=acNo;
		this.balance=balance;
		this.pin=pin;
	}
	public double getBalance(){
		return this.balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public int getPin(){
		return this.pin;
	}
	public void setPin(int pin){
		this.pin=pin;
	}
	public void getDetails(){
		System.out.println("Details of customer");
		System.out.println("Name :"+name+"\nAccount number :"+acNo+"\nBalance :"+balance);
	}
}
