import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class anagrams {
    public static int numberNeeded(String first, String second) {
        Queue q1=new LinkedList();
        Queue q2=new LinkedList();
        int flag=0,count=0;
        
       for(int i=0;i<first.length();i++)
       {
    	   q1.add(first.charAt(i));
       }
       for(int i=0;i<second.length();i++)
       {
    	   q2.add(second.charAt(i));
       }
       
      for(Object a:q1)
      {
    	  flag=0;
    	  for(Object b:q2)
    	  {
    		  
	    	flag=0;
	    	  if(a.equals(b))
	    	  {
	    		  flag=1;
	    		  q2.remove(b);
	    		  break;
	    	  }
    	  }
    	  if(flag==0)
          {
        	  count++;
        	  
        	
          }
      }
        
		return count;
      }
     
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int c1=numberNeeded(a, b);
        int c2=numberNeeded(b, a);
        int c3=c1+c2;
        System.out.println(c3);
    }
}
