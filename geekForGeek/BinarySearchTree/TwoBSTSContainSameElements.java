package geekForGeek.BinarySearchTree;

import java.util.HashSet;

public class TwoBSTSContainSameElements {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	static void  checkElements(Node root,HashSet<Integer> hash){
	
		if(root==null){
			return;
		}
		
		checkElements(root.left, hash);
		hash.add(root.data);
		checkElements(root.right, hash);
		
		
		
	}
	
	static boolean findEqual(Node root1,Node root2,HashSet<Integer> hash1,HashSet<Integer> hash2){
		
		if(root1==null || root2==null){
			return false;
		}
		
		checkElements(root1,hash1);
		checkElements(root2,hash2);
		
		
		for(int i:hash1){
			System.out.print(" "+i);
		}
		
		System.out.println();
		for(int i:hash2){
			System.out.print(" "+i);
		}
		
		return(hash1.equals(hash2));
		
		
	}
	
	
	public static void main(String[] args) {

		
		Node root1=new Node(15);
		root1.left=new Node(10);
		root1.right=new Node(20);
		root1.left.left=new Node(5);
		root1.left.right=new Node(12);
		root1.right.right=new Node(25);
		
		
		Node root2=new Node(15);
		root2.left=new Node(12);
		root2.right=new Node(20);
		root2.left.left=new Node(5);
		root2.left.left.right=new Node(10);
		root2.right.right=new Node(25);
		
		
		HashSet<Integer> hash1=new HashSet<Integer>();
		HashSet<Integer> hash2=new HashSet<Integer>();
		
		if(findEqual(root1,root2,hash1,hash2)){
			System.out.println("TRUE");
		}else{
			System.out.println("FALSE");
		}
		
		
		
		
	}

}
