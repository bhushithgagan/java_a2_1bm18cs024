import java.util.*;
class Max {
public static void main (String args[])
{
System.out.println("Enter the row size and column");
Scanner sc = new Scanner (System.in);
int r = sc.nextInt();
int c = sc.nextInt();
System.out.println("Enter the array elements");
int a[][] = new int[r][c];
int large = 0;
for (int i=0;i<r;i++)
{
for (int j=0;j<c;j++)
a[i][j] = sc.nextInt();
}
for(int ar[]:a)
{
for(int x:ar)
 {
  if(x>large)
  large=x;
 }
}
System.out.println("Largest element in the entered 2D Array is:" + " " + large);
}
} 

