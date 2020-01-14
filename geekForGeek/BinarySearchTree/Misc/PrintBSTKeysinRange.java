package geekForGeek.BinarySearchTree.Misc;

public class PrintBSTKeysinRange {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	void printRange(Node root,int start,int end){
		if(root==null){
			return;
		}
		
		printRange(root.left,start,end);
		
		if(root.data>=start  && root.data<=end){
			System.out.print(" "+root.data);
		}
		
		printRange(root.right, start, end);
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		Node root=new Node(20);
		root.left=new Node(8);
		root.right=new Node(22);
		root.left.left=new Node(4);
		root.left.right=new Node(12);
		
		
		PrintBSTKeysinRange range=new PrintBSTKeysinRange();
		
		range.printRange(root, 10, 22);
		
		
		
		
		
		
		

	}

}
