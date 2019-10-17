import java.util.*;
abstract class Solid {
	double h,r,area,volume;
	abstract void input();
	abstract void area();
	abstract void volume();
	}

class Cylinder extends Solid {
	Scanner sc = new Scanner(System.in);
	void input() {
	System.out.println("Enter the radius and height: \n");
	r = sc.nextDouble();
	h = sc.nextDouble();
	}
	void area() {
	area = (2*3.14*r*h) + (3.14*r*r);
	System.out.println("Area of Cylinder: " + area);
	}
	void volume() {
	volume = 2*3.15*r*h;
	System.out.println("Volume of Cylinder: " + volume);
	}
}

class Sphere extends Solid {
	Scanner sc = new Scanner(System.in);
	void input() {
	System.out.println("Enter the radius: \n");
	r = sc.nextDouble();
	}
	void area() {
	area = 4*3.14*r*r;
	System.out.println("Area of Sphere: " + area);
	}
	void volume() {
	volume = 1.33*3.14*r*r*r;
	System.out.println("Volume of Sphere: " + volume);
	}
}


class Cone extends Solid {
	Scanner sc = new Scanner(System.in);
	void input() {
	System.out.println("Enter the radius and height: \n");
	r = sc.nextDouble();
	h = sc.nextDouble();
	}
	void area() {
	area = (3.14*r)*(r+(Math.sqrt(h*h))+r*r);
	System.out.println("Area of Cone: " + area);
	}
	void volume() {
	volume = (3.14*r*r)*(h/3);
	System.out.println("Volume of Cone: " + volume);
	}
}	
	
class Soliddemo {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter :\n1 for Cylinder\n2 for Sphere\n3 for Cone \n");
	int n = sc.nextInt();
	Solid ref = null;
	if(n==1)
	ref = new Cylinder();
	else if(n==2)
	ref = new Sphere();
	else if(n==3)
	ref = new Cone();
	else
	System.out.println("\nINVALID ENTRY!\n");
	ref.input();
	ref.area();
	ref.volume();
	}
}

	
	
	
	
	
	
	
