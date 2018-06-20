import java.util.Scanner;

public class sparse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1,str2;
		int count=0;
		
		
		int asize,qsize;
		asize=sc.nextInt();
		String array[]=new String[asize];
		for(int i=0;i<asize;i++)
		{
			str1=sc.next();
			array[i]=str1;
			
		}
		
	qsize=sc.nextInt();
	
	String query[]=new String[qsize];
		for(int i=0;i<qsize;i++)
		{
			str2=sc.next();
			query[i]=str2;
			
		}
		for(int i=0;i<qsize;i++)
		{
			System.out.println(query[i]);
			count=0;
			for(int j=0;j<asize;j++)
			{
				if(query[i].equalsIgnoreCase(array[j]))
				{
					
					count++;
				}
			}
			System.out.println("Count is "+count);
		}
	}

}
