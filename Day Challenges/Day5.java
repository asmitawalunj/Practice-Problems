import java.util.Scanner;

public class day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
		String s=Integer.toBinaryString(n);
		System.out.println(s);
		int count=1,res=1;
		
		String str[]=s.split("0");
		
		for(int i=0; i<str.length;i++)
		{
			
			System.out.println(str[i]);
			int l=str[i].length();
			System.out.println("length is "+l);
			if(l>count)
				count=l;
			
				
				
		}
		System.out.println(count);
	}

}
