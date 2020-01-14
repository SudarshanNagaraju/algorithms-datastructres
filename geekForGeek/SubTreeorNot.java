package geekForGeek;

public class SubTreeorNot {

	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	static boolean identical(Node root,Node root1){
		if(root1==null && root==null){
			return true;
		}
		if(root1==null || root==null){
			return false;
		}
		
		return (root.data==root1.data && identical(root.left, root1.left) && identical(root.right, root1.right));
		
		
	}
	
	boolean subTree(Node root,Node root1){
		if(root==null){
			return false;
		}
		
		
		//best cond
		if(root1==null){
			return true;
		}
		
		if(root.data==root1.data){
			return (identical(root,root1));
			
		}
		
		
		return (subTree(root.left,root1) || subTree(root.right,root1));
		
		
	}
	
	
	public static void main(String[] args) {
		
		Node root=new Node(26);
		root.left=new Node(10);
		root.left.left=new Node(4);
		root.left.right=new Node(6);
		root.left.left.right=new Node(30);
		
		
		
		Node root1=new Node(10);
		root1.left=new Node(5);
		root1.left.right=new Node(30);
		root1.right=new Node(6);
		
		SubTreeorNot subT=new SubTreeorNot();
		
		if(subT.subTree(root, root1)){
			System.out.println("Subtree");
		}else{
			System.out.println("Not Subtree");
		}
		
		
		
		
		
		

	}

}
