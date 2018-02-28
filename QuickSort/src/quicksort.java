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
		int j=high;
		
		while(i<j)
		{
			while(a[i]<=pivot && i<high)
			{
				
				i=i+1;
			}
			
			while(a[j]>=pivot && j>low)
			{
				j=j-1;
			}
			
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
		Random ran=new Random();
		Scanner sc=new Scanner(System.in);
		float start = 0.0f;
		float end =0.0f;
		System.out.println("take value of n");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("chooice 1.worst case asc 2.avg / best case 3.worst case dsc");
		int ch=sc.nextInt();
		switch(ch) 
		{
		case 1:System.out.println("worst case asc order input");
				for(int i=0;i<n;i++)
				{
					a[i]=i;
					
				}
				break;
		case 2:System.out.println("avg and best case");
				
				for(int i=0;i<n;i++)
				{
					a[i]=ran.nextInt();
				}
				break;
		case 3:System.out.println("worst case dsc order input");
				for(int i=0;i<n;i++)
				{
					a[i]=n-i;
				}
				break;
		}
		
		start =System.nanoTime();
				q.Quicksort(a,0,(n-1));
				end=System.nanoTime();
				
				float time1=start;
				float time2=end;
				float time=end-start;
				System.out.println(" ");
				System.out.println("start= " + (time1/1000000000)+"sec");
				System.out.println("end= "+ (time2/1000000000)+"sec");
				System.out.print("time=");
				System.out.println(time/1000000000+ "sec");
				sc.close();

		

	}

}
