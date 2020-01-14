package geekForGeek;

import geekForGeek.SubTreeorNot.Node;

public class SumTree {

	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
		}
	}
	
	int calculateSum(Node root){
		if(root==null){
			return 0;
		}
		
			return (root.data+calculateSum(root.left)+calculateSum(root.right));
		
	}
	
	int sum(Node root){
		int ls,rs;
		if((root==null) ||(root.left==null && root.right==null)){
			return 1;
		}
		
		 ls=calculateSum(root.left);
		 rs=calculateSum(root.right);
		
		
		if ((root.data==ls+rs) && sum(root.left)!=0 && sum(root.right)!=0){
			return 1;
		}
		return 0;
		
		
		
		
	}
	
	
	
	public static void main(String args[]){
		
		Node root=new Node(26);
        root.left = new Node(10);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.right = new Node(3);
		
		SumTree sumTree=new SumTree();
		
		if(sumTree.sum(root)!=0){
			System.out.println("SUM TREE");
		}else{
			System.out.println("NOT SUM TREE");
		}
		
		
	}
	
	
	
}
