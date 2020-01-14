package geekForGeek.BinarySearchTree;

public class LargestNumberLessthanNinBST {

	
	static class Node{
		int data;
		Node left,right;
		Node (int data){
			this.data=data;
			left=right=null;
		}
		
	}
	
	int val=0;
	void largestLessthanorEqualthanN(Node root,int N){
		
		if(root==null){
			return ;
		}
		
		largestLessthanorEqualthanN(root.left,N);
		if(root.data<=N){
			val=root.data;
		}
		largestLessthanorEqualthanN(root.right,N);
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		Node root=new Node(5);
		root.left=new Node(2);
		root.right=new Node(12);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		root.right.left=new Node(9);
		root.right.right=new Node(21);
		root.right.right.left=new Node(19);
		root.right.right.right=new Node(25);
		LargestNumberLessthanNinBST largest=new LargestNumberLessthanNinBST();
		largest.largestLessthanorEqualthanN(root,4);
		
		System.out.println("Res:"+largest.val);

	}

}
