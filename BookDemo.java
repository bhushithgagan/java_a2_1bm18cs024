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
		String s = ("Book Name: "+ bname);
		String s1 = ("Name of Author:" + " " + bau );
		String s2 =  (" Price:" + " " + pr);
		String s3 =  ("Number of pages:" + " " + pa);
		return (s+bname+s1+bau+s2+pr+s3+pa);
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
			System.out.println("Enter the name of the book:");
			bname = sc.next();
			System.out.println("Enter the name of the Author:");
			bau = sc.next();
			System.out.println("Enter the price of the book:");
			pr = sc.nextInt();
			System.out.println("Enter the number of pages:");
			pa = sc.nextInt();
			a[i].Set(bname,bau,pr,pa);
		}
		System.out.println("Book Details are :");
		for (i= 0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
