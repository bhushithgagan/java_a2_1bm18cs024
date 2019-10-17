import java.util.*;
abstract class Series {
	int n,a,r,d;
	double ap,gp;
	abstract void input();
	abstract void aorg();
}

class Ap extends Series{
	Scanner sc = new Scanner(System.in);
	void input() {
	System.out.println("Enter the values of n,a and d:\n");
	n =  sc.nextInt();
	a = sc.nextInt();
	d = sc.nextInt();
	}
	
	void aorg() {
	ap = (n/2)*((2*a)+((n-1)*d));
	System.out.println("Arithmetic Progression is: "+ ap);
	}
}

class Gp extends Series{
	Scanner sc = new Scanner(System.in);
	void input() {
	System.out.println("Enter the values of n,a and r:\n");
	n =  sc.nextInt();
	a = sc.nextInt();
	r = sc.nextInt();
	}
	
	void aorg() {
	gp = (a*(Math.pow(r,n))-1)/(r-1);
	System.out.println("Geometric Progression is: "+ gp);
	}
}

class Seriesdemo{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter:\n1 for AP\n2 for GP\n");
	int n = sc.nextInt();
	Series ref = null;
	if(n==1)
	ref = new Ap();
	else if(n==2)
	ref = new Gp();
	else
	System.out.println("\nINVALID ENTRY!\n");
	ref.input();
	ref.aorg();
	}
}
	
	
	
	
	
	
	
	
	
	
	

