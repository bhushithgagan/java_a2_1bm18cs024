import java.util.*;
class Stud{

int m[] = new int[n];
int gp[] = new int[n];
int cred[] = new int[n];
String name,usn;
int n,i;

void Input(){
Scanner sc = new Scanner(System.in);
System.outln("Enter the Student name ");
name = sc.next();
System.outln("Enter the number of subjects");
n = sc.nextInt();
System.outln("Enter the Student USN");
usn = sc.next();
for(int i = 0;i<n;i++)
{
System.outln("Enter the Student Marks");
m[i] = sc.nextInt();
System.outln("Enter the credits");
cred[i] = sc.nextInt();
}

}

void Cal(){
for (i = 0;i<n;i++)
{
if (m[i]>=90 && m[i]<=100)
gp=10;
else if (m[i]>=75 && m[i]<90)
gp=9;
else if (m[i]>=60 && m[i]<75)
gp = 8;
else if (m[i]>=50 && m[i]<60)
gp = 7;
else if (m[i]>=40 && m[i]<50)
gp = 6;
else gp = 0;
}

sgpa = gp*cred[i]/
}

void Output(){
System.outln("Student name " + name);
System.outln("Student usn" + usn);
System.outln("SGPA" + sgpa);
}

class StudDemo(){
public static void main(){

Stud ob = new Stud();

ob.Input();
ob.Cal();
ob.Output();
}
}



