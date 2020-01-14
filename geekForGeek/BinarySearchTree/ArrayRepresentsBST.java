package com.sixdee.test.geekForGeek.BinarySearchTree;

public class ArrayRepresentsBST {

	static class  Node {
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	static boolean isInorder(int[] arr,int n){
		if(n==1 && n==0){
			return true;
		}
		
		for(int i=0;i<n-1;i++){
			if(arr[i]>arr[i+1]){
				return false;
			}
		}
		
		return true;
		
		
	}
	
	
	public static void main(String[] args) {
		

		int arr[]={19, 23, 25, 30, 45};
		
		if(isInorder(arr,arr.length)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		
		
		

	}

}
