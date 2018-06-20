import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Day8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub    
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> hm=new HashMap<String,Integer>();
        String arr[]=new String[10];
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            hm.put(name,phone);
           
        }
        
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int i=0 ;
        String line =br.readLine();
        while(line.length()>0){
           
            arr[i]=line;
            
        
            i++;
            line = br.readLine();
        } 
int flag=0;

        Set<String> keys = hm.keySet();
        for(int j=0;j<i;j++)
        {
        for(String key:keys) {
           
           
          
        	   
        	   if(arr[j].equalsIgnoreCase(key))
        	   {
        		   System.out.println(key+"="+hm.get(key));
        		   flag=0;
        		   break;
        	   }
        	   else
        		   flag=1;
        	   
        	   
           }
           if(flag==1)
        	   System.out.println("Not found");
        }
       
       
       
       
        in.close();

	}

}
