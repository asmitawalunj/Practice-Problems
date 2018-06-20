package matrix;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class matrix {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] a,int n) {
        int left=0,right=0;
        int res;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    left+=a[i][j];
                }
                if((i+j)==2)
                {
                    right+=a[i][j];
                }
            }
        }
        res=java.lang.Math.abs(left-right);
		return res;
        


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        

       
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        System.out.println(n);
        for (int i = 0; i < n; i++) {
        	System.out.println("Enter");
            String[] aRowItems = scanner.nextLine().split(" ");
          

            for (int j = 0; j < n; j++) {
                int aItem = Integer.parseInt(aRowItems[j]);
                a[i][j] = aItem;
            }
        }

        int result = diagonalDifference(a,n);

       System.out.println(result);

        scanner.close();
    }
}
