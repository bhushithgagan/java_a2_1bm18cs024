import java.util.*;
class Student {
String usn,name;
int sem;
double sgpa;
void Input() {
Scanner sc = new Scanner(System.in);
System.out.println("** Enter Student Details ***\n");
System.out.println("Enter the name:\n");
name = sc.next();
System.out.println("Enter the USN:\n");
usn = sc.next();
System.out.println("Enter the Semester:\n");
sem = sc.nextInt();
}
}

class Test extends Student {
	Scanner sc = new Scanner(System.in);
	int sub[];
	int cre[];
	public int s;
	void Input() {
		super.Input();
	System.out.println("Enter the number of subjects:\n");
	s = sc.nextInt();
	 sub = new int[s];
	 cre = new int[s];
	for(int i=0;i<s;i++)
		{
		System.out.println("Enter the marks of subject" + " " + (i+1) 	
				+"and credits respectively\n");
		sub[i]=sc.nextInt();
	cre[i]=sc.nextInt();
		}
	}
}

class Exam extends Test {
Scanner sc = new Scanner(System.in);
int subsee[];
void Input() {
super.Input();
  subsee = new int[s];
for(int i=0;i<s;i++)
{
System.out.println("Enter the SEE marks of subject" + " " + (i+1)+ " " + "out of 50:");
subsee[i]=sc.nextInt();
}
}
}

class Result extends Exam {
void Res() {
	super.Input();
	int credsum=0,gtotal=0;;
	int total[] = new int[s];
	int gp[] = new int[s];
	for(int i=0;i<s;i++)
		{
			credsum+=cre[i];
			total[i] = sub[i] + subsee[i];

			if(total[i]>90 && total[i]<=100)
				gp[i] = 10;
			else if(total[i]>75 && total[i]<=89)
				gp[i] = 9;
			else if(total[i]>60 && total[i]<=74)
				gp[i] = 8;
			else if(total[i]>40 && total[i]<=59)
				gp[i] = 7;
			else 
				gp[i] = 0;


			gtotal= gtotal + (gp[i] * cre[i]);
		}
sgpa = (double)gtotal/credsum;
void Output() {
System.out.println("*** ENTERED STUDENT DETAILS***\n");
System.out.println("Name:" + name + " " + "\nUSN:" + " " + usn + "\nSemester:" + " " + sem + "\nSGPA: " + " " + sgpa);
}

}
}

class StudentDemo1 {
public  static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter the number of students:\n");
n = sc.nextInt();
Result ob = new Result(); 
Student ob2 = new Student();
for(int i=0;i<n;i++)
{
ob.Res();
ob2.Output();
}
}
}
