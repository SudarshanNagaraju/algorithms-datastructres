package geekForGeek.BinarySearchTree;

public class SubSeqExistsinBST {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	static int index=0;
	static void inOrder(Node root,int[] seq){
		if(root==null){
			return;
		}
		inOrder(root.left,seq);
		System.out.print(" "+root.data);
		
		if(index<seq.length && root.data==seq[index]){
			index++;
			System.out.println("Index"+index);
		}
		
		inOrder(root.right,seq);
		
	}
	public static void main(String[] args) {

		Node root=new Node(5);
		root.left=new Node(2);
		root.left.left=new Node(1);
		root.left.right=new Node(4);
		root.left.right.left=new Node(6);
		root.left.right.right=new Node(8);
		
		root.right=new Node(3);
		
		
		
		int seq[] = {6,4,8,5};
		inOrder(root,seq);
		System.out.println("Index"+index);
		
		if(index==seq.length){
			System.out.println("sequence exists");
		}else{
			System.out.println("sequence Doesn't exists");
		}
		
		
		
		
		
		
	}

}
