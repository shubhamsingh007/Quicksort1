import java.util.*;
public class quicksort 
{
	public void Quicksort(int a[],int low,int high)
	{
		int p;
		if(low<high)
		{
		p=partision(a,low,high);
		Quicksort(a,low,(p-1));
		Quicksort(a,(p+1),high);
		}
		
	}
	
	public int partision(int a[],int low,int high)
	{
		int pivot=a[low];
		int i=low;
		int j=(high+1);
		
		while(i<=j)
		{
			do {
				i=i+1;
			}while(a[i]<=pivot && i<high);
			
			do {
				j=j-1;
			}while(a[j]>=pivot && j>low);
			
			if(i<j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
				
		}
		
		a[low]=a[j];
		a[j]=pivot;
	
	   return j;
	}
	
	

	public static void main(String[] args) 
	{
		quicksort q=new quicksort();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		q.Quicksort(a,0,(n-1));
		
		System.out.println(" the sorted array is=");
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+a[i]);
		}
		sc.close();

	}

}
