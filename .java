import java.util.*;
import java.lang.*;
import java.io.*;

class Hello 
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0)
		{
		    int flag=0;
		    n--;
		    int size=sc.nextInt();
		    int ar[]=new int[size];
		    for(int i=0;i<ar.length;i++)
		    {
		        ar[i]=sc.nextInt();
		    }
		    int br[]=new int[size];
		    for(int i=0;i<size;i++)
		    {
		        br[i]=(ar[i]*ar[i]);
		    }
		    Arrays.sort(br);
		    int t=0;
		    HashSet<Integer> hs=new HashSet<Integer>();
		    for(int i=0;i<size;i++)
		    {
		        hs.add(br[i]);
		    }
		    
		    label: for(int i=0;i<size;i++)
		    {
		        for(int j=i+1;j<size;j++)
		        {
		        t=br[i]+br[j];
		        if(hs.contains(t))
		        {
		                System.out.print("Yes");
		                flag=1;
		                break label;
		            
		        }
		        t=0;
		        }
		    }
		    if(flag==0)
		    {
		        System.out.print("No");
		    }
		    System.out.println();
		}
	}
}
