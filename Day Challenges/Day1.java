import java.util.ArrayList;
import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int T;
        T=sc.nextInt();
        String str[]=new String[T];
        ArrayList ar=new ArrayList();
        ArrayList ar1=new ArrayList();
        
        for(int i=0;i<T;i++)
        {
            str[i]=sc.next();
        }
        for(int i=0;i<T;i++)
        {
            for(int j=0;j<str[i].length();j++)
            {
                if(j%2==0)
                {
                    ar.add(str[i].charAt(j));
                }
                else
                	ar1.add(str[i].charAt(j));
                
            }
            for(int k=0;k<ar.size();k++)
            {
            	System.out.print(ar.get(k));
            }
            System.out.print(" ");
            for(int k=0;k<ar1.size();k++)
            {
            	System.out.print(ar1.get(k));
            }
            ar.clear();
            ar1.clear();
            System.out.print("\n");
            
            
        }

	}

}
