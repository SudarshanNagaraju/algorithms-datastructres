package geekForGeek.BinarySearchTree.Misc;

public class FloorAndCeil {

	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	int ceil(Node root,int input){
		if(root==null){
			return -1;
		}
		
		if(input==root.data){
			return root.data;
		}
		
		if(root.data<input){
			return ceil(root.right,input);
		}
			
			
			
		
		int left=ceil(root.left, input);
				
		return left>=input? left:root.data;
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {

		Node root=new Node(8);
		root.left=new Node(4);
		root.right=new Node(12);
		root.left.left=new Node(2);
		root.left.right=new Node(6);
		root.right.left=new Node(10);
		root.right.right=new Node(14);
		
		FloorAndCeil tre=new FloorAndCeil();
		for(int i=0;i<16;i++){
			System.out.println(i+" "+tre.ceil(root,i));
		}
		
		
		
	}

}
