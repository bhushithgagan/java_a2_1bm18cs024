import java.util.*;
class Mat {
public static void main (String args[])
{
System.out.println("Enter the size of row and column for 1st matrix");
Scanner sc=new Scanner(System.in);
int r1 = sc.nextInt();
int c1 = sc.nextInt();
System.out.println("Enter the size of row and column for 2nd matrix");
int r2 = sc.nextInt();
int c2 = sc.nextInt();
if (r1==r2 && c1==c2)
{
int i=0;
int j=0;
System.out.println("Enter the elements of matrix 1");
int a[][] = new int[r1][c1];
int b[][] = new int[r2][c2];
int t[][] = new int[r1][c1];
int t1[][] = new int[r1][c1];
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
a[i][j] = sc.nextInt();
}
System.out.println("Enter the elements of 2nd matrix");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
b[i][j] = sc.nextInt();
}
System.out.println("Sum of matrices is\n");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
t[i][j] = a[i][j] + b[i][j];
System.out.println(t[i][j]);
}
}
System.out.println("Difference of matrices is\n");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
t1[i][j] = a[i][j] - b[i][j];
System.out.println(t1[i][j]);
}
}
}
else System.out.println("Invalid entry\n");
}
}


