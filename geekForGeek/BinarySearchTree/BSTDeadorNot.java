package geekForGeek.BinarySearchTree;

import java.util.HashSet;

public class BSTDeadorNot {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	void storeNodes(Node root,HashSet<Integer> allNodes,HashSet<Integer> leafNodes){
		if(root==null){
			return;
		}
		
		allNodes.add(root.data);
		
		if(root.left==null && root.right==null){
			leafNodes.add(root.data);
		}
		
		storeNodes(root.left, allNodes, leafNodes);
		storeNodes(root.right, allNodes, leafNodes);
		
		
		
		
	}
	
	
	boolean checkBSTDEAD(Node root){
		
		
		if(root==null){
			return false;
		}
		
		
		HashSet<Integer> allNodes=new HashSet<Integer>();
		HashSet<Integer> leafNodes=new HashSet<Integer>();
		
		
		storeNodes(root,allNodes,leafNodes);
		
		for(int i:leafNodes){
 
			int x=i;
			
			if(allNodes.contains(x+1) && allNodes.contains(x-1)){
				return true;
			}
			
			
		}
		
		return false;
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Node root=new Node(8);
		root.left=new Node(5);
		root.right=new Node(11);
		root.left.left=new Node(2);
		root.left.right=new Node(7);
		root.left.left.right=new Node(3);
		root.left.left.right.right=new Node(4);
		
		
		BSTDeadorNot dead=new BSTDeadorNot();
		
		if(dead.checkBSTDEAD(root)){
			System.out.println("Is DEAD");
		}else{
			System.out.println("Not Dead");
		}
		
		
		

	}

}
