package geekForGeek.BinarySearchTree;

import java.util.ArrayList;

public class ConstructBSTfrom1toN {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			this.left=this.right=null;
		}
		
		
		void inOrder() {
			if(this == null)
				return;
	 
			if(this.left != null)
				this.left.inOrder();
	 
			System.out.print(this.data + " ");
	 
			if(this.right != null)	
				this.right.inOrder();
		}
	 
		void preOrder() {
			if(this == null)
				return;
	 
			System.out.print(this.data + " ");
	 
			if(this.left != null)
				this.left.preOrder();
	 
			if(this.right != null)	
				this.right.preOrder();
		}
	}
	
	
	
	
	static ArrayList<Node> constructAllPossibleBSTs(int start,int end){
		
		ArrayList<Node> arr =new ArrayList<Node>();
		
		if(start>end){
			arr.add(null);
			return arr;
		}
		
		for(int i=start;i<=end;i++) {
			ArrayList<Node> leftSubTree = constructAllPossibleBSTs(start,i-1);
			ArrayList<Node> rightSubTree = constructAllPossibleBSTs(i+1,end);
 
			for(int j=0;j<leftSubTree.size();j++) {
				Node left = leftSubTree.get(j);
				for(int k=0;k<rightSubTree.size();k++) {
					Node right = rightSubTree.get(k);
					Node root = new Node(i);
					root.left = left;
					root.right = right;
					arr.add(root);
				}
			}
		}
 
		return arr;
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Node> arr = constructAllPossibleBSTs(1,3);
		 
		for(int i=0;i<arr.size();i++) {
			/*System.out.println("inOrder");
			arr.get(i).inOrder();
			System.out.println();*/
 
			System.out.println("preOrder");
			arr.get(i).preOrder();
			System.out.println("\n");
		}
	}
		
		

	

}
