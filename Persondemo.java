import java.util.*;
class Person {
String name, add;
int age;
Scanner sc = new Scanner(System.in);
void in () {
System.out.println("\n*** Enter Details ***\n");
System.out.println("Enter name:  ");
name = sc.next();
System.out.println("Enter age: ");
age = sc.nextInt();
System.out.println("Enter address: ");
add = sc.next();
}
void disp () {
System.out.println("\n*** Details ***\n");
System.out.println("Entered name:  " + name);
System.out.println("Entered age:  " + age);
System.out.println("Entered address:  " + add);
}
}

class Stud extends Person {
String roll;
int sem;
Scanner sc1 = new Scanner(System.in);
void in1() {
    in();
System.out.println("Enter Roll no. : ");
roll = sc.next();
System.out.println("Enter Semester : ");
sem = sc.nextInt();
}
void disp1() {
    disp();
System.out.println("Entered Roll no. :  " + roll);
System.out.println("Entered Semester :  " + sem);
}
}

class Exam extends Stud {
double m1,m2,avg;
Scanner sc2 = new Scanner(System.in);
void in2() {
    in1();
System.out.println("Enter Subject 1 marks:");
m1 = sc.nextDouble();
System.out.println("Enter Subject 2 marks:");
m2 = sc.nextDouble();
}
double av() {
avg = (m1+m2)/2;
return avg;
}
void disp3() {
    disp1();
System.out.println("Average marks of student =" + " " + avg);
}
}
class Persondemo {
public static void main (String args[]) {
int n;
//String top[] = new string();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of students: ");
n = sc.nextInt();
Exam ref[]=new Exam[n];
for(int i = 0;i<n;i++)
{

ref[i] = new Exam();
ref[i].in2();
ref[i].av();
ref[i].disp3();
}
}
}

