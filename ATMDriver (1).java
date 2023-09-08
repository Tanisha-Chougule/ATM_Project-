import java.util.*;
class ATMDriver 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		bank c1=new bank("Tanisha",4797,2000.0,7777);
		ATMSBI a=new ATMSBIChild();
		boolean b=true;
		while(b){
			System.out.println("enter 1 for withdraw \nenter 2 for deposit \nenter 3 for check balance \nenter 4 for change pin \nenter 5 for check customer details");
			int op=sc.nextInt();
			switch(op){
				case 1:
					a.withdraw(c1);
					break;
				case 2:
					a.deposit(c1);
					break;
				case 3:
					a.checkBalance(c1);
					break;
				case 4:
					a.changePin(c1);
					break;
				case 5:
					a.Details(c1);
					break;
				default:
					System.out.println("choose correct option");
					break;
			}
			System.out.println("do you want to continue the operations then press 1 if want to exit then press 0 :");
			int v=sc.nextInt();
			if(v!=1){
				b=false;
			}
		}
	}
}
