import java.util.*;
class Largecomm {
public static void main (String args[]){
int large = 0;
for(int i = 0;i < args.length ; i++)
{
if (Integer.parseInt(args[i])>large)
{
large = Integer.parseInt(args[i]);
}
}
System.out.println("Largest number is :" + " " + large);
}
}

