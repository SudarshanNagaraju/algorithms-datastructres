package geekForGeek.BinarySearchTree.Misc;

import geekForGeek.BinarySearchTree.Misc.FindNodewithMinValue.Node;

public class FindNthCatalanNumber {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
		
	}
	static int catalanNumber(int n){
		int res=0;
		if(n<=1){
			return 1;
		}else{
			for(int i=0;i<n;i++){
			res=res+catalanNumber(i)*catalanNumber(n-i-1);
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {

		
		
		for(int i=0;i<10;i++){
			int re=catalanNumber(i);
			
			System.out.print(" "+i+" Catalan is:"+re);
		}

	}

}
