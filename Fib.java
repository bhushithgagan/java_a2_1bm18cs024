import java.util.*;
class Fib {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n");
int n = sc.nextInt();
int a = 0;
int b = 1;
int c;
System.out.println(" ");
System.out.println(a+"\n"+b);
for(int i =2; i<=n;i++)
{
c = a + b;
a = b;
b = c;
System.out.println(c);
}
}
}
