package com.sixdee.test.Adobe;


public class BinaryTreeisSumTree {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
			
		}
	}
	
	static int sum(Node node) {
		if(node==null) {
			return 0;
		}
		
		return sum(node.left)+node.data+sum(node.right);
		
	}
	
	static boolean checkSumtree(Node node) {
		
		if(node==null || (node.left==null && node.right==null)) {
			return true;
		}
		
		int ls=sum(node.left);
		int rs=sum(node.right);
		
		
		return node.data==ls+rs?true:false;
		
	}
	
	public static void main(String[] args) {

		
		Node root=new Node(26);
		root.left=new Node(11);
		root.right=new Node(3);
		
		root.left.left=new Node(4);
		root.left.right=new Node(6);
		root.right.right=new Node(3);
		
		System.out.println(checkSumtree(root));
		

	}

}
