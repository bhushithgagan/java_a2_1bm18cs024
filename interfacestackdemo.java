import java.util.*;
interface  Stack {
	void push();
	void pop();
	}
	
class Stk implements Stack {
	Scanner sc = new Scanner(System.in);
	int t=-1,ele,n;
	System.out.println("Enter the size of Stack: ");
	n = sc.nextInt();
	int[] s = new int[n];
	public void push() {	
	for(int i = 0; i<n; i++) {
		System.out.println("Enter the " + (i+1) + "Element: " );
	    ele = sc.nextInt();
	    s[t+1] = ele;	
	    }
	   }
	public void pop() {
	if (t == n-1)
	{
	System.out.println("Stack Empty!\n);
	return;
	}
	ele = s[t];
	s[t--];
	}
   public void display() {
   for(int i = t;i>0;i--) {
   System.out.println(s[i]"\n");
   }
  }
  
class Stacktest implements Stack extends Stk {
	if (t==n-1)
	n = n * 2;
	int[] t = new int[n];
	public void push() {
 	for (int i = t;i>0;i--) {
 	t[i] = s[i];
 	s = t ;
    s[t++] = ele;
 	}
	super.display();
   }
}   

class Interfacestackdemo {
	Stack ref=null;
	ref = new Stk();
	ref.push();
	
