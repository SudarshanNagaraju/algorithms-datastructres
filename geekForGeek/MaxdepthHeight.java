package geekForGeek;

public class MaxdepthHeight {

	static class Node{
		int data;
		Node left,right;
		
		 Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	 int findDepth(Node root) {

		
		if(root==null){
			return 0;
		}
		
		int left =findDepth(root.left);
		int right =findDepth(root.right);
		
		if(left>=right){
			return left+1;
		}else{
			return right+1;
		}
		
	}
	
	
	public static void main(String[] args) {

		MaxdepthHeight max=new MaxdepthHeight();
		Node root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.left.left.left=new Node(6);
		root.left.left.right=new Node(7);
		root.left.left.right.right=new Node(79);
		root.right=new Node(3);
		
		int depth=max.findDepth(root);
		
		System.out.println(depth);
		
	}

}
