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
void Advance(int a,int b,int c){
h+=a;
m+=b;
s+=c;
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
void Reset(int x,int y,int z){
h=x;
m=y;
s=z;
}
void CurrentTime(int a,int b,int c){
h=a;
m=b;
s=c;
}
void Print(){
System.out.println(" Time after advancing"+" "+h+" "+m+" "+s);
}
}

class TimeDemo{
public static void main(String args[]){

Scanner sc = new Scanner (System.in);
Time ob = new Time();
System.out.println("Enter 1 for entering current time\n 2 for Advancing time \n 3 for resetting");
int k = sc.nextInt();
switch(k)
{
case 1: System.out.println("Enter the current time");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       ob.CurrentTime(a,b,c);
       break;
       
case 2:System.out.println("Enter the current time");
       int e = sc.nextInt();
       int f = sc.nextInt();
       int g = sc.nextInt();
       ob.CurrentTime(e,f,g);
        
       System.out.println("Enter the time for advancing");
       int h = sc.nextInt();
       int m = sc.nextInt();
       int s = sc.nextInt();
       ob.Advance(h,m,s);
       break;
       
case 3: System.out.println("Time to reset from 0");
       int x = sc.nextInt();
       int y = sc.nextInt();
       int z = sc.nextInt();
       ob.Reset(x,y,z);
       break;
default: System.out.println("INVALID ENTRY");
}
ob.Print();
}
}
