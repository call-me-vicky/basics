package basics;

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void primeDiff(int x,int y)
    {
        int max=0;
        int min=0;
		int k;
        if(x==y)
            {
                System.out.println(0);
                return;
            }

        for(k=x;k<=y;k++)
        {
            if(isPrime(k)==true)
            {
                if(min==0)
                    min=k;
            }
        }
        max=k;
        
        if(min!=0 || max!=0)
        {
            System.out.println(max-min);
            return;
        }
        System.out.println(-1);
        return;
        
    }
    public static boolean isPrime(int n)
    {
        int count=1;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                count++;
        }

        return count==2;
    }
    public static void main(String args[] ) throws Exception {

    	Scanner sc = new Scanner(System.in);
        int samples = sc.nextInt();
        for(int i=0;i<=samples;i++)
        {
            int l = sc.nextInt();
            int r = sc.nextInt();

            primeDiff(l,r);
        }

   }
}
