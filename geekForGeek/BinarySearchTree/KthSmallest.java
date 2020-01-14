package geekForGeek.BinarySearchTree;

public class KthSmallest {

	static class Node{
		
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	int count=0;
	static int getCount(Node root){
		if(root==null){
			return 0;
		}
		
		return 1+getCount(root.left)+getCount(root.right);
	}
	
	Node Kthsmallest(Node root,int k){
		
		
		int leftCount=getCount(root.left);
		
		//System.out.println("Left Node count:"+leftCount);
		
		if(leftCount+1==k){
			return root;
		}else if(leftCount+1>k){
			return Kthsmallest(root.left,k);
		}else{
			return Kthsmallest(root.right,k-(leftCount+1));
		}
		
	}
	
	
	public static void main(String[] args) {

		
		Node root=new Node(20);
		root.left=new Node(8);
		root.right=new Node(22);
		root.left.left=new Node(4);
		root.left.right=new Node(12);
		root.left.right.left=new Node(10);
		root.left.right.right=new Node(14);
		
		KthSmallest kth =new KthSmallest();
		Node res=kth.Kthsmallest(root,5);
		
		System.out.println("Kth smallest:"+res.data);
		
		

	}

}
