/*The first line of input contains an integer T denoting the number of test cases.
Second line contains number of elements in an array 
Third line contains array element*/


//Find Missing element in an array
import java.util.Scanner;

class missing_element {
	public static void main (String[] args) {
		//code
	Scanner sc=new Scanner(System.in);
		int t,n,i,sum,res_sum=0,ans;
		int c[];
		t=sc.nextInt();	//number of test cases
		
		while(t!=0)
		{
			n=sc.nextInt();	//No. of array elements
			c=new int[n];
			sum=n*(n+1)/2;
    		for( i=1;i<n;i++)
    		{
    		    c[i]=sc.nextInt();
    		}
    		
    		for(i=1;i<n;i++)
    		{
    			res_sum+=c[i];
    		}
    		ans=sum-res_sum;
    		System.out.println(ans);
    		t--;
		}
	
		
		
	}
		
	}
