import java.util.*;
class Time{
int h,m,s;
Time(){
h=0;
m=0;
s=0;
}
Time(int a,int b,int c){
h=a;
m=b;
s=c;
}
void Advance(){
h+=1;
m+=1;
s+=1;
while(s>=60){
m+=1;
s-=60;
}
while(m>=60){
h+=1;
m-=60;
}
while(h>=12){
h-=12;
}
}
void Reset(int a,int b,int c){
h=a;
m=b;
s=c;
}
void CurrentTime(int a,int b,int c){
h=a;
m=b;
s=c;
}
void Print(){
h=a;
m=b;
s=c;
}

class TimeDemo{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
Time ob = new Time();
System.out.println("Enter 1 for entering current time\n 2 for Advancing time \n 3 for resetting");
int x = sc.nextInt();
switch(x)
{
case 1: System.out.println("Enter the current time");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       ob.CurrentTime(a,b,c);
       break;
       
case 2: System.out.println("Enter the time for advancing");
       int h = sc.nextInt();
       int m = sc.nextInt();
       int s = sc.nextInt();
       ob.Advance();
       break;
       
case 3: System.out.println("Time to reset from 0");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       ob.Reset(a,b,c);
       break;
default: System.out.println("INVALID ENTRY");
}
ob.Print();
}
}
