package geekForGeek;

public class SizeofTree {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	static int count=0;
	
	void sixeTree(Node root){
		
		if(root==null){
			return;
		}else if(root!=null){
			count++;
		}
		
		
		sixeTree(root.left);
		sixeTree(root.right);
		
	}
	
	
	public static void main(String[] args) {

		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		
		SizeofTree size=new SizeofTree();
		
		size.sixeTree(root);
		
		System.out.println("Size:"+count);
		
		
		
		

	}

}
