package geekForGeek.BinarySearchTree.Misc;

public class AddGreaterValuestoEveryNode {

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
	static class  Sum{
		
		int sum=0;
	}
	void createGreater(Node root,Sum sum){
		if(root==null){
			return;
		}
		
		createGreater(root.right,sum);
		sum.sum=sum.sum+root.data;
		root.data=sum.sum;
		createGreater(root.left,sum);
		
		
	}
	
	public static void main(String[] args) {
		
		Node root=new Node(50);
		root.left=new Node(30);
		root.right=new Node(70);
		root.left.left=new Node(20);
		root.left.right=new Node(40);
		root.right.left=new Node(60);
		root.right.right=new Node(80);
		
		System.out.println("INORDER BEFORE");
		AddGreaterValuestoEveryNode greater=new AddGreaterValuestoEveryNode();
		
		greater.inOrder(root);
		
		
		System.out.println();
		
		Sum sum=new Sum();
		greater.createGreater(root,sum);
		
		System.out.println("AFter");
        greater.inOrder(root);
		
		
		System.out.println();
		

	}

}
