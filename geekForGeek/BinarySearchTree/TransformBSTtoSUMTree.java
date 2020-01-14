package geekForGeek.BinarySearchTree;

public class TransformBSTtoSUMTree {

	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	int sum=0;
	void createSum(Node root){
		
		
		if(root==null){
			return ;
		}
		
		createSum(root.right);
		System.out.print(" "+root.data);
		System.out.print(":"+sum);
		
		sum=sum+root.data;
		root.data=sum-root.data;
		createSum(root.left);
		
	}
	
	void inOrder(Node root){
		if (root==null){
			return;
		}
		
		inOrder(root.left);
		System.out.print(" "+root.data);
		inOrder(root.right);
	}
	
	void findSUm(Node root){
		
		
		createSum(root);
		System.out.println("Inorder");
		inOrder(root);
		
	}
	
	
	public static void main(String[] args) {
		
		
		Node root=new Node(11);
		root.left=new Node(2);
		root.right=new Node(29);
		root.left.left=new Node(1);
		root.left.right=new Node(7);
		
		root.right.left=new Node(15);
		root.right.right=new Node(40);
		root.right.right.left=new Node(35);
		
		TransformBSTtoSUMTree trans=new TransformBSTtoSUMTree();
		
		trans.findSUm(root);
		
		
		

	}

}
