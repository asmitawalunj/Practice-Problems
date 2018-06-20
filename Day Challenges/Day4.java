import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class day9 {
	 static int factorial(int n) {
		 if(n==1 || n==0)
		     return n;
		         
		     else
		         return n*factorial(n-1);

		     }

		     private static final Scanner scanner = new Scanner(System.in);

		     public static void main(String[] args) throws IOException {

		         int n = scanner.nextInt();

		         int result = factorial(n);

		       System.out.println(result);

		         scanner.close();
		     }
}
