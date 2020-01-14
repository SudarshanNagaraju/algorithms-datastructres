package geekForGeek;

public class Preorder {
	
		static class Node{
	        char data;
	        Node left,right;
	        Node(char data){
	        	this.data=data;
	        	left=right=null;
	        }
			
		}
		
	void preOrder(Node root){
		if(root==null){
			return;
		}
		System.out.println(" "+root.data);
		preOrder(root.left);
		preOrder(root.right);
		return;
	}
		
		
	public static void main(String[] args) {
		
		
		Node root=new Node('A');
		root.left=new Node('B');
		root.right=new Node('C');
		root.right.left=new Node('E');
		root.right.right=new Node('F');
		root.right.right.right=new Node('H');
		root.right.right.right.left=new Node('K');
		root.right.left.left=new Node('G');
		root.right.left.left.left=new Node('I');
		root.right.left.left.right=new Node('J');
		
		Preorder order=new Preorder();
		order.preOrder(root);
		
		
		
		

	}

}
