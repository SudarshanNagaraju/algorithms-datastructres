package com.sixdee.test.datastructures.string;

public class LongestSubsequence {

	
	
	int maxSubsequenceString(char[] x,char[] y,int m,int n) {
		
		int dp[][]=new int[1000][1000];
		
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				
				dp[i][j]=0;
				
			}
			
		}
		
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				
				
				if(x[i-1]==y[j-1]) {
					
					dp[i][j]=1+dp[i-1][j-1];
					
				}else {
					dp[i][j]=dp[i][j-1];
				}
				
			}
			
		}
		
		
		int ans=0;
		for(int i=0;i<=m;i++) {
			ans=Math.max(ans, dp[i][m]);
		}
		
		return ans;
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		String str="C2C";
		
		for(int i=0;i<str.length();i++) {
			
			Character c=str.charAt(i);
			
			if(c>='0' && c<='9') {
				System.out.print("Int"+c);
			}else {
				System.out.print("char"+c);
			}
			
		}
		
		
		/*
		char[] x="ABCD".toCharArray();
		char[] y="BACDBDCD".toCharArray();
		
		int m=x.length;
		int n=y.length;
		
		
		LongestSubsequence sub=new LongestSubsequence();
		
		System.out.println("ans:"+sub.maxSubsequenceString(x,y,m,n));*/
				
		
		
		
		
		

	}

}
