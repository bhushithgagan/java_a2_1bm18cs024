import java.util.*;
class Empdet{
String empname;
int empid;
double basic,da,it,netsal;

void Input()
{
System.out.println("Enter the details of employee");
Scanner sc = new Scanner(System.in);
System.out.println("Employee id");
empid = sc.nextInt();
System.out.println("Employee name");
empname = sc.next();
System.out.println("Basic Salary");
basic = sc.nextDouble();
}

void Cal()
{
da = (0.75*basic);
it = (0.30*basic);
netsal = (basic + da - it);
System.out.println("Net Salary =" + " " + netsal);
}

void Output()
{
System.out.println("Employee Details are");
System.out.println("Basic Salary:" + " " + basic + "\nDA:" + " " + da + "\nIT:" + " " + it + "\nNet salary:\n" + " " + netsal);
}
}

class Empdetdemo{
public static void main(String args[]){
Empdet ob = new Empdet();
Scanner s = new Scanner(System.in);
System.out.println("Enter the number of employees");
int n = s.nextInt();
for(int i=0;i<n;i++)
{
ob.Input();
ob.Cal();
ob.Output();
}
}
}


