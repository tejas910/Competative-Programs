package ObjectAndClasses;
import java.util.*;

public class SampleClass {
	
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in); 
		String X = sc.next();
		String Y = sc.next();
		int m=X.length();
	    int n=Y.length();
	    System.out.println(LCSubStr(X,Y,m,n));

	}
	 static int LCSubStr(String s,String t,
             int n,int m)
	 	{ 

		 int dp[][]=new int[2][m+1];
		 int res=0;

		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=m;j++)
			 	{
				 if(s.charAt(i-1)==t.charAt(j-1))
				 {
					 dp[i%2][j]=dp[(i-1)%2][j-1]+1;
					 if(dp[i%2][j]>res)
				     res=dp[i%2][j];
				 }
				 else dp[i%2][j]=0;
			 	}
		 }
		 return res;
	 	}
}

