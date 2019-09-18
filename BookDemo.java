//Program using toString() 

import java.util.*;
class Book{
	String bname;
	String bau;
	int pr;
	int pa;
	void Set(String bname, String bau, int pr,int pa){
		this.bname = bname;
		this.bau = bau;
		this.pr = pr;
		this.pa = pa; 
	}


	public String toString() {
		String s = ("\nBook Name: "+ bname + "\nName of Author:" + " " + bau + "\nPrice:" + " " + pr + "\nNumber of pages:" + " " + pa ) ;
		//String s1 = ( "\nName of Author:" + " " + bau );
		//String s2 =  ("\nPrice:" + " " + pr);
		//String s3 =  ( "\nNumber of pages:" + " " + pa);
		return (s);
	}
}
class BookDemo{
	public static void main(String args[]){
		String bname;
		String bau;
		int pr;
		int pa,i;
		System.out.println("Enter the number of books");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		Book a[] = new Book[n];
		for (i = 0;i<n;i++)
		{
			a[i] = new Book();
			System.out.println("Enter the name of the book " + (i+1) + " :");
			bname = sc.next();
			System.out.println("Enter the name of the Author:");
			bau = sc.next();
			System.out.println("Enter the price of the book:");
			pr = sc.nextInt();
			System.out.println("Enter the number of pages:");
			pa = sc.nextInt();
			a[i].Set(bname,bau,pr,pa);
		}
		System.out.println("*** Book Details are : ***");
		
		for (i= 0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}

