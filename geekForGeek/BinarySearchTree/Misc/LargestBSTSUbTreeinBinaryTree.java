package geekForGeek.BinarySearchTree.Misc;

public class LargestBSTSUbTreeinBinaryTree {

	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	class Minmax{
		int size;
		boolean is_BST;
		int min;
		int max;
		
		Minmax(){
			size=0;
			min=Integer.MAX_VALUE;
			max=Integer.MIN_VALUE;
			is_BST=true;
		}
		
	}
	
	
	int finLargestSubTree(Node root){
		Minmax min=findSubTree(root);
		
		return min.size;
	}
	
	
	 Minmax findSubTree(Node root){
		if(root==null){
			Minmax m =new Minmax();
			return m;
		}
		
		Minmax leftMinMax=findSubTree(root.left);
		Minmax rightMinMax=findSubTree(root.right);
		
		Minmax m=new Minmax();
		
		if(leftMinMax.is_BST==false || rightMinMax.is_BST==false || (leftMinMax.max>root.data || rightMinMax.min<=root.data) ){
			m.is_BST=false;
			m.size=Math.max(leftMinMax.size, rightMinMax.size);
			return m;
		}

		m.is_BST=true;
		m.size=leftMinMax.size+rightMinMax.size+1;
		m.min=root.left !=null?leftMinMax.min:root.data;
		m.max=root.right !=null?rightMinMax.max:root.data;
		
		
		return m;
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		/*
		Node root=new Node(50);
		root.left=new Node(30);
		root.right=new Node(60);
		
		root.left.left=new Node(5);
		root.left.right=new Node(20);
		
		//root.left.left.left=new Node(45);
		
		root.right.left=new Node(45);
		root.right.right=new Node(70);
		root.right.right.left=new Node(65);
		root.right.right.right=new Node(80);*/
		
		
		Node root = new Node(50);
		root.left = new Node(10);
		root.right = new Node(60);
		root.left.left = new Node(5);
		root.left.right = new Node(20);
		root.right.left = new Node(55);
		root.right.left.left = new Node(45);
		root.right.right = new Node(70);
		root.right.right.left = new Node(65);
		root.right.right.right = new Node(80);
		
		LargestBSTSUbTreeinBinaryTree finLargestSubTree=new LargestBSTSUbTreeinBinaryTree();
		
		int maxSize=finLargestSubTree.finLargestSubTree(root);
		
		System.out.println("Size of BST Subtree:"+maxSize);
		
		

	}

}
