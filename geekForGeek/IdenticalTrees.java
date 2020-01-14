package geekForGeek;

import geekForGeek.DeleteTree.Node;

public class IdenticalTrees {

	
	static class Node{
		int data;
		Node left, right;
		
		Node(int data){
			this.data=data;
			left=right=null;
		}
		
	}
	
	
	int identicalTree(Node root,Node root1){
		int rootMatch=0;
		if(root==null && root1==null){
			return 1;
		}
		if(root.data==root1.data){
			rootMatch=1;
		}
		
		if(rootMatch!=1){
			return 0;
		}
		
		int left=identicalTree(root.left,root1.left);
		int right=identicalTree(root.right,root1.right);
		
		if(left==1 && right==1){
			return 1;
		}else{
			return 0;
		}
		
		
	}
	
	
	public static void main(String[] args) {
               
		IdenticalTrees idee=new IdenticalTrees();
		
		Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);
        
        Node root1 = new Node(8);
        root1.left = new Node(3);
        root1.right = new Node(10);
        root1.left.left = new Node(1);
        root1.left.right = new Node(6);
        root1.right.right = new Node(14);
        root1.right.right.left = new Node(13);
        root1.left.right.left = new Node(4);
        root1.left.right.right = new Node(7);
        
        
       int identicalOrnot= idee.identicalTree(root,root1);
       
       if(identicalOrnot==1){
    	   System.out.println("Identical");
       }else if(identicalOrnot==0){
    	   System.out.println("Not Identical");
       }

		
		
		
		
	}

}
