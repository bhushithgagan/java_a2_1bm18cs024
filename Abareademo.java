import java.util.*;
abstract class Shape {
	int l,b;
	double area;
	/*Shape()
	{
	l=b=0;}
	 */              //optional as it is a default constructor 
    abstract  void printarea();
    abstract void input();
	}
class Rectangle extends Shape {
	Scanner sc = new Scanner (System.in);
	/*Rectangle() {
	super();
	} */         //optional feature to use constructors for inheritance 
	void input() {
		System.out.println ("Enter the Length and breadth: ");
		l = sc.nextInt();
		b = sc.nextInt();
		}
	void printarea() {
	area = l * b;
	System.out.println("Area: " + area);
	}
}

class Triangle extends Shape {
	Scanner sc1  = new Scanner(System.in);
	void input() {
		System.out.println ("Enter the breadth and height: ");
		b = sc1.nextInt();
		l = sc1.nextInt();
	}
	void printarea() {
	area  = 0.5 * b * l;
	System.out.println("Area: " + area);
	}
}

class Circle extends Shape {
	Scanner sc2 = new Scanner(System.in);
	void input() {
		System.out.println("Enter the Radius: ");
		l = sc2.nextInt();
	}
	void printarea() {
	area = 3.14*l*l;
	System.out.println("Area: " + area);
	}
}

class Abareademo {
	public static void main(String args[]) {
	int n;
	Scanner sc3 = new 
	Scanner(System.in);
	System.out.println("*** Enter the Your Choice ***");
	System.out.println("1 for Rectange\n2 for Triangle\n3 for circle\n");
	n = sc3.nextInt();
	Shape ref = null;
	if(n==1)
	ref = new Rectangle();
	else if (n==2)
	ref = new Triangle();
	else if(n==3)
	ref = new Circle();
	else
	System.out.println("INVALID ENTRY!\n");
	ref.input();
	ref.printarea();
}
}
