package geekForGeek.BinarySearchTree;

import java.util.Vector;

public class ConvertBSTtoMinHeap {

	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	void inorder(Node root,Vector<Integer> arr){
		if(root==null){
			return;
		}
		
		inorder(root.left,arr);
		arr.add(root.data);
		inorder(root.right, arr);
		
		
	}
	int index=0;
	void converToHeap(Node root,Vector<Integer> arr){
		
		if(root==null){
			return;
		}
		
		root.data=arr.get(index);
		
		index++;
		
		converToHeap(root.left, arr);
		converToHeap(root.right, arr);
		
	}
	
	void preOrder(Node root){
		if(root==null){
			return;
		}
		
		System.out.print(" "+root.data);
		preOrder(root.left);
		preOrder(root.right);
		
	}
	
	public static void main(String[] args) {
		
		
		Node root=new Node(4);
		root.left=new Node(2);
		root.right=new Node(6);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		root.right.left=new Node(5);
		root.right.right=new Node(7);
		ConvertBSTtoMinHeap minHeap=new ConvertBSTtoMinHeap();
		minHeap.preOrder(root);
		Vector<Integer> arr=new Vector<Integer>();
		minHeap.inorder(root,arr);
		
		/*for(int i=0;i<arr.size();i++){
			System.out.print(" "+arr.get(i));
		}*/
		
		minHeap.converToHeap(root,arr);
		System.out.println();
		minHeap.preOrder(root);
		
		
		

	}

}
