package geekForGeek.BinarySearchTree.Misc;

public class RemoveBSToutsideGivenRange {

	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	Node removeEdges(Node root,int min,int max){
		if(root==null){
			return null;
		}
		
		root.left=removeEdges(root.left,min,max);
		root.right=removeEdges(root.right,min,max);
		
		if(root.data<min){
			
			Node rChild=root.right;
			
			return rChild;
			
		}
		
		if(root.data>max){
           Node lChild=root.left;
			
			return lChild;
		}
		
		return root;
		
		
	}
	
	
	void inOrder(Node root){
		
		if(root==null){
			return;
		}
		
		inOrder(root.left);
		System.out.print(" "+root.data);
		inOrder(root.right);
		
	}
	
	public static void main(String[] args) {
		
		
		
		Node root=new Node(6);
		root.left=new Node(-13);
		root.right=new Node(14);
		root.left.right=new Node(-8);
		root.right.left=new Node(13);
		root.right.right=new Node(15);
		root.right.left.left=new Node(7);
		
		
		
		RemoveBSToutsideGivenRange remove=new RemoveBSToutsideGivenRange();
		
		System.out.println("INORDER BEFORE");
		
		remove.inOrder(root);
		
		
		System.out.println();
		
		 root=remove.removeEdges(root,-10,13);
		 System.out.println("INORDER AFTER");
			
			remove.inOrder(root);
			
			
		
		
	}

}
