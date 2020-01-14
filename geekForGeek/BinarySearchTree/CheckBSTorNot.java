package geekForGeek.BinarySearchTree;

public class CheckBSTorNot {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	static boolean checkBST(Node root,Node l,Node r){
		if(root == null){
			return true;
		}
		
		if(l!=null && root.data<l.data){
			return false;
		}
		
		if(r!=null && root.data>r.data){
			return false;
		}
		
		return (checkBST(root.left,l,root) && checkBST(root.right,root,r));
		
		
	}
	
	public static void main(String[] args) {
		
		Node root=new Node(4);
		root.left=new Node(7);
		root.right=new Node(5);
		
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		
		if(checkBST(root,null,null)){
			System.out.println("Tree is BST");
		}else{
			System.out.println("Tree is not BST");
		}
		
		

	}

}
