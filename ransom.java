package ransom_notes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ransom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		ArrayList<String>ar=new ArrayList<String>();
		ArrayList<String> ar1=new ArrayList<String>();
		 int flag=0;
		 
	        int m = in.nextInt();
	        int n = in.nextInt();
	        String magazine[] = new String[m];
	        for(int magazine_i=0; magazine_i < m; magazine_i++){
	            magazine[magazine_i] = in.next();
	           ar.add(magazine[magazine_i]);
	            
	            
	        }
	        String ransom[] = new String[n];
	        for(int ransom_i=0; ransom_i < n; ransom_i++){
	            ransom[ransom_i] = in.next();
	            ar1.add(ransom[ransom_i]);
	         
	        }
	        
	        for(int i=0;i<ar1.size();i++)
	        {
	        	for(int j=0;j<ar.size();j++)
	        	{
	        		if(ar1.get(i).equals(ar.get(j)))
	        		{
	        			flag=0;
	        			ar.remove(j);
	        			break;
	        		}
	        		else
	        		{
	        			flag=1;
	        		}
	        	}
	        	 if(flag==1)
		 	        {
		 	        	System.out.println("No");
		 	        	break;
		 	        }
	        	
	        	
	        }
	        if(flag==0)
 	        	System.out.println("Yes");
 	     
	       
	        
	

	}

}
