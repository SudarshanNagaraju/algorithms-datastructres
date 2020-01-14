package geekForGeek.BinarySearchTree.Misc;

import geekForGeek.BinarySearchTree.Misc.FindNthCatalanNumber.Node;

public class InorderSuccessor {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
		
	}
	
	
	static int findSmallest(Node root){

     Node current =root;

    while(current.left!=null){
    	
	current=current.left;
	
    }
		
		
		
		return current.data;
		
		
		
	}
	
	int findSuccessor(Node root,Node temp){
		if(temp.right!=null){
			return findSmallest(temp.right);
		}
		
		Node succ=null;
		
		
		while(root!=null){
			if(temp.data<root.data){
				succ=root;
				root=root.left;
			}else if(temp.data>root.data){
			
				root=root.right;
			}else{
				break;
			}
			
		}
		
		return succ.data;
	}
	
	public static void main(String[] args) {
		
		
		Node root=new Node(20);
		root.left=new Node(8);
		root.right=new Node(22);
		root.left.left=new Node(4);
		root.left.right=new Node(12);
		root.left.right.left=new Node(10);
		root.left.right.right=new Node(14);
		Node temp=root.left.right.left;
		InorderSuccessor succe=new InorderSuccessor();
		int suc=succe.findSuccessor(root,temp);
		System.out.println("SUCCESSOR "+suc);

	}

}
