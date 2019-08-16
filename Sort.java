import java.util.*;
class Sort {
public static void main (String args[])
{
System.out.println("Enter the size of array");
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
system.out.println("Enter the array elements");
for(i=0;i<n;i++)
a[i]=sc.nextInt();
for(i=0;i<n-1;i++)
	{
	for(j=i+1;j<n;j++)
	{
	if(a[i]>a[j])
	{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
		}		
		}
	System.out.println("The sorted array is:");
	for(i=0;i<n;i++)
	System.out.print(a[i]+" ");
		}

