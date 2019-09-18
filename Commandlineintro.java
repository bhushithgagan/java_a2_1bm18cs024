import java.util.*;
class Commandlineintro {
public static void main (String args[]){
int a[] = new int[args.length];
int sum=0;
int large = a[0];
for(int i = 0;i < args.length ; i++)
{
if (a[i]>large)
large = a[i];
sum = sum + Integer.parseInt(args[i]);
}
System.out.println(sum);
}
}

