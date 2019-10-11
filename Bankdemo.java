import java.util.*;
class Bank {
	Scanner sc = new Scanner(System.in);
	final double rate = 0.03;
	final double balc = 1000;
	int accno,acctype;
	double amt,bal,intrst,amtw,temp,tot;
	String name;
	void input() {
		
		System.out.println(" *** Enter Account Details *** \n");
		System.out.println("Enter Name: ");
		name = sc.next();
		System.out.println("Enter Account Number: ");
		accno = sc.nextInt();

		}
	void deposit() {
		System.out.println("Enter Amount to be deposited: "); 
		amt = sc.nextDouble();
		bal = amt;
		}
	//abstract void Withdrawal();
	void display() {
		System.out.println("Name: " + name + "\nAccount Number: " + accno );
		}
		void Withdrawal() {}
		void intrst() {}
}
	
class Savings extends Bank { 
	Scanner sc1 = new Scanner(System.in);
	void Withdrawal () {
		System.out.println("Enter Amount to be withdrawn: ");
		amtw = sc1.nextDouble();
		if(amtw>=amt)
		bal = amt - amtw;
		else 
		System.out.println("Insufficient balance for withdrawal!");
		}
	void intrst(){
	System.out.println("Enter Time Duration: ");
	int time = sc1.nextInt();
	intrst = bal * Math.pow(((1+rate)/100),time);
	tot = bal + intrst;
	System.out.println("Total Balance: " + tot);
	super.display();
	}
	
}

class Current extends Bank {
	Scanner sc2 = new Scanner (System.in);

	void Withdrawal() {
		System.out.println("Enter withdrawal amount: ");
		amtw = sc2.nextDouble();
		temp = bal - amtw;
		if(temp<=1000)
		System.out.println("Insufficient Minimum to withdraw! ");
		bal = bal - amt;
		}
	void intrst() {
		if(bal<1000){
		bal = bal - 400;
		System.out.println("Balance: " + bal);
			}
		super.display();
		}
		
}

class Bankdemo {
	public static void main (String args[]) {
	Scanner sc4 = new Scanner (System.in);
	Bank ref=null;
	Bank ob = new Bank();
	int acctype;
	System.out.println("Enter Account Type:\n1 for Savings \n2 for Current ");
	acctype = sc4.nextInt();
	if(acctype == 1)
	ref = new Savings();
	else if (acctype == 2)
	ref = new Current();
	else
	System.out.println("INVALID ENTRY! ");
	ob.input();
	ob.deposit();	
	ref.Withdrawal();
	ref.intrst();
	//ob.display();
	}
} 
	
