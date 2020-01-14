package geekForGeek;

import geekForGeek.MaxwidthofTree.Node;

public class DoubleTree {

	
	static class Node{
		int data;
		Node left,right;
		
		
		Node(int data){
			this.data=data;
			left=right=null;
		}
		
	}
	
	void inOrder(Node root){
		if(root==null){
			return;
		}
		
		inOrder(root.left);
		System.out.print(" "+root.data);
		inOrder(root.right);
		
	}
	
	
	void doubleTree(Node root){
		
		
		if(root==null){
			return;
		}
		
		doubleTree(root.left);
		doubleTree(root.right);
		
		Node oldLeft=root.left;
		root.left=new Node(root.data);
		root.left.left=oldLeft;
		
		
		
	}
	
	public static void main(String[] args) {
		Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        
        
        DoubleTree ent=new DoubleTree();
        System.out.println("OLD INORDER TREE");
        ent.inOrder(root);
        ent.doubleTree(root);
        System.out.println();
        System.out.println("NEW INORDER TREE");
        ent.inOrder(root);
        
        
	}

}
