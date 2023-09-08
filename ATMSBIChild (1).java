import java.util.*;

class ATMSBIChild implements ATMSBI {
	Scanner sc = new Scanner(System.in);

	public void withdraw(bank b) {
		boolean con = true;
		while (con) {
			System.out.println("enter the pin :");
			int pin = sc.nextInt();
			if (b.getPin() == pin) {
				System.out.println("enter amount tobe withdraw :");
				double amount = (double) sc.nextInt();
				double myAccountBalance = b.getBalance();

				if (myAccountBalance >= amount) {
					b.setBalance(b.getBalance() - amount);
					System.out.println("Your transaction of Rs." + amount + " is successsful");
					con = false;
				} else {
					System.out.println("Insufficient funds");
				}
			} else {
				System.out.println("entered wrong pin");
			}
		}
	}

	public void deposit(bank b) {
		boolean con = true;
		while (con) {
			System.out.println("enter the pin :");
			int pin = sc.nextInt();
			if (b.getPin() == pin) {
				System.out.println("enter amount to be deposited :");
				int amount = sc.nextInt();
				b.setBalance(b.getBalance() + amount);
				System.out.println("Your transaction of Rs." + amount + " credited to account number " + b.acNo);
				System.out.println("Your current account balance is " + b.getBalance());
				con = false;
			} else {
				System.out.println("entered wrong pin");
			}
		}
	}

	public void checkBalance(bank b) {
		boolean con = true;
		while (con) {
			System.out.println("enter the pin :");
			int pin = sc.nextInt();
			if (b.getPin() == pin) {
				System.out.println("Your account balance is " + b.getBalance());
				con = false;
			} else {
				System.out.println("entered wrong pin");
			}
		}
	}

	public void changePin(bank b) {
		boolean con = true;
		while (con) {
			System.out.println("enter the pin :");
			int pin = sc.nextInt();
			if (b.getPin() == pin) {
				boolean c2 = true;
				while (c2) {
					System.out.println("enter your old pin");
					int oldPin = sc.nextInt();
					if (oldPin == b.getPin()) {
						System.out.println("enter new pin :");
						int newPin = sc.nextInt();
						System.out.println("re-enter new pin :");
						int newPin1 = sc.nextInt();
						if (newPin == newPin1) {
							b.setPin(newPin);
							System.out.println("pin successfully changed");
							c2 = false;
							con = false;
						} else {
							System.out.println("new pin and re-enter pin are not matching");
						}
					} else {
						System.out.println("old pin is not matching");
					}
				}
			} else {
				System.out.println("entered wrong pin");
			}
		}
	}

	public void Details(bank b) {
		boolean con = true;
		while (con) {
			System.out.println("enter the pin :");
			int pin = sc.nextInt();
			if (b.getPin() == pin) {
				b.getDetails();
				con = false;
			} else {
				System.out.println("entered wrong pin");
			}
		}
	}
}
