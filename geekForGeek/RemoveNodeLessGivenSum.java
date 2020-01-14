package geekForGeek;

public class RemoveNodeLessGivenSum {

	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}

	
	Node removeNodes(Node root,int res){
		if(root==null){
			return null;
		}
		
		
		
		
		
	root.left=removeNodes(root.left, res-root.data);
	root.right=removeNodes(root.right, res-root.data);
	
    if(root.left==null && root.right==null){ 	
	if(root.data<res){
		
		root=null;
	}
	
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
		
		return;
	}


	public static void main(String[] args) {
		
		
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.left.left=new Node(8);
		root.left.left.right=new Node(9);
		
		
		root.left.left.right.left=new Node(13);
		root.left.left.right.right=new Node(14);
		
		root.left.left.right.right.left=new Node(15);
		
		root.left.right=new Node(5);
		root.left.right.left=new Node(12);
		
		root.right.left=new Node(6);
		root.right.right=new Node(7);

		
		root.right.right.left=new Node(10);
		root.right.right.left.right=new Node(11);
		
		
		RemoveNodeLessGivenSum obj=new RemoveNodeLessGivenSum();
		int k=45;
		int arr[]=new int[30];
		System.out.println("BEFORE ORDER:");
		obj.inOrder(root);
		obj.removeNodes(root,k);
		System.out.println();
		System.out.println("after ORDER:");
		obj.inOrder(root);

		
		

	}

}
