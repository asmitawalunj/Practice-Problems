package balanced_Brackets;

import java.awt.Checkbox;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class balanced_brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//ArrayList<>
		int num;
		
		num=sc.nextInt();
		String brac = "";
		
		for(int i=0;i<num;i++)
		{
			String a;
			a=sc.next();
			
			
			
		}
		int i=0;
		while(i<num)
		{
			
			String st[]=brac.split("\\s+");
			
			boolean b=check(st[i]);
			i++;
		}
			

	}
	
	public static boolean check(String brac)
	{
		Stack s=new Stack();
		for(int i=0;i<brac.length();i++)
		{
			if(brac.charAt(i)=='{'||brac.charAt(i)=='['||brac.charAt(i)=='(')
			{
				
				s.push(brac.charAt(i));
			}
			else if((brac.charAt(i)=='}'||brac.charAt(i)==']'||brac.charAt(i)==')'))
			{
				char p;
				if(s.isEmpty())
				{
					return false;
				}
				p=(char) s.pop();
				
					if(p=='{'&& brac.charAt(i)!='}')
					{
						System.out.println("NO");
						return false;
					}
					if(p=='['&& brac.charAt(i)!=']')
					{
						System.out.println("NO");
						return false;
					}
					if(p=='('&& brac.charAt(i)!=')')
					{
						System.out.println("NO");
						return false;
					}
				
				
				
			}
			
		}
		if(s.isEmpty())
		{
			System.out.println("YES");
			return true;
			
		}
		return false;
		
		
	}

}
